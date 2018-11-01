package org.fundacionjala.coding.kevinsanchez;

import java.util.*;

/**
 * class sorting.
 */
public class Sorting {

    /**
     * conver 3s on 7s.
     * @param digit digit to convert.
     * @param target number to search.
     * @param replace nuber to replace.
     * @return integer.
     */
    private Integer covert(Integer digit, String target, String replace) {
        return Integer.parseInt(digit.toString().replace(target, replace));
    }

    /**
     * change the numebr of the list.
     * @param array .
     * @return list.
     */
    private List changeDigits(Integer[] array) {
        List<Integer> newArray = new ArrayList<>();
        for (Integer digit : array) {
            if (digit.toString().contains("3")) {
                newArray.add(covert(digit, "3", "7"));
            } else if (digit.toString().contains("7")) {
                newArray.add(covert(digit, "7", "3"));
            } else {
                newArray.add(digit);
            }
        }
        return newArray;
    }

    /**
     * convertion of the list.
     * @param newArray list.
     * @return Integer[].
     */
    private Integer[] convertList(List<Integer> newArray) {
        Integer[] otherArray = new Integer[newArray.size()];
        for (int i=0; i<otherArray.length; i++) {
            otherArray[i] = newArray.get(i);
        }
        return otherArray;
    }

    /**
     * main method.
     * @param array .
     * @return list.
     */
    public Integer[] sortTwisted37(Integer[] array) {
        List<Integer> newArray = new ArrayList<>();
        newArray = changeDigits(array);
        newArray.sort(Comparator.naturalOrder());
        newArray = changeDigits(convertList(newArray));
        return convertList(newArray);
    }
}
