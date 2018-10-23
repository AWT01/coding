package org.fundation.coding.adrian.katas.cyphers;

import java.util.ArrayList;
import java.util.List;

public abstract class Crypto {
    /**
     * Abstract father class crypto.
     */
    protected List<Character> getValidValues() {
        List<Character> myList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            myList.add((char) i);
        }
        return myList;
    }
    public abstract String encode(String text, String key);
    public abstract String decode(String text, String key);

}

