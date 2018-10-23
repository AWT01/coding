package org.fundation.coding.adrian.katas.cyphers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cesar crypto.
 */
public final class CesarCrypto {
    private  List<Character> myList = new ArrayList<>();

    public CesarCrypto() {
        for (int i = 'a'; i <= 'z'; i++) {
            myList.add((char) i);
        }
    }

    public String encode(String text, int key) {
        StringBuilder result = new StringBuilder();
        Collections.rotate(myList, getKey(key));
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                result.append(myList.get(text.charAt(i) - 'a'));
            } else {
                result.append((text.charAt(i)));
            }
        }
        Collections.rotate(myList, myList.size() - getKey(key));
        return result.toString();
    }

    public String decode(String text, int key) {
        return encode(text, myList.size() - key);
    }

    private int getKey(int key) {
        if (key > 0) {
            return myList.size() - key;
        } else return key*-1;
    }

}
