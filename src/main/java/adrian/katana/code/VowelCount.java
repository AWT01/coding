/*
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package adrian.katana.code;
/**
 * Class description
 *
 * @author Adrian Rojas - AWT-[01].
 * @version 1.0.
 */

/*
Return the number (count) of vowels in the given string.
We will consider a, e, i, o, and u as vowels for this Kata.
The input string will only consist of lower case letters and/or spaces.
* */
public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowelsCount++;
        }
        return vowelsCount;
    }
}