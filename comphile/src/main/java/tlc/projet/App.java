package tlc.projet;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;
import tlc.code3adress.Parser3A;
import tlc.generator.Generator;
import tlc.analyzer.Analyzer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  public static final Logger logger = LogManager.getLogger(App.class);

  public static void main(String[] args) throws Exception {

    String data = """
      function main :
      read Op1, Op2
      %
      Result := Op1;
      for Op2 do
        Result := (cons nil Result)
      od
      %
      write Result
      """;
    CharStream stream = new ANTLRStringStream(data);
    WhileLexer lexer = new WhileLexer(stream);
    
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    WhileParser parser = new WhileParser(tokens);

    WhileParser.program_return program = parser.program();

    if (parser.exceptions.size() == 0) {

      CommonTree tree = (CommonTree) program.getTree();
      System.out.println(tree.toStringTree());

      Analyzer analyzer = new Analyzer();
      analyzer.analyze(tree);

      Parser3A code3Adrresse = new Parser3A(tree);
      code3Adrresse.build();

      Generator generator = new Generator(code3Adrresse.get3adress(), analyzer.getFunctionsStacks());
      generator.generate();

    } else {
      for (Exception e : parser.exceptions) {
        System.out.println(e);
        if (e instanceof MismatchedTokenException) {
          MismatchedTokenException exception = (MismatchedTokenException) e;
          App.logger
              .error("Mismatched token at line " + exception.line + " - unexpected: " + exception.token.getText());
        }
        if (e instanceof UnwantedTokenException) {
          UnwantedTokenException exception = (UnwantedTokenException) e;
          App.logger.error("Unwanted token at line " + exception.line + " - unwanted: " + exception.token.getText());
        }
        if (e instanceof MissingTokenException) {
          MissingTokenException exception = (MissingTokenException) e;
          App.logger
              .error("Missing token at line " + exception.line + " - missing: "
                  + WhileParser.tokenNames[exception.getMissingType()]);
        }
      }
    }
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
