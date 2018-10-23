package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * tests.
 */
public class PrinterTest {

    /**
     * method to test.
     */
    @Test
    public void printerError() {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));

    }
}
