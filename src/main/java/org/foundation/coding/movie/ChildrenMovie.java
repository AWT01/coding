/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;

/**
 * A child type Children.
 */
public class ChildrenMovie extends Movie {

  private static final double PRICE_BY_DEFAULT = 1.5;
  private static final int DAYS_TO_COMPARE = 3;

  /**
   * constructor.
   *
   * @param title receive.
   * @param priceCode receive.
   */
  public ChildrenMovie(final String title, final int priceCode) {
    super(title, priceCode);
  }

  /**
   * return the fee calculated.
   *
   * @param days receive.
   * @return double number.
   */
  @Override
  public double getFee(int days) {
    double thisAmount = PRICE_BY_DEFAULT;
    if (days > DAYS_TO_COMPARE) {
      thisAmount += (days - DAYS_TO_COMPARE) * PRICE_BY_DEFAULT;
    }
    return thisAmount;
  }
}
