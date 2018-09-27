package org.foundation.coding.movie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Regular_MovieTest {

    @Test
    public void getFee() {
        Regular_Movie regular_price = new Regular_Movie("Test",0);
        double resultExpected = 14.0;
        double resultActual = regular_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }
}