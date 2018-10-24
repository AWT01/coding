package org.fundacionjala.coding.kevincristhian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

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
        return word.charAt(0) + newString.toString() + word.charAt(end);
    }

    /**
     * main method.
     * @param words phrase.
     * @return string.
     */
    public static String sortTheInnerContent(final String words) {
        String[] phrase = words.split(" ");
        String newPhrase;
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String word :phrase) {
            if (word.length() > 1) {
                stringJoiner.add(sort(word));
            } else {
                stringJoiner.add(word);
            }
        }
        newPhrase = stringJoiner.toString();
        return newPhrase;
    }
}

