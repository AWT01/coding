package org.fundacionjala.coding.kevinherrera.stringsorter;

import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class StringSorter {

    public static final int INT_4 = 4;

    /**
     * sort inner letter of each word on a string.
     * @param stringToSort string to sort
     * @return string with inner letter of words sorted
     */
    public String sortInner(final String stringToSort) {
        StringJoiner builder = new StringJoiner(" ");
        if (stringToSort == null) {
            return builder.toString();
        }
        String[] words = stringToSort.split(" ");
        for (String word : words) {
            if (word.length() < INT_4) {
                builder.add(word);
            } else {
                String[] charArray = word.split("");
                Arrays.sort(charArray, 1, charArray.length - 1, Collections.reverseOrder());
                builder.add(String.join("", charArray));
            }
        }
        return builder.toString();
    }
}
