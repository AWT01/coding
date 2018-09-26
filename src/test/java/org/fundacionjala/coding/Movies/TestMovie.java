package org.fundacionjala.coding.Movies;

import org.fundacionjala.coding.KevinHerrera.Movies.Movie.Movie;
import org.fundacionjala.coding.KevinHerrera.Movies.Movie.MovieFactory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestMovie {
    static final String REGULAR_MOVIE_TITLE = "Superman";
    static final String NEW_RELEASE_MOVIE_TITLE = "Star Wars 8";
    static final String CHILDREN_MOVIE_TITLE = "Lady bug";
    static final String REGULAR_MOVIE_PRICE_CODE_STRING = "REGULAR";
    /**
     * .
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void testCreateRegularMovie() {
        Movie newMovie = MovieFactory.createRegularMovie(REGULAR_MOVIE_TITLE);
        assertEquals(Movie.REGULAR, newMovie.getPriceCode());
    }

    /**
     * .
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void testCreateNewReleaseMovie() {
        Movie newMovie = MovieFactory.createNewReleaseMovie(NEW_RELEASE_MOVIE_TITLE);
        assertEquals(Movie.NEW_RELEASE, newMovie.getPriceCode());
    }

    /**
     * .
     */
    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void testCreateChildrenMovie() {
        Movie newMovie = MovieFactory.createChildrenMovie(CHILDREN_MOVIE_TITLE);
        assertEquals(Movie.CHILDREN, newMovie.getPriceCode());
    }

    /**
     * .
     */
    @Test
    public void testGetMovieTitle() {
        Movie newMovie = MovieFactory.createRegularMovie(REGULAR_MOVIE_TITLE);
        assertEquals(REGULAR_MOVIE_TITLE, newMovie.getTitle());
    }

    /**
     * .
     */
    @Test
    public void testPriceCodeToString() {
        Movie newMovie = MovieFactory.createRegularMovie(REGULAR_MOVIE_TITLE);
        assertEquals(REGULAR_MOVIE_PRICE_CODE_STRING, newMovie.priceCodeToString());
    }
}
