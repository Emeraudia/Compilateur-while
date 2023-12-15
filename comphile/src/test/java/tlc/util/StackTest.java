package tlc.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackTest {

    @Test
    public void testAddSymbol1() {
        Stack s = new Stack();

        s.addSymbol("a", 1);

        assertTrue(true);
    }

    @Test()
    public void testAddSymbol2() {
        Stack s = new Stack();
        assertThrows(AssertionError.class, () -> s.addSymbol("a", -1));
    }

    @Test()
    public void testAddSymbol3() {
        Stack s = new Stack();

        s.addSymbol(null, 0);

        assertThrows(AssertionError.class, () -> s.addSymbol(null, 0));
    }

    @Test
    public void testGetSymbolLine1() {
        Stack s = new Stack();

        s.addSymbol("a", 1);

        assertEquals(s.getSymbolLine("a"), 1);
    }

    @Test
    public void testGetSymbolLine2() {
        Stack s = new Stack();

        s.addSymbol("a", 1);

        assertNotEquals(s.getSymbolLine("a"), 0);
    }

    @Test()
    public void testGetSymbolLine3() {
        Stack s = new Stack();

        s.addSymbol("a", 1);

        assertThrows(AssertionError.class, () -> s.getSymbolLine(null));
    }

    @Test()
    public void testGetSymbolLine4() {
        Stack s = new Stack();

        assertEquals(s.getSymbolLine("a"), null);
    }

    @Test
    public void testToString() {
        Stack s = new Stack();

        s.addSymbol("a", 1);

        assertNotEquals(s.toString(), null);
        assertNotEquals(s.toString(), "");
    }
}
