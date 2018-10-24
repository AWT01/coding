package org.fundacionjala.coding.kevinherrera.crypto;

/**
 * class that process a vigenere encrypt method.
 */
public class VigenereCrypto extends CesarCrypto {

    /**
     * encode the alphabetic values of a message using vigenere method.
     * @param message message to encode
     * @param key key to encode
     * @return message as UPPERCASE type encode
     */
    @Override
    public String encode(final String message, final String key) {
        super.encode(message, key);
        return encryptTask(EncryptTask.ENCODE, message, key);
    }

    /**
     * decode the alphabetic values of a message encoded with vigenere key.
     * @param encodeMessage message to decode
     * @param key key to decode
     * @return message as lowercase type decoded
     */
    @Override
    public String decode(final String key, final String encodeMessage) {
        super.decode(key, encodeMessage);
        return encryptTask(EncryptTask.DECODE, encodeMessage, key).toLowerCase();
    }


    /**
     * internal process of encryptTask using vigenere method.
     * @param task encryptTask task
     * @param message message to process
     * @param stringKey codification key
     * @return message encrypted or decrypted determinated by task value
     */
    private String encryptTask(final EncryptTask task, final String message, final String stringKey) {
        StringBuilder messageBuilder = new StringBuilder();
        if (message == null || stringKey == null) {
            return messageBuilder.toString();
        }
        int keyIndex = 0;
        char[] stringKeyArray = stringKey.toCharArray();
        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                keyIndex = keyIndex >= stringKey.length() ? 0 : keyIndex;
                char auxChar = Character.toUpperCase(stringKeyArray[keyIndex]);
                int key = Character.hashCode(auxChar) - (CHAR_A_UPPER_HASHCODE - 1);
                messageBuilder.append(encryptChar(task, c, key));
                keyIndex++;
            } else {
                messageBuilder.append(c);
            }
        }
        return messageBuilder.toString();
    }

}
