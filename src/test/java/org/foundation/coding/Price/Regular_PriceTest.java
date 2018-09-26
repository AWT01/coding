package org.foundation.coding.Price;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Regular_PriceTest {

    @Test
    public void getFee() {
        Regular_Price regular_price = new Regular_Price();
        double resultExpected = 14.0;
        double resultActual = regular_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }
}