package org.fundacionjala.coding.kevincristhian;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * sort class.
 */
public final class Srot {
    private final static int THREE = 3;

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
        final String[] arrayWord = word.split("");
        Arrays.sort(arrayWord, ini, end, Collections.reverseOrder());
        return String.join("", arrayWord);
    }

    /**
     * main method.
     * @param words phrase.
     * @return string.
     */
    public static String sortTheInnerContent(final String words) {
        String[] phrase = words.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String word : phrase) {
            stringJoiner.add(word.length() > THREE ? sort(word) : word);
        }
        return stringJoiner.toString();
    }
}

