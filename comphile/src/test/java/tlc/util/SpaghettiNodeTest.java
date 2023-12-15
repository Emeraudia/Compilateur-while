package tlc.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class SpaghettiNodeTest {

    @Test
    /**
     * Test getParent()
     */
    public void testGetParent1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertEquals(spaghettiNode.getParent(), null);
    }

    @Test
    /**
     * Test getSymbol()
     */
    public void testGetSymbol1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertEquals(spaghettiNode.getSymbol(), "a");
    }

    @Test
    /**
     * Test getLine()
     */
    public void testGetLine1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertEquals(spaghettiNode.getLine(), 1);
    }

    @Test
    /**
     * Test setParent()
     */
    public void testSetParent1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertEquals(spaghettiNode.getParent(), null);


        SpaghettiNode spaghettiNode1 = new SpaghettiNode("b", 2);
        spaghettiNode1.setParent(spaghettiNode);
        assertEquals(spaghettiNode1.getParent(), spaghettiNode);


        SpaghettiNode spaghettiNode2 = new SpaghettiNode("c", 3, spaghettiNode1);
        assertEquals(spaghettiNode2.getParent(), spaghettiNode1);
    }

    @Test
    /**
     * Test setSymbol()
     */
    public void testSetSymbol1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        spaghettiNode.setSymbol("b");
        assertEquals(spaghettiNode.getSymbol(), "b");
    }

    /**
     * Test setLine()
     * Positive line number
     */
    @Test
    public void testSetLine1() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        spaghettiNode.setLine(0);
        assertEquals(spaghettiNode.getLine(), 0);
    }

    /**
     * Test setLine()
     * Negative line number
     */
    public void testSetLine2() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertThrows(AssertionError.class, () -> spaghettiNode.setLine(-1));
    }

    /**
     * Test toString()
     * Positive line number
     */
    @Test
    public void testToString() {
        SpaghettiNode spaghettiNode = new SpaghettiNode("a", 1);
        assertNotEquals(spaghettiNode.toString(), null);
    }

}
