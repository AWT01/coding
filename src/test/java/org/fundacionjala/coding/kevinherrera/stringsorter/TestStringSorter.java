package org.fundacionjala.coding.kevinherrera.stringsorter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test of class StringSorter.
 */
public class TestStringSorter {

    /**
     * test sortInner method.
     */
    @Test
    public void testSort() {
        StringSorter sorter = new StringSorter();
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                sorter.sortInner("sort the inner content in descending order"));
        assertEquals("wiat for me", sorter.sortInner("wait for me"));
        assertEquals("tihs ktaa is esay", sorter.sortInner("this kata is easy"));
        assertEquals("jsolfaat", sorter.sortInner("jalasoft "));
        assertEquals("I am", sorter.sortInner("I am "));
        assertEquals("", sorter.sortInner(null));
    }
}
