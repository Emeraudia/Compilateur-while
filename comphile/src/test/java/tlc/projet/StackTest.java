package tlc.projet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tlc.util.FunctionStack;

public class StackTest {

    @Test
    public void testAddSymbol1() {
        FunctionStack s = new FunctionStack("main", 1);

        s.addSymbol("a", 1);

        assertTrue(true);
    }


    @Test
    public void testGetSymbolLine1() {
        FunctionStack s = new FunctionStack("main", 1);

        s.addSymbol("a", 1);

        assertEquals(s.getSymbolLine("a"), 1);
    }

    @Test
    public void testGetSymbolLine2() {
        FunctionStack s = new FunctionStack("main", 1);

        s.addSymbol("a", 1);

        assertNotEquals(s.getSymbolLine("a"), 0);
    }

    @Test
    public void testToString() {
        FunctionStack s = new FunctionStack("main", 1);

        s.addSymbol("a", 1);

        assertNotEquals(s.toString(), null);
        assertNotEquals(s.toString(), "");
    }
}
