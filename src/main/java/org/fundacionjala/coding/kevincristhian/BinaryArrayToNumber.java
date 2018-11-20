package org.fundacionjala.coding.kevincristhian;

import java.util.List;

/**
 * Ones and Zeros 7kyu.
 */
public final class BinaryArrayToNumber {

    /**
     * constructor.
     */
    private BinaryArrayToNumber() {
    }

    /**
     * method to test.
     * @param binary value
     * @return int
     */
    public static int convertBinaryArrayToInt(final List<Integer> binary) {
      int dim = binary.size();
      int i = 0;
      int value = 0;
      while (dim > i) {
          value += binary.get(i) * (int) (Math.pow(2, dim - i - 1d));
          i++;
      }
      return value;
    }
}
