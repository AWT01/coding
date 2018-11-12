package org.fundacionjala.coding.kevinh.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public abstract class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    static final double NORMAL_MOVIE_PRICE = 1.5;
    static final double NEW_RELEASE_MOVIE_PRICE = 3;
    static final double REGULAR_2_DAYS_PRICE = 4;
    private String title;
    private int priceCode;

    /**
     * .
     * @param title title
     * @param priceCode price code
     */
    public Movie(final String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * .
     * @return value
     */
    public int getPriceCode() {
        return priceCode;
    }

    /**
     * .
     * @return value
     */
    public String getTitle() {
        return title;
    }

    /**
     * .
     * @return value
     */
    public abstract String priceCodeToString();

    /**
     * .
     * @param daysRented .
     * @return .
     */
    public abstract double getRentCost(int daysRented);
}
