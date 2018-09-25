package org.fundacionjala.coding.Movies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestMovie {

    @Test
    public void test_CreateRegularMovie(){
        Movie newMovie = new Movie("Batman",Movie.REGULAR);
        assertEquals(0, newMovie.getPriceCode());
    }

    @Test
    public void test_CreateNewReleaseMovie(){
        Movie newMovie = new Movie("Batman",Movie.NEW_RELEASE);
        assertEquals(1, newMovie.getPriceCode());
    }

    @Test
    public void test_CreateChildrenMovie(){
        Movie newMovie = new Movie("Litle pig",Movie.CHILDRENS);
        assertEquals(2, newMovie.getPriceCode());
    }

    @Test
    public void test_SetMoviePriceCodeRegular(){
        Movie newMovie = new Movie("Litle pig",Movie.CHILDRENS);
        newMovie.setPriceCode(Movie.REGULAR);
        assertEquals(0, newMovie.getPriceCode());
    }

    @Test
    public void test_SetMoviePriceCodeNewRelease(){
        Movie newMovie = new Movie("Little pig",Movie.CHILDRENS);
        newMovie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(1, newMovie.getPriceCode());
    }

    @Test
    public void test_SetMoviePriceCodeChildren(){
        Movie newMovie = new Movie("Batman",Movie.NEW_RELEASE);
        newMovie.setPriceCode(Movie.CHILDRENS);
        assertEquals(2, newMovie.getPriceCode());
    }

    @Test
    public void test_GetMovieTitle(){
        Movie newMovie = new Movie("Batman",Movie.NEW_RELEASE);
        assertEquals("Batman", newMovie.getTitle());
    }

}
