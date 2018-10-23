package org.fundacionjala.coding.kevincristhian;

/**
 * Printer Errors 7kyu.
 */
public class Printer {
    /**
     * constructor.
     */
    private Printer() {
    }

    /**
     * method to print.
     * @param s string
     * @return string.
     */
    public static String printerError(final String s) {
        int dim = s.length();
        int i = 0;
        int cont = 0;
        while (i < dim) {
            if (s.charAt(i) > 'm' || s.charAt(i) < 'a') {
                cont++;
            }
            i++;
        }
        return String.format("%d/%d", cont, dim);
    }
}
