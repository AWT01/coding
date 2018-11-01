package org.fundacionjala.coding.kevinherrera.twisted;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Class Twisted planet 3-7.
 */
public final class Twisted {

    public static final int INT_40 = 40;
    public static final int INT_4 = 4;
    public static final int INT_10 = 10;
    public static final int INT_3 = 3;
    public static final int INT_7 = 7;

    /**
     * hidden constructor.
     */
    private Twisted() {

    }

    /**
     * change al digits value from 3 to 7 and viceversa.
     * @param array array to modify
     * @return array modified
     */
    public static Integer[] sortTwisted37(final Integer[] array) {
        Integer[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted, new Comparator<Integer>() {
            public int compare(final Integer o1, final Integer o2) {
                Integer toComp1 = o1;
                if ((Math.abs(o1 - (o1 % INT_10)) / INT_10) == INT_3 && o1 / INT_10 >= 1) {
                    toComp1 = o1 < 0 ? toComp1 - INT_40 : toComp1 + INT_40;
                } else if (Math.abs((o1 - (o1 % INT_10)) / INT_10) == INT_7 && o1 / INT_10 >= 1) {
                    toComp1 = o1 < 0 ? toComp1 + INT_40 : toComp1 - INT_40;
                }
                if (Math.abs(o1 % INT_10) == INT_3){
                    toComp1 = o1 < 0 ? toComp1 - INT_4 :toComp1 + INT_4;
                }
                else if (Math.abs(o1 % INT_10) == INT_7){
                    toComp1 = o1 < 0 ? toComp1 + INT_4 : toComp1 - INT_4;
                }
                Integer toComp2 = o2;
                if ((Math.abs(o2 - (o2 % INT_10))/INT_10) == INT_3 && o2 / INT_10 >= 1) {
                    toComp2 =  o2 < 0 ? toComp2 - INT_40 : toComp2 + INT_40;
                } else if (Math.abs(o2-(o2 % INT_10)) / INT_10 == INT_7 && o2/ INT_10 >=1) {
                    toComp2 = o2 < 0 ? toComp2 + INT_40 : toComp2 - INT_40;
                }
                if (Math.abs(o2 % INT_10) == INT_3){
                    toComp2 = o2 < 0 ? toComp2-INT_4 : toComp2 + INT_4;
                }
                else if (Math.abs(o2 % INT_10) == INT_7){
                    toComp2 = o2 < 0 ? toComp2+INT_4 : toComp2 - INT_4;
                }
                return toComp1.compareTo(toComp2);
            }
        });
        return sorted;
    }
}
