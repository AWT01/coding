package org.fundacionjala.coding.kevincristhian;

/**
 * class for cesar and vigenere methods.
 */
public class CesarCrypto {
    private static final int NINETY = 90;
    private static final int SIXTY_FOUR = 64;
    private static final int TWENTY_SIX = 26;
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
     * create the key sentence with the key word.
     * @param message message to encodeVigenere.
     * @param key word.
     * @return string.
     */
    private String createKeyString(final String message, final String key) {
        int posKey = 0;
        int sizeKey = key.length() - 1;
        String newKey = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                newKey += key.charAt(posKey);
                if (posKey >= sizeKey) {
                    posKey = 0;
                } else {
                    posKey++;
                }
            } else {
                newKey += message.charAt(i);
            }
        }
        return newKey;
    }

    /**
     * encodeVigenere vigenere.
     * @param message message to encodeVigenere.
     * @param keyWord word.
     * @return string.
     */
    public String encodeVigenere(final String message, final String keyWord) {
        String newMessage = "";
        if (message != null) {
            int size = message.length();
            String newKeyWord;
            newKeyWord = createKeyString(message, keyWord);
            char newChar;
            for (int i = 0; i < size; i++) {
                if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                    newChar = (char) (message.charAt(i) + newKeyWord.charAt(i) - SIXTY_FOUR);
                    if (newChar > 'Z') {
                        newChar = (char) ((newChar - NINETY) + SIXTY_FOUR);
                    }
                } else {
                    newChar = message.charAt(i);
                }
                newMessage += newChar;
            }
        }
        return newMessage;
    }

    /**
     * decode vigenere.
     * @param message to decode.
     * @param keyWord key word.
     * @return string
     */
    public String decodeVigenere(final String message, final String keyWord) {
        String newMessage = "";
        if (message != null) {
            int size = message.length();
            String newKeyWord;
            newKeyWord = createKeyString(message, keyWord);
            char newChar;
            for (int i = 0; i < size; i++) {
                if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                    newChar = (char) (message.charAt(i) - newKeyWord.charAt(i) + SIXTY_FOUR);
                    if (newChar < 'A') {
                        newChar = (char) ((newChar + NINETY) - SIXTY_FOUR);
                    }
                } else {
                    newChar = message.charAt(i);
                }
                newMessage += newChar;
            }
        }
        return newMessage;
    }
    /**
     * decode cesar (it can be used to encodeVigenere too).
     * @param message message to decode.
     * @param key key to decode.
     * @return string.
     */
    public String decode(final String message, int key) {
        String newMessage = "";
        key = verifyKey(key);
        char newChar;
        if (message != null) {
            int size = message.length();
            for (int i = 0; i < size; i++) {
                if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                    newChar = (char) (message.charAt(i) + key);
                    if (newChar > 'Z') {
                        newChar = (char) ((newChar - NINETY) + SIXTY_FOUR);
                    }
                    if (newChar < 'A') {
                        newChar = (char) ((newChar + NINETY) - SIXTY_FOUR);
                    }
                }
                else {
                    newChar = message.charAt(i);
                }
                newMessage += newChar;
            }
        }
        return newMessage;
    }
}
