package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.charSorter.CharSorter;
import org.junit.Assert;
import org.junit.Test;

/**
 * .
 */
public class CharSroterTest {
    /**
     * .
     */
    @Test
    public void exampleTests() {
        Assert.assertEquals("srot the inner ctonnet in dsnnieedcg oredr", CharSorter.sortTheInnerContent("sort the inner content in descending order"));
    }

    /**
     * .
     */
    @Test
    public void exampleTest2() {
        Assert.assertEquals("tihs ktaa is esay", CharSorter.sortTheInnerContent("this kata is easy"));
    }

    /**
     * .
     */
    @Test
    public void exampleTest3() {
        Assert.assertEquals("wiat for me", CharSorter.sortTheInnerContent("wait for me"));
    }

}
