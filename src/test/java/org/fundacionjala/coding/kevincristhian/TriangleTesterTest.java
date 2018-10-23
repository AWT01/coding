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
    /**
     * method to test.
     */
    @Test
    public void isTriangle() {
        assertEquals(TriangleTester.isTriangle(ONE, TWO, TWO), true);
        assertEquals(TriangleTester.isTriangle(SEVEN, TWO, TWO), false);
    }
}
