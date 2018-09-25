package org.fundacionjala.coding.Movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Kevin Herrera - AWT-[01].
 * @version 0.1
 */
public class TestCustomer {
    @Test
    public void testCustomerName(){
        Customer customerTest = new Customer("Juan");
        assertEquals("Juan",customerTest.getName());
    }

    @Test
    public void testCustomerRentalMovieBatmanFor2Days(){
        Customer customerTest = new Customer("test");
        Movie movie = new Movie("Batman",0);
        customerTest.rentMovie(movie,2);
        assertEquals("Batman",customerTest.getRentedMovies().get(0).getName());
        assertEquals(2,customerTest.getRentedMovies().get(0).getDaysRented());
    }

    @Test
    public void testCustomerGetRentMoviesTitles(){
        Customer customerTest = new Customer("test");
        Movie movie1 = new Movie("Batman",0);
        customerTest.rentMovie(movie1,1);
        Movie movie2 = new Movie("Superman",0);
        customerTest.rentMovie(movie2,1);
        Movie movie3 = new Movie("Iron Man",0);
        customerTest.rentMovie(movie3,1);
        assertTrue(customerTest.getRentedMovies().contains("Batman"));
        assertEquals("Batman",customerTest.getRentedMovies().get(0).getTitle());
        assertEquals("Superman",customerTest.getRentedMovies().get(1).getTitle());
        assertEquals("Iron Man",customerTest.getRentedMovies().get(2).getTitle());
    }

    @Test
    public void test_Rent2Days_GetRentAmountForRegularMovie(){
        Customer customerTest = new Customer("juan");
        Movie oldMovie = new Movie("Old Batman",Movie.REGULAR);
        customerTest.rentMovie(oldMovie,5);
        //rent regular: 2 per day, if(daysRented>2)--> 1.5 per day;
        assertEquals(4, customerTest.getTotalBillAmount());
    }
    @Test
    public void test_Rent6Days_GetRentAmountForRegularMovie(){
        Customer customerTest = new Customer("juan");
        Movie oldMovie = new Movie("Old Batman",Movie.REGULAR);
        customerTest.rentMovie(oldMovie,6);
        //rent regular: 2 per day, if(daysRented>2)-->  1.5 per day;
        assertEquals(10, customerTest.getTotalBillAmount());
    }

    @Test
    public void test_5Days_GetRentAmountForNewReleaseMovie(){
        Customer customerTest = new Customer("juan");
        Movie newMovie = new Movie("New Batman",Movie.NEW_RELEASE);
        //rent new release: DaysRented * 3 ;
        customerTest.rentMovie(newMovie,5);
        assertEquals(15, customerTest.getTotalBillAmount());
    }

    @Test
    public void test_10Days_GetRentAmountForChildrenMovie(){
        Customer customerTest = new Customer("juan");
        Movie childMovie = new Movie("Little pig",Movie.CHILDRENS);
        //rent children: 1.5 per day;
        customerTest.rentMovie(childMovie,10);
        assertEquals(15, customerTest.getTotalBillAmount());
    }

    @Test
    public void test_Rent3RegularMovies_5Days_GetFrequentRenterPoints(){
        Customer customerTest = new Customer("juan");
        Movie newMovie1 = new Movie("Batman",Movie.REGULAR);
        Movie newMovie2 = new Movie("Batman",Movie.REGULAR);
        Movie newMovie3 = new Movie("Batman",Movie.REGULAR);
        customerTest.rentMovie(newMovie1,5);
        customerTest.rentMovie(newMovie2,5);
        customerTest.rentMovie(newMovie3,5);
        //1 point for movie rented, 1 point more for >2 days new release rent
        assertEquals(3, customerTest.getFrequentRenterPoints());
    }

    @Test
    public void test_Rent2RegularMovies1NewRelease_3Days_GetFrequentRenterPoints(){
        Customer customerTest = new Customer("juan");
        Movie newMovie1 = new Movie("Batman",Movie.REGULAR);
        Movie newMovie2 = new Movie("Batman",Movie.REGULAR);
        Movie newMovie3 = new Movie("New Batman",Movie.NEW_RELEASE);
        customerTest.rentMovie(newMovie1,3);
        customerTest.rentMovie(newMovie2,3);
        customerTest.rentMovie(newMovie3,3);
        //1 point for movie rented, 1 point more for >2 days new release rent
        assertEquals(4, customerTest.getFrequentRenterPoints());
    }
    @Test
    public void test_RentNewRelease_5Days_GetFrequentRenterPoints(){
        Customer customerTest = new Customer("juan");
        Movie newMovie = new Movie("New Batman",Movie.NEW_RELEASE);
        customerTest.rentMovie(newMovie,5);
        //1 pont for movie rented, 1 point more for >2 days new release rent
        assertEquals(2, customerTest.getFrequentRenterPoints());
    }

}
