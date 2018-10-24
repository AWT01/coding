package org.fundacionjala.coding.kevincristhian;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * tests.
 */
public class SrotTest {

    /**
     * test of sort.
     */
    @Test
    public void sortTheInnerContent() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", Srot.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", Srot.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", Srot.sortTheInnerContent("this kata is easy"));

    }
}