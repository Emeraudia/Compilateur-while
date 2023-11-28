package tlc.projet;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

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
  }

}
