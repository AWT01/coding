package org.fundacionjala.coding.kevincristhian;

import java.util.List;

/**
 * Ones and Zeros 7kyu.
 */
public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      int dim = binary.size();
      int i = 0;
      int value = 0;
      while (dim>i) {
          value += binary.get(i)*(int)(Math.pow(2,(dim-i-1)));

          i++;
      }
      return value;
    }
}
