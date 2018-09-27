/**
 * Refactor Code Tasks.
 */
package org.foundation.coding.movie;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test class to new release movie.
 */
public class NewReleaseMovieTest {
  public static final double RESULT = 30;
  public static final int DAYS = 10;
  public static final int DELTA = 0;

  /**
   * test method.
   */
  @Test
  public void getFee() {
    NewReleaseMovie newReleaseMovie = new NewReleaseMovie("Test", 1);
    double resultExpected = RESULT;
    double resultActual = newReleaseMovie.getFee(DAYS);
    assertEquals(resultExpected, resultActual, DELTA);
  }

  /**
   * test method.
   */
  @Test
  public void getFrequentRenterPoints() {

  }
}
