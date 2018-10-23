package org.fundacionjala.coding.kevincristhian;

/**
 * class for cesar and vigenere methods.
 */
public class CesarCrypto extends Cypher {

    /**
     * methid which change the key
     * between -26,26.
     * @param key original value.
     * @return int.
     */
    private int verifyKey(int key) {
        if (key % TWENTY_SIX == 0) {
            return 0;
        }
        while (Math.abs(key) > TWENTY_SIX) {
                if (key > 0) {
                    key -= TWENTY_SIX;
                } else {
                    key += TWENTY_SIX;
                }
        }
        return key;
    }

    /**
     * decode cesar (it can be used to encodeVigenere too).
     * @param message message to decode.
     * @param key key to decode.
     * @return string.
     */
    public String cesarAlgorithm(final String message, int key) {
        StringBuilder newMessage = new StringBuilder();
        key = verifyKey(key);
        char newChar;
        if (message == null) {
            return newMessage.toString();
        }
        int size = message.length();
        for (int i = 0; i < size; i++) {
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                newChar = (char) (message.charAt(i) + key);
                if (newChar > 'Z') {
                    newChar = (char) ((newChar - NINETY) + SIXTY_FOUR);
                }
                if (newChar < 'A') {
                    newChar = (char) (newChar + NINETY - SIXTY_FOUR);
                }
                } else {
                    newChar = message.charAt(i);
                }
                newMessage.append(newChar);
            }

        return newMessage.toString();
    }

    @Override
    public String encode(final String message, final String key) {
        return cesarAlgorithm(message, Integer.parseInt(key));
    }

    @Override
    public String decode(final String message, final String key) {
        return cesarAlgorithm(message, Integer.parseInt(key));
    }
}
