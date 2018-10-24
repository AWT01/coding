package org.fundacionjala.coding.convert;
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
    descend.sortTheInnerContent();

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
    descend.sortTheInnerContent();

    String textExpected = "wiat for me ";
    System.out.println(descend.getResult());
    Assert.assertEquals(textExpected,descend.getResult());
  }

  /**
   * test 3.
   */
  @org.junit.Test
  public void sortedWordsDescend3() {

    String text = "I am";
    Descend descend = new Descend(text);
    descend.sortTheInnerContent();

    String textExpected = "I am ";
    Assert.assertEquals(textExpected,descend.getResult());
  }
}
