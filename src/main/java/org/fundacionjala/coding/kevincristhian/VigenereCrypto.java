package org.fundacionjala.coding.kevincristhian;

/**
 * vigenre class.
 */
public class VigenereCrypto extends Cypher {

    /**
     * create the key sentence with the key word.
     * @param message message to encodeVigenere.
     * @param key word.
     * @return string.
     */
    private String createKeyString(final String message, final String key) {
        int posKey = 0;
        int sizeKey = key.length() - 1;
        StringBuilder newKey = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                newKey.append(key.charAt(posKey));
                if (posKey >= sizeKey) {
                    posKey = 0;
                } else {
                    posKey++;
                }
            } else {
                newKey.append(message.charAt(i));
            }
        }
        return newKey.toString();
    }

    /**
     * encodeVigenere vigenere.
     * @param message message to encodeVigenere.
     * @param key word.
     * @return string.
     */
    @Override
    public String encode(final String message, final String key) {
        StringBuilder newMessage = new StringBuilder();
        if (message != null) {
            int size = message.length();
            String newKeyWord;
            newKeyWord = createKeyString(message, key);
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
                newMessage.append(newChar);
            }
        }
        return newMessage.toString();
    }

    /**
     * decode vigenere.
     * @param message to decode.
     * @param key key word.
     * @return string
     */
    @Override
    public String decode(final String message, final String key) {
        StringBuilder newMessage = new StringBuilder();
        if (message != null) {
            int size = message.length();
            String newKeyWord;
            newKeyWord = createKeyString(message, key);
            char newChar;
            for (int i = 0; i < size; i++) {
                if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
                    newChar = (char) (message.charAt(i) - newKeyWord.charAt(i) + SIXTY_FOUR);
                    if (newChar < 'A') {
                        newChar = (char) (newChar + NINETY - SIXTY_FOUR);
                    }
                } else {
                    newChar = message.charAt(i);
                }
                newMessage.append(newChar);
            }
        }
        return newMessage.toString();
    }
}

