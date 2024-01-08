package tlc.analyzer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

import org.antlr.runtime.tree.CommonTree;

import tlc.antlr.WhileParser;
import tlc.projet.App;
import tlc.util.FunctionStack;
import tlc.util.Visitor;

public class Analyzer {
  private Visitor visitor;
  private List<FunctionStack> functionsStacks;

  public Analyzer() {
    this.functionsStacks = new ArrayList<>();
    this.initVisitor();
  }

  public void analyze(CommonTree tree) {
    if (tree.getType() == 0) {
      int count = tree.getChildCount();
      for (int i = 0; i < count; i++) {
        visitor.visit((CommonTree) tree.getChild(i));
      }
    } else {
      visitor.visit(tree);
    }
    boolean programValid = isValid();
    if (!programValid) {

    }
  }

  public boolean isValid() {
    HashSet<String> functionsNames = new HashSet<>();
    boolean valid = true;
    for (FunctionStack stack : functionsStacks) {
      String functionName = stack.getFunctionName();
      if (functionsNames.contains(functionName)) {
        valid = false;
        App.logger.error(
            "Function " + stack.getFunctionName() + " at line " + stack.getFunctionLine() + " is already defined.");
      } else {
        functionsNames.add(functionName);
      }
    }
    return valid;
  }

  private void initVisitor() {
    this.visitor = new Visitor();

    // Visitor Lambdas
    Consumer<CommonTree> l_function = (CommonTree t) -> {
      String function_name = t.getChild(0).getText();
      this.functionsStacks.add(new FunctionStack(function_name, t.getChild(0).getLine()));
      CommonTree definition = (CommonTree) t.getChild(1);
      visitor.visit(definition);
    };

    Consumer<CommonTree> l_definition = (CommonTree t) -> {
      CommonTree input = (CommonTree) t.getChild(0);
      CommonTree commands = (CommonTree) t.getChild(1);
      CommonTree output = (CommonTree) t.getChild(2);
      visitor.visit(input);
      visitor.visit(commands);
      visitor.visit(output);
    };

    Consumer<CommonTree> l_input = (CommonTree t) -> {
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        CommonTree symbol_tree = (CommonTree) t.getChild(i);
        this.functionsStacks.get(this.functionsStacks.size() - 1).addParameter(symbol_tree.getText());
      }
    };

    Consumer<CommonTree> l_commands = (CommonTree t) -> {
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        visitor.visit((CommonTree) t.getChild(i));
      }
    };

    Consumer<CommonTree> l_assign = (CommonTree t) -> {
      CommonTree symbol_tree = (CommonTree) t.getChild(0);
      String symbol = symbol_tree.getText();
      this.functionsStacks.get(this.functionsStacks.size() - 1).addSymbol(symbol, symbol_tree.getLine());
      CommonTree expression = (CommonTree) t.getChild(1);
      visitor.visit(expression);
    };

    Consumer<CommonTree> l_expr = (CommonTree t) -> {
      CommonTree expression = (CommonTree) t.getChild(0);
      visitor.visit(expression);
    };

    Consumer<CommonTree> l_nil = (CommonTree t) -> {
    };

    Consumer<CommonTree> l_output = (CommonTree t) -> {
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        CommonTree symbol_tree = (CommonTree) t.getChild(i);
        this.functionsStacks.get(this.functionsStacks.size() - 1).addReturn(symbol_tree.getText());

      }
    };

    Consumer<CommonTree> l_if = (CommonTree t) -> {
      CommonTree expr = (CommonTree) t.getChild(0);
      CommonTree commandsIf = (CommonTree) t.getChild(1);
      visitor.visit(expr);
      visitor.visit(commandsIf);
      if(t.getChildCount() > 1){
        CommonTree commandsElse = (CommonTree) t.getChild(2);
        visitor.visit(commandsElse);
      }
    };

    // Assign lambdas to tokens
    visitor.assign(WhileParser.FUNCTION, l_function);
    visitor.assign(WhileParser.DEFINITION, l_definition);
    visitor.assign(WhileParser.INPUT, l_input);
    visitor.assign(WhileParser.COMMANDS, l_commands);
    visitor.assign(WhileParser.ASSIGN, l_assign);
    visitor.assign(WhileParser.EXPR, l_expr);
    visitor.assign(WhileParser.OUTPUT, l_output);
    visitor.assign(WhileParser.T__41, l_nil);
    visitor.assign(WhileParser.IF, l_if);
  }

  public List<FunctionStack> getFunctionsStacks() {
    return functionsStacks;
  }
}
