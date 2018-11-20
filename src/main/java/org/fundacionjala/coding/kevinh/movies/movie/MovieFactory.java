package org.fundacionjala.coding.kevinh.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public final class MovieFactory {
    /**
     * .
     */
    private MovieFactory() {
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

