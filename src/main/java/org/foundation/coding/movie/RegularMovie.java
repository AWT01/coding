/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;

/**
 * Type of movie regular.
 */
public class RegularMovie extends Movie {
  private static final double PRICE_BY_DEFAULT = 2.0;
  private static final int DAYS_TO_COMPARE = 2;
  private static final double PRICE_EXTRA = 1.5;
  /**
   * constructor.
   * @param title receive.
   * @param priceCode receive.
   */
  public RegularMovie(final String title, final int priceCode) {

    super(title, priceCode);
  }

  /**
   * calculate the fee.
   * @param days receive.
   * @return fee number double.
   */
  @Override
  public double getFee(int days) {

    double thisAmount = PRICE_BY_DEFAULT;

    if (days > DAYS_TO_COMPARE) {
      thisAmount += (days - DAYS_TO_COMPARE) * PRICE_EXTRA;
    }

    return thisAmount;
  }
}
