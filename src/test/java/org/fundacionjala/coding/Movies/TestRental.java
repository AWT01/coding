package org.fundacionjala.coding.Movies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestRental {

    @Test
    public void test_RentalMovie5Days(){
        Movie movie = new Movie("Batman", Movie.NEW_RELEASE);
        Rental rentalTest = new Rental(movie,5);
        assertEquals(5, rentalTest.getDaysRented());
    }

    @Test
    public void test_GetRentedMovie(){
        Movie movie = new Movie("Batman", Movie.NEW_RELEASE);
        Rental rentalTest = new Rental(movie,5);
        assertNotNull(rentalTest.getMovie());
    }
}
