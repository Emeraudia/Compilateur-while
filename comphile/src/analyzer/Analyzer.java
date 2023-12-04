package analyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.antlr.runtime.tree.CommonTree;

import antlr.WhileParser;
import util.Stack;
import util.Visitor;

public class Analyzer {
  private Visitor visitor;
  private List<Stack> functionsStacks;

  public Analyzer() {
    this.functionsStacks = new ArrayList<>();
    this.initVisitor();
  }

  public void analyze(CommonTree tree) {
    int count = tree.getChildCount();
    for (int i = 0; i < count; i++) {
      visitor.visit((CommonTree) tree.getChild(i));
    }
    System.out.println(tree.toStringTree());
    System.out.println(functionsStacks);
  }

  private void initVisitor() {
    this.visitor = new Visitor();

    // Visitor Lambdas
    Consumer<CommonTree> l_function = (CommonTree t) -> {
      String function_name = t.getChild(0).getText();
      System.out.println("Function " + function_name);
      this.functionsStacks.add(new Stack());
      CommonTree definition = (CommonTree) t.getChild(1);
      visitor.visit(definition);
    };

    Consumer<CommonTree> l_definition = (CommonTree t) -> {
      System.out.println("Definition");
      CommonTree input = (CommonTree) t.getChild(0);
      CommonTree commands = (CommonTree) t.getChild(1);
      CommonTree output = (CommonTree) t.getChild(2);
      visitor.visit(input);
      visitor.visit(commands);
      visitor.visit(output);
    };

    Consumer<CommonTree> l_input = (CommonTree t) -> {
      System.out.println("Input");
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        CommonTree symbol_tree = (CommonTree) t.getChild(i);
        this.functionsStacks.get(this.functionsStacks.size() - 1).addSymbol(symbol_tree.getText(),
            symbol_tree.getLine());
        System.out.println(symbol_tree.getLine() + " " + t.getChild(i).getText());
      }
    };

    Consumer<CommonTree> l_commands = (CommonTree t) -> {
      System.out.println("Commands");
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        visitor.visit((CommonTree) t.getChild(i));
      }
    };

    Consumer<CommonTree> l_assign = (CommonTree t) -> {
      CommonTree symbol_tree = (CommonTree) t.getChild(0);
      System.out.println(symbol_tree.getLine());
      String symbol = symbol_tree.getText();

      System.out.println("Assign " + symbol);
      this.functionsStacks.get(this.functionsStacks.size() - 1).addSymbol(symbol, symbol_tree.getLine());
      CommonTree expression = (CommonTree) t.getChild(1);
      visitor.visit(expression);
    };

    Consumer<CommonTree> l_expr = (CommonTree t) -> {
      System.out.println("Expr");
      CommonTree expression = (CommonTree) t.getChild(0);
      visitor.visit(expression);
    };

    Consumer<CommonTree> l_nil = (CommonTree t) -> {
      System.out.println("nil");
    };

    Consumer<CommonTree> l_output = (CommonTree t) -> {
      System.out.println("Output");
      int count = t.getChildCount();
      for (int i = 0; i < count; i++) {
        System.out.println(t.getChild(i).getText());
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

  }

}
