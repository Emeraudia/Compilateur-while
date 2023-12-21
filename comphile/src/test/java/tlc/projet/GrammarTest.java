package tlc.projet;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the grammar.
 */
public class GrammarTest 
{


    @Test
    public void shouldAnswerWithTrue()
    {
        Path path = FileSystems.getDefault().getPath("../../../../../..grammaire/test_grammaire", "test.txt");
        String data = "";

        try {
            data = Files.readString(path, StandardCharsets.UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        //CharStream stream = new ANTLRStringStream(data);
    }
}
