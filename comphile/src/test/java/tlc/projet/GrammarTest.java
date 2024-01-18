package tlc.projet;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

/**
 * Unit test for simple App.
 */
public class GrammarTest 
{
    @Test
    public void shouldAnswerWithTrue() throws RecognitionException
    {
        String data = "de de";

        CharStream stream = new ANTLRStringStream(data);
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);
        System.out.println(parser.getTokenNames());

        WhileParser.program_return program = parser.program();
        assertTrue( true );
    }
}
