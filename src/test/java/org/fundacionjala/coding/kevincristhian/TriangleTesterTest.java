package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * tests.
 */
public class TriangleTesterTest {

    /**
     * method to test.
     */
    @Test
    public void isTriangle() {
        assertEquals(TriangleTester.isTriangle(1,2,2), true);
        assertEquals(TriangleTester.isTriangle(7,2,2), false);
    }
}