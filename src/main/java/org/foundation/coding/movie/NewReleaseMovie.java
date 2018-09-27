/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;

/**
 * Type of movie Release.
 */
public class NewReleaseMovie extends Movie {
  //Code of release.
  public static final int NEW_RELEASE = 1;
  public static final int PRECIO_BY_DEFAULT = 3;
  /**
   * constructor.
   * @param title receive.
   * @param priceCode receive.
   */
  public NewReleaseMovie(final String title, final int priceCode) {
    super(title, priceCode);
  }

  /**
   * calculate the fee.
   * @param days receive.
   * @return fee.
   */
  @Override
  public double getFee(int days) {

    return days * PRECIO_BY_DEFAULT;
  }

  /**
   * calculate the renter point.
   * @param days receive.
   * @return point number.
   */
  public int getFrequentRenterPoints(final int days) {
    // add frequent renter points
    int frequentRenterPoints = 0;
    // add bonus for a two day new release rental
    if (getPriceCode() == NEW_RELEASE && days > 1) {
          frequentRenterPoints++;
    }
    return frequentRenterPoints;
  }
}
