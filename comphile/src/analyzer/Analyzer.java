package analyzer;

import java.util.function.Consumer;

import org.antlr.runtime.tree.CommonTree;

import antlr.WhileParser;
import util.Visitor;

public class Analyzer {
  private Visitor visitor;

  public Analyzer() {
    this.initVisitor();
  }

  public void analyze(CommonTree tree) {
    this.visitor.visit(tree);
  }

  private void initVisitor() {
    this.visitor = new Visitor();

    // Visitor Lambdas
    Consumer<CommonTree> function_lambda = (CommonTree t) -> {
      String function_name = t.getChild(0).getText();
      System.out.println("Function " + function_name);
      CommonTree definition = (CommonTree) t.getChild(1);
      visitor.visit(definition);
    };

    Consumer<CommonTree> function_definition_lambda = (CommonTree t) -> {
      System.out.println("Definition");
      CommonTree input = (CommonTree) t.getChild(0);
      CommonTree commands = (CommonTree) t.getChild(1);
      CommonTree output = (CommonTree) t.getChild(1);
      visitor.visit(input);
      visitor.visit(commands);
      visitor.visit(output);
    };

    // Assign lambdas to tokens
    visitor.assign(WhileParser.FUNCTION, function_lambda);
    visitor.assign(WhileParser.DEFINITION, function_definition_lambda);
  }

}
