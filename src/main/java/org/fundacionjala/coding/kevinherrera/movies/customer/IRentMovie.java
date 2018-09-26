package org.fundacionjala.coding.kevinherrera.movies.customer;

import java.util.List;
import org.fundacionjala.coding.kevinherrera.movies.movie.Movie;
import org.fundacionjala.coding.kevinherrera.movies.rental.RentalMovie;

/**
 * @author kevinherrera - AWT-[01].
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
