package org.fundacionjala.coding.kevincristhian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * sort class.
 */
public final class Srot {

    /**
     * constructor.
     */
    private Srot() {
    }
    /**
     * sort method.
     * @param word to order.
     * @return string
     */
    private static String sort(final String word) {
        int ini = 1;
        int end = word.length() - 1;
        List<Character> list = new ArrayList<>();
        while (ini < end) {
            list.add(word.charAt(ini));
            ini++;
        }
        ini = end - 2;
        StringBuilder newString = new StringBuilder();
        Collections.sort(list);
        while (ini >= 0) {
            newString.append(list.get(ini));
            ini--;
        }
        return new StringBuilder().append(word.charAt(0)).append(newString
                .append(word.charAt(end)).toString()).toString();
    }

    /**
     * main method.
     * @param words phrase.
     * @return string.
     */
    public static String sortTheInnerContent(final String words) {
        String[] phrase = words.split(" ");
        StringBuilder newPhrase = new StringBuilder();
        for (String string :phrase) {
           newPhrase.append(sort(string));
           newPhrase.append(" ");
        }
        return newPhrase.substring(0, newPhrase.length() - 1);
    }
}

