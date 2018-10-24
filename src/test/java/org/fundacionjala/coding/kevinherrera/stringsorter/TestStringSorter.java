package org.fundacionjala.coding.kevinherrera.stringsorter;

import org.fundacionjala.coding.kevinherrera.stringsorter.StringSorter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test of class StringSorter.
 */
public class TestStringSorter {

    /**
     *
     */
    @Test
    public void testSort() {
        StringSorter sorter = new StringSorter();
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                sorter.sortInner("sort the inner content in descending order"));
        assertEquals("wiat for me", sorter.sortInner("wait for me"));
        assertEquals("tihs ktaa is esay", sorter.sortInner("this kata is easy"));
        assertEquals("jsolfaat", sorter.sortInner("jalasoft "));
        assertEquals("", sorter.sortInner(null));
    }
}
