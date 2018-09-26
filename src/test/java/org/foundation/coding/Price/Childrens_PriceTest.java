package org.foundation.coding.Price;

import org.junit.Test;
import static org.junit.Assert.*;

public class Childrens_PriceTest {

    @Test
    public void getFee() {
        Childrens_Price childrens_price = new Childrens_Price();
        double resultExpected = 12.0;
        double resultActual = childrens_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }
}