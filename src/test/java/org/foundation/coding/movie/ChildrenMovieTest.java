/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test to class children movie.
 */
public class ChildrenMovieTest {
  public static final double RESULT = 12.0;
  public static final int DAYS = 10;
  public static final int DELTA = 0;

  /**
   * test method.
   */
  @Test
  public void getFee() {
    ChildrenMovie childrenPrice = new ChildrenMovie("Test", 2);
    double resultExpected = RESULT;
    double resultActual = childrenPrice.getFee(DAYS);
    assertEquals(resultExpected, resultActual, DELTA);
  }
}
