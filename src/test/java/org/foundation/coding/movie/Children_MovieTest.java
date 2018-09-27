package org.foundation.coding.movie;

import org.junit.Test;

import static org.junit.Assert.*;

public class Children_MovieTest {

    @Test
    public void getFee() {
        Children_Movie children_price = new Children_Movie("Test",2);
        double resultExpected = 12.0;
        double resultActual = children_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }
}