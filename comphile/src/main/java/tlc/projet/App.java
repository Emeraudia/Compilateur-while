package tlc.projet;
import java.util.function.Consumer;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;
import tlc.util.Visitor;

public class App {
  public static void main(String[] args) throws Exception {

    String data = "function main : read % R := nil % write R";
    CharStream stream = new ANTLRStringStream(data);
    System.out.println("Start lexer");
    WhileLexer lexer = new WhileLexer(stream);
    System.out.println("End lexer");

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    System.out.println("Start parser");
    WhileParser parser = new WhileParser(tokens);
    System.out.println("End parser");

    WhileParser.program_return program = parser.program();
    CommonTree tree = (CommonTree) program.getTree();
    System.out.println(tree.toStringTree());

    printTree(tree);

    Visitor visitor = new Visitor();

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

    // Visit the AST
    visitor.visit(tree);
  }

  public static void printTree(Tree tree){
    assert(tree != CommonTree.INVALID_NODE);
    if(tree.getAncestors() != null){
        System.out.print("["+tree.getAncestors()+"] --> ");
    }
    System.out.println(tree.getText() + " + ["+tree.getChildCount()+"] childs");
    for(int i = 0 ; i < tree.getChildCount() ; i++){
        printTree(tree.getChild(i));
    }
  }
}
