package org.foundation.coding.movie;

import org.junit.Test;

import static org.junit.Assert.*;

public class New_Release_MovieTest {

    @Test
    public void getFee() {
        New_Release_Movie new_release_price = new New_Release_Movie("Test",1);
        double resultExpected = 30;
        double resultActual = new_release_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }

    @Test
    public void getFrequentRenterPoints() {

    }
}