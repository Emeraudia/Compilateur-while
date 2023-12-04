package tlc.projet;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

import tlc.analyzer.Analyzer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  public static final Logger logger = LogManager.getLogger(App.class);

  public static void main(String[] args) throws Exception {

    String data = """
        function true :
        read
        %
        A := (cons nil nil);
        Result := (cons nil nil)
        %
        write Result

        function true :
        read
        %
        Result := nil
        %
        write Result
          """;
    CharStream stream = new ANTLRStringStream(data);
    WhileLexer lexer = new WhileLexer(stream);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    WhileParser parser = new WhileParser(tokens);

    WhileParser.program_return program = parser.program();
    CommonTree tree = (CommonTree) program.getTree();
    System.out.println(tree.toStringTree());

    // printTree(tree);

    Analyzer analyzer = new Analyzer();
    analyzer.analyze(tree);
  }

  public static void printTree(Tree tree) {
    assert (tree != CommonTree.INVALID_NODE);
    if (tree.getAncestors() != null) {
      System.out.print("[" + tree.getAncestors() + "] --> ");
    }
    System.out.println(tree.getText() + " + [" + tree.getChildCount() + "] childs");
    for (int i = 0; i < tree.getChildCount(); i++) {
      printTree(tree.getChild(i));
    }
  }
}
