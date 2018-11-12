package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * tests.
 */
public class TriangleTesterTest {

    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int SEVEN = 7;
    private static final int NEGATIVE_ONE = -1;
    private static final int ZERO = 0;
    /**
     * method to test.
     */
    @Test
    public void isTriangle() {
        assertEquals(TriangleTester.isTriangle(ZERO, ZERO, ZERO), false);
        assertEquals(TriangleTester.isTriangle(NEGATIVE_ONE, ONE, ONE), false);
        assertEquals(TriangleTester.isTriangle(TWO, NEGATIVE_ONE, ONE), false);
        assertEquals(TriangleTester.isTriangle(ONE, ONE, TWO), false);
        assertEquals(TriangleTester.isTriangle(ONE, ONE, NEGATIVE_ONE), false);
        assertEquals(TriangleTester.isTriangle(ONE, TWO, ZERO), false);
        assertEquals(TriangleTester.isTriangle(SEVEN, TWO, TWO), false);
        assertEquals(TriangleTester.isTriangle(ONE, TWO, TWO), true);






    }
}
