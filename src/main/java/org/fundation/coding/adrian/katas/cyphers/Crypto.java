package org.fundation.coding.adrian.katas.cyphers;

import java.util.ArrayList;
import java.util.List;

/**
 * Father abstract class for cyphers.
 */
public abstract class Crypto {
    /**
     * Get valid values.
     * @return the list of valid values
     */
    protected List<Character> getValidValues() {
        List<Character> myList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            myList.add((char) i);
        }
        return myList;
    }

    /**
     * Method for coding a text.
     * @param text to code
     * @param key to code
     * @return the new text
     */
    public abstract String encode(String text, String key);

    /**
     * Method for decoding.
     * @param text the coded text
     * @param key the key
     * @return the original text
     */
    public abstract String decode(String text, String key);

}

