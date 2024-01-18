package tlc.projet;


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import tlc.analyzer.Analyzer;
import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

public class App2 {
    

    public static void main(String[] args) throws Exception {

        String data = """
            function main 
            read Op1, Op2
            
            Result  Op1;

            for Op2 
              Result :=
            ;
              Result := (cons int Result)
            
            write Result
            """;

        CharStream stream = new ANTLRStringStream(data);
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);
        System.out.println(tokens);
        System.out.println(parser.getNumberOfSyntaxErrors());


        System.out.println(parser.exceptions.size());

        WhileParser.program_return program = parser.program();
        CommonTree tree = (CommonTree) program.getTree();

        System.out.println(tree.toStringTree());

        Analyzer analyzer = new Analyzer();
        analyzer.analyze(tree);
    }

}
