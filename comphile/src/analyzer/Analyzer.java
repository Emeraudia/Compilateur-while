package analyzer;

import java.net.CookieManager;
import java.util.function.Consumer;

import org.antlr.runtime.tree.CommonTree;

import antlr.WhileParser;
import util.SpaghettiNode;
import util.Visitor;

public class Analyzer {
  private Visitor visitor;
  private SpaghettiNode stack;

  public Analyzer() {
    this.initVisitor();
    this.stack = new SpaghettiNode(null, -1);
  }

  public void analyze(CommonTree tree) {
    this.visitor.visit(tree);
    System.out.println(tree.toStringTree());
  }

  private void initVisitor() {
    this.visitor = new Visitor();

    // Visitor Lambdas
    Consumer<CommonTree> l_function = (CommonTree t) -> {
      String function_name = t.getChild(0).getText();
      System.out.println("Function " + function_name);
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
