package org.fundacionjala.coding.planetTwisted;

import java.util.Arrays;

/**
 * Kata 11/1/2018.
 */
public final class PlanetTwisted {

    private static String magicThree = "3";
    private static String magicSeven = "7";
    /**
     * private constructor.
     */
    private PlanetTwisted() {
    }

    /**
     * Sort the twisted.
     * @param array normal
     * @return twisted
     */
    public static Integer[] sortTwisted37(final Integer[] array) {
        Integer[] sorted = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            sorted[i] = twist(array[i]);
        }
        Arrays.sort(sorted);
        for (int i = 0; i < array.length; i++) {
            sorted[i] = twist(sorted[i]);
        }
        return sorted;
    }

    /**
     * Twist the array.
     * @param normal normal array
     * @return twisted
     */
    private static int twist(int normal) {
        String toTwist = Integer.toString(normal);
        toTwist = toTwist.replaceAll(magicSeven, "-");
        toTwist = toTwist.replaceAll(magicThree, magicSeven);
        toTwist = toTwist.replaceAll("-", magicThree);

        return Integer.parseInt(toTwist);
    }
}
