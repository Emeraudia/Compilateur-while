package tlc.projet;



import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.jupiter.api.Test;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;

/**
 * Unit test for the grammar.
 */
public class GrammarTest 
{

    @Test
    public void shouldAnswerWithTrue() throws IOException, RecognitionException
    {
        InputStream input =GrammarTest.class.getResourceAsStream("../../../../../../grammaire/test_grammaire/test.txt");
        CharStream stream = new ANTLRFileStream("../../../../../../grammaire/test_grammaire/test.txt");
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);

        assertDoesNotThrow( () -> parser.program());

    }
}
