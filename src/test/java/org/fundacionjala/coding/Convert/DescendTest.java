package org.fundacionjala.coding.Convert;
import org.junit.Assert;

/**
 * Test to Descend convertor.
 */

public class DescendTest {

  /**
   * test 1.
   */
  @org.junit.Test
  public void sortedWordsDescend1() {

    String text = "this kata is easy";
    Descend descend = new Descend(text);
    descend.sortedWordsDescend();

    String textExpected = "tihs ktaa is esay ";
    Assert.assertEquals(textExpected,descend.getResult());
  }

  /**
   * test 2.
   */
  @org.junit.Test
  public void sortedWordsDescend2() {

    String text = "wait for me";
    Descend descend = new Descend(text);
    descend.sortedWordsDescend();

    String textExpected = "wiat for me ";
    Assert.assertEquals(textExpected,descend.getResult());
  }
}

