package org.fundacionjala.coding.kevinherrera.stringsorter;

import java.util.Arrays;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class StringSorter {

    /**
     * sort inner letter of each word on a string.
     * @param stringToSort string to sort
     * @return string with inner letter of words sorted
     */
    public String sortInner(final String stringToSort) {
        StringBuilder builder = new StringBuilder();
        if (stringToSort == null) {
            return builder.toString();
        }
        String[] strings = stringToSort.split(" ");
        int index = 0;
        for (String c : strings) {
            char[] charArray = c.toCharArray();
            Arrays.sort(charArray, 1, charArray.length - 1);
            builder.append(inverseInnerAppend(charArray));
            if (index < strings.length - 1) {
                builder.append(" ");
            }
            index++;
        }
        return builder.toString();
    }

    /**
     * append a sorted char array in decendent order.
     * @param charArray sorted char
     * @return string appended
     */
    private String inverseInnerAppend(final char[] charArray) {
        StringBuilder builder = new StringBuilder();
        builder.append(charArray[0]);
        for (int i = charArray.length - 2; i >= 1; i--) {
            builder.append(charArray[i]);
        }
        builder.append(charArray[charArray.length - 1]);
        return builder.toString();
    }
}
