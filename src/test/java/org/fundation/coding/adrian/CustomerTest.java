/*
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package org.fundation.coding.adrian;

import org.fundation.coding.adrian.movie.NewReleaseMovie;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test customer methods.
 */
public class CustomerTest {

    /**
     * Test if customer is created when the name space is empty.
     */
    @Test
    public void customerCreatedWhenEmpty() {
        Customer customer = new Customer("");
        Assert.assertNotNull(customer);
    }

    /**
     * Test that a customer without movies has no debt.
     */
    @Test
    public void newCustomerHasNoDebt() {
        Customer test = new Customer("test");
        test.stateDebt();
        Assert.assertEquals(0.0, test.getOwedAmount(), 0.0);
    }
    /**
     * Test that a customer without movies has no renter points.
     */
    @Test
    public void newCustomerHasNoPoints() {
        Customer test = new Customer("test");
        test.stateDebt();
        Assert.assertEquals(0.0, test.getRenterPoints(), 0.0);
    }
    /**
     * Test that a new release movie debt is multiplied by 3 for each day rented.
     */
    @Test
    public void newReleaseMovieDebt() {
        Customer test = new Customer("test");
        test.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        test.stateDebt();
        Assert.assertEquals(2 + 2 + 2, test.getOwedAmount(), 0.0);
    }
    /**
     * Test that a customer with a new release movie for at least 2 days have 2 renter points.
     */
    @Test
    public void newReleaseMoviePoints() {
        Customer test = new Customer("test");
        test.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        test.stateDebt();
        Assert.assertEquals(2, test.getRenterPoints(), 0.0);
    }
}
