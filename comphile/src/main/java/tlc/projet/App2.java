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

        String    data = """
            function test:
            read R1, R2
            %
                if R1 then
                    Test:=(cons R1 (cons est vrai))
                fi;
                
                
                if (not R2) then
                    Test:= (true)
                else
                    Test:=(false)
                fi;
                
                
                if R1 == R2 then
                    Test:=(cons nil nil nil)
                    
                else
                    if(not R1)then
                        Test:=(hd R1)
                    else
                        if R1 then
                            Test:=(cons Test Test)
                        fi;
                    fi;
                fi;
            %
            write Test
            """;

        CharStream stream = new ANTLRStringStream(data);
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);

        WhileParser.program_return program = parser.program();

        System.out.println(parser.exceptions.size());
    }

}
