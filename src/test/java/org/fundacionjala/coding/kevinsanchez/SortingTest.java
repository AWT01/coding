package org.fundacionjala.coding.kevinsanchez;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * test class.
 */
public class SortingTest {

    /**
     * test.
     */
    @Test
    public void sortTwisted37() {
        Sorting sorting = new Sorting();
        assertEquals(Arrays.toString(new Integer[] {1,2,7,4,5,6,3,8,9}), Arrays.toString(sorting.sortTwisted37(new Integer[] {1,2,3,4,5,6,7,8,9})));
        assertEquals(Arrays.toString(new Integer[] {12,14,13}), Arrays.toString(sorting.sortTwisted37(new Integer[] {12,13,14})));
        assertEquals(Arrays.toString(new Integer[] {2,7,4,3,9}), Arrays.toString(sorting.sortTwisted37(new Integer[] {9,2,4,7,3})));

    }
}