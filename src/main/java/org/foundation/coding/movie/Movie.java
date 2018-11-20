/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;

/**
 * Father class of the Movies type.
 */
public abstract class Movie {

  //The name of the movie.
  private String title;
  //The price code.
  private int priceCode;

  /**
   * constructor.
   * @param title receive.
   * @param priceCode receive.
   */
  public Movie(final String title, final int priceCode) {
    this.setTitle(title);
    this.setPriceCode(priceCode);
  }

  /**
   * give title.
   * @return title field.
   */
  public String getTitle() {
    return title;
  }

  /**
   * set the title.
   * @param title receive.
   */
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * give price code.
   * @return price code.
   */
  public int getPriceCode() {
    return priceCode;
  }

  /**
   * set the price code.
   * @param priceCode receive.
   */
  public void setPriceCode(int priceCode) {
    this.priceCode = priceCode;
  }

  /**
   * return the fee calculate for each type of movie.
   * @param days receive.
   * @return number calculated.
   */
  public abstract double getFee(int days);
}
