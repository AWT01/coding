package org.fundation.coding.adrian.katas.cyphers.charSorter;

/**
 * .
 */
public final class CharSorter {
    /**
     * Constructor.
     */
    private CharSorter() {

    }

    /**
     * .
     * @param words to scramble
     * @return words scrambled
     */
    public static String sortTheInnerContent(final String words) {
        StringBuilder toSort = new StringBuilder();
        String[] elements = words.split(" ");
        for (int i = 0; i < elements.length; i++) {
            toSort.append(sortWord(elements[i]));
            toSort.append(" ");
        }
        toSort.deleteCharAt(toSort.length() - 1);
        return toSort.toString();
    }

    /**
     * scramble word.
     * @param word to
     * @return to
     */
    public static String sortWord(final String word) {
        StringBuilder toSort;
        toSort = new StringBuilder(word);
        for (int i = 1; i < word.length() - 1; i++) {
            for (int j = 1; j + i < toSort.length() - 1; j++) {
                if (toSort.charAt(i) < toSort.charAt(j + i)) {
                    toSort = toSort.insert(i, toSort.charAt(j + i));
                    toSort.deleteCharAt(j + i + 1);
                }
            }
        }
        return toSort.toString();
    }

}
