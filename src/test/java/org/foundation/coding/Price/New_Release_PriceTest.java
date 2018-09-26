package org.foundation.coding.Price;

import org.foundation.coding.Movie.Movie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class New_Release_PriceTest {

    @Test
    public void getFee() {
        New_Release_Price new_release_price = new New_Release_Price();
        double resultExpected = 30;
        double resultActual = new_release_price.getFee(10);
        assertEquals(resultExpected,resultActual,0);
    }

    @Test
    public void getFrequentRenterPoints() {
        Movie movie = new Movie("Test",1);
        New_Release_Price new_release_price = new New_Release_Price(movie);
        int resultActual = new_release_price.getFrequentRenterPoints(10);
        int resultExpected = 1;
        assertTrue("result actual is the same as result expected", resultActual == resultExpected);
    }
}