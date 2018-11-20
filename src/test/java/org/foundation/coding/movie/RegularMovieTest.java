/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test to regular.
 */
public class RegularMovieTest {
  public static final double RESULT = 14.0;
  public static final int DAYS = 10;
  public static final int DELTA = 0;
  /**
   * test method.
   */
  @Test
  public void getFee() {
    RegularMovie regularPrice = new RegularMovie("Test", 0);
    double resultExpected = RESULT;
    double resultActual = regularPrice.getFee(DAYS);
    assertEquals(resultExpected, resultActual, DELTA);
  }
}
