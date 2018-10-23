package org.fundacionjala.coding.kevincristhian;

/**
 * Is this a triangle?. 7kyu.
 */
public final class TriangleTester {
    /**
     * constructor.
     */
    private TriangleTester() {
    }

    /**
     * returns true if is a triangle.
     * @param a one side.
     * @param b one side.
     * @param c one side.
     * @return boolean.
     */
    public static boolean isTriangle(int a, int  b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }
}
