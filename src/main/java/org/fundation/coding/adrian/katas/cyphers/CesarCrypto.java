package org.fundation.coding.adrian.katas.cyphers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Cesar crypto.
 */
public final class CesarCrypto extends Crypto{
    private  List<Character> myList = getValidValues();

    public CesarCrypto() {
        for (int i = 'a'; i <= 'z'; i++) {
            myList.add((char) i);
        }
    }

    private int getKey(int key) {
        if (key > 0) {
            return myList.size() - key;
        } else return key*-1;
    }

    @Override
    public String encode(String text, String key) {
        StringBuilder result = new StringBuilder();
        Collections.rotate(myList, getKey((Integer.parseInt(key))));
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                result.append(myList.get(text.charAt(i) - 'a'));
            } else {
                result.append((text.charAt(i)));
            }
        }
        Collections.rotate(myList, myList.size() - getKey(Integer.parseInt(key)));
        return result.toString();
    }

    @Override
    public String decode(String text, String key) {
        int newKey = myList.size() - Integer.parseInt(key);
        return  encode(text,Integer.toString(newKey));
    }
}
