package org.fundacionjala.coding;

import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    @Test
    public void getRentCostNew() {
        Movie movie = new MovieNew("The Revelant");
        Rental rentalTest = new Rental(movie,2);
        assertEquals(6.0,rentalTest.getRentCost(),0.1);
    }

    @Test
    public void getRentCostRegular() {
        Movie movie = new MovieRegular("Terminator");
        Rental rentalTest = new Rental(movie,2);
        assertEquals(2.0,rentalTest.getRentCost(),0.1);
    }

    @Test
    public void getRentCostChildren() {
        Movie movie = new MovieChildren("FROZEN");
        Rental rentalTest = new Rental(movie,2);
        assertEquals(1.5,rentalTest.getRentCost(),0.1);
    }

    @Test
    public void getRentPointRelease() {
        Movie movie = new MovieNew("The Revelant");
        Rental rentalTest = new Rental(movie,2);
        assertEquals(2,rentalTest.getRentPoint());
    }

    @Test
    public void getRentPointMovie() {
        Movie movie = new MovieRegular("The Revelant");
        Rental rentalTest = new Rental(movie,2);
        assertEquals(1,rentalTest.getRentPoint());
    }
}