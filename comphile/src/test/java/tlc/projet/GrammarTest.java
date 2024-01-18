package tlc.projet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

/**
 * Unit test for testing the grammar.
 */
public class GrammarTest 
{
    @Test
    public void emptyCode() throws RecognitionException
    {
        String data = "";

        assertFalse( parse(data) == 0 );
    }

    @Test
    public void basicFunction() throws RecognitionException
    {
        String data = """

        function main :
        read
        %
            RES := nil
        %
        write RES
                
            """;

        assertTrue( parse(data) == 0 );
    }

    @Test
    public void basicForLoop() throws RecognitionException
    {
        String data = """

        function main :
        read MAX
        %
            ADD := nil;
        
            for MAX do
                ADD := (increment ADD)
            od
        
        %
        write ADD
                
        function increment :
        read OP
        %
            RESULT := (cons nil OP)
        %
        write RESULT
            """;

        assertTrue( parse(data) == 0 );
    }


    @Test
    public void missingPourcentSymbole() throws RecognitionException
    {
        String data = """

        function main :
        read
            RES := nil
        %
        write RES
                
            """;

        assertFalse( parse(data) == 0 );
    }

    @Test
    public void missingFunctionName() throws RecognitionException
    {
        String data = """

        function :
        read
        %
            RES := nil
        %
        write RES
                
            """;

        assertFalse( parse(data) == 0 );
    }

    @Test
    public void divideFunction() throws RecognitionException
    {
        String data = """

        function divide:
        read Dividend, Divisor
        %
        Result := nil;
        if Divisor then
            while Dividend do
                Result := (cons nil Result);
                Dividend := (sub Dividend Divisor)
            od
        else
            Result := nil
        fi
        %
        write Result
        
        function sub :
        read Op1, Op2
        %
        Result := Op1;
        for Op2 do
        Result := (tl Result)
        od
        %
        write Result
                
            """;

        assertTrue( parse(data) == 0 );
    }

    @Test
    public void ifTest() throws RecognitionException
    {
        String data = """

        function test:
        read R1, R2
        %
            if R1 then
                Test:=(cons R1 est vrai)
            fi
        %
        write Test
                
            """;

        assertTrue( parse(data) == 0 );
    }

    @Test
    public void nestedIfTest() throws RecognitionException
    {
        String data = """

        function test:
        read R1, R2
        %
            if R1 then
                if R2 then
                    Test:=(cons R1 est vrai)
                fi
            fi
        %
        write Test
                
            """;

        assertTrue( parse(data) == 0 );
    }

    @Test
    public void basicWhile() throws RecognitionException
    {
        String data = """

        function test:
        read R1, R2
        %
            while R1 do
                if R2 then
                    Test:=(increment nil)
                fi
            od
        %
        write Test

        function increment :
        read OP
        %
            RESULT := (cons nil OP)
        %
        write RESULT
                
        """;

        assertTrue( parse(data) == 0 );
    }

    @Test
    public void basicForeach() throws RecognitionException
    {
        String data = """

        function test:
        read R1, R2
        %
            foreach X in R1 do
                X := (increment R2)
            od
        %
        write Test

        function increment :
        read OP
        %
            RESULT := (cons nil OP)
        %
        write RESULT
                
        """;

        assertTrue( parse(data) == 0 );
    }
    
    private int parse(String data) throws RecognitionException{

        CharStream stream = new ANTLRStringStream(data);
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);
        System.out.println(parser.exceptions.size());

        parser.program();
        return parser.exceptions.size();

    }
}
