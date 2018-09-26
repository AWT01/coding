package org.fundacionjala.coding.KevinHerrera.Movies.Movie;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public final class MovieFactory {

    /**
     * .
     */
    protected MovieFactory() {
    }

    /**
     * .
     * @param title title
     * @return value
     */
    public static MovieRegular createRegularMovie(final String title) {
        return new MovieRegular(title);
    }

    /**
     * .
     * @param title title
     * @return value
     */
    public static MovieNewRelease createNewReleaseMovie(final String title) {
        return new MovieNewRelease(title);
    }

    /**
     * .
     * @param title title
     * @return value
     */
    public static MovieChildren createChildrenMovie(final String title) {
        return new MovieChildren(title);
    }
}

