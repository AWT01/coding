package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * tests.
 */
public class BinaryArrayToNumberTest {

    private static final int ONE = 1;
    private static final int FIFTEEN = 15;
    private static final int SIX = 6;
    private static final int NINE = 9;
    /**
     * method to test.
     */
    @Test
    public void convertBinaryArrayToInt() {
        assertEquals(ONE, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(FIFTEEN, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(SIX, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(NINE, BinaryArrayToNumber.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));

    }
}
