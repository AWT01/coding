package org.fundacionjala.coding.kevinherrera.movies.movie;

/**
 * @author kevinherrera - AWT-[01].
 * @version 0.1
 */
public abstract class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
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
    public String priceCodeToString() {
        String codeString = "";
        switch (priceCode) {
            case 0:
                codeString = "REGULAR";
                break;
            case 1:
                codeString = "NEW RELEASE";
                break;
            case 2:
                codeString = "CHILDRENS";
                break;
            default:
                break;
        }
        return codeString;
    }
}
