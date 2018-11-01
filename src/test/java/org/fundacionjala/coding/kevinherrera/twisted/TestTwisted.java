package org.fundacionjala.coding.kevinherrera.twisted;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestTwisted {

    /**
     * .
     */
    @Test
    public void testTwisted37() {
        Assert.assertEquals(Arrays.toString(new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        Assert.assertEquals(Arrays.toString(new Integer[] {12,14,13})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[] {12,13,14})));
        Assert.assertEquals(Arrays.toString(new Integer[] {2,7,4,3,9})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[] {9,2,4,7,3})));
        Assert.assertEquals(Arrays.toString(new Integer[]{-19, -16, 7, 17, 79, 69, 30})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{7, -19, -16, 17, 30, 79, 69})));
        Assert.assertEquals(Arrays.toString(new Integer[]{-25, 2, 14, 40, 55, 64})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{55, 64, -25, 2, 14, 40})));
        Assert.assertEquals(Arrays.toString(new Integer[]{-5, 1, 2, 7, 25, 75, 76, 79, 51, 55, 55, 58, 67})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{79, 51, -5, 1,55, 58, 76,  55, 67, 2, 7, 25, 75})));
        Assert.assertEquals(Arrays.toString(new Integer[]{10, 17, 15, 29, 71, 77, 74, 32, 86})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{86, 17, 15, 10, 77, 74, 32, 29, 71})));
        Assert.assertEquals(Arrays.toString(new Integer[]{10, 17, 15, 49, 52, 31, 37, 34, 86})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{ 31, 37, 17, 15, 34, 52, 10, 49, 86})));
        Assert.assertEquals(Arrays.toString(new Integer[]{-29, -14, -17, -12, 4, 11, 21, 41})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{ 11, 21, -29, -14, -17, 4, -12, 41})));
        Assert.assertEquals(Arrays.toString(new Integer[]{-23, -19, -19, -13, 8, 77, 51, 54})
                , Arrays.toString(Twisted.sortTwisted37(new Integer[]{  8, 77, -19, -13, 51,-23, -19, 54})));

    }
}
