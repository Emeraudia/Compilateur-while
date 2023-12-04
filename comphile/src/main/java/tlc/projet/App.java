package tlc.projet;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

import tlc.analyzer.Analyzer;


public class App {
  public static void main(String[] args) throws Exception {

    String data = """
          function main :
          read A,B,C
          %
            R := nil
          %
          write R

          function main :
          read A,B,C
          %
            R := nil
          %
          write R
        """;
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

    Analyzer analyzer = new Analyzer();
    analyzer.analyze(tree);
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
