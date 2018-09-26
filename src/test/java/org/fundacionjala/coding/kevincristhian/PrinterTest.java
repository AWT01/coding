package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void printerError() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(Printer.printerError(s));
        assertEquals("3/56", Printer.printerError(s));

    }
}