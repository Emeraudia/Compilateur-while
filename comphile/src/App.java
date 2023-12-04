import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

import analyzer.Analyzer;
import antlr.WhileLexer;
import antlr.WhileParser;

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

    Analyzer analyzer = new Analyzer();
    analyzer.analyze(tree);
  }
}
