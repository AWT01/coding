package org.fundacionjala.coding.KevinHerrera.Movies.Customer;

import java.util.List;
import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;
import org.fundacionjala.coding.KevinHerrera.Movies.Rental.RentalMovie;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public interface IRentMovie {
    /**
     * .
     * @param movie movie
     * @param daysRented daysRented
     */
    void rentMovie(Movie movie, int daysRented);

    /**
     * .
     * @return value
     */
    List<RentalMovie> getRentedMoviesList();
}
