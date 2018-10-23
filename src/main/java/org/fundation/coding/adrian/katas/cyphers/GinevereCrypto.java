package org.fundation.coding.adrian.katas.cyphers;

import java.util.Collections;
import java.util.List;

/**
 * Ginevere Crypto
 */
public final class GinevereCrypto extends Crypto {
    private List<Character> myList = getValidValues();

    @Override
    public String encode(String text, String key) {
        StringBuilder result = new StringBuilder();
        int keyStep =  0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                Collections.rotate(myList, myList.size() - (key.charAt(keyStep)-'a'+1));
                result.append(myList.get(text.charAt(i) - 'a'));
                Collections.rotate(myList,  (key.charAt(keyStep)-'a'+1));
                if(keyStep < (key.length()-1)) {
                    keyStep ++;
                } else {
                    keyStep = 0;
                }

            } else {
                result.append((text.charAt(i)));
            }
        }
        return result.toString();
    }

    @Override
    public String decode(String text, String key) {
        StringBuilder reverseKey = new StringBuilder();
        for (int i = 0; i<key.length(); i++){
            reverseKey.append(myList.get(myList.size() - (key.charAt(i)-'a'+2)));
        }
        return encode(text,reverseKey.toString());
    }
}
