package org.fundacionjala.coding.kevinherrera.crypto;

/**
 * class that process a normal encrypt method.
 */
public class NormalCrypto extends CesarCrypto {

    /**
     * codifies the alphabetic values of a message using a key.
     * @param message message to encode
     * @param key key to encode
     * @return message as UPPERCASE type encoded
     */
    @Override
    public String encode(final String message, final int key) {
        super.encode(message, key);
        return encryptTask(EncryptTask.ENCODE, message, key);
    }

    /**
     * decode the alphabetic values of a message that was encode using a key.
     * @param key key to decode
     * @param encodeMessage message to decode
     * @return message as lowercase type decoded
     */
    @Override
    public String decode(final int key, final String encodeMessage) {
        super.decode(key, encodeMessage);
        return encryptTask(EncryptTask.DECODE, encodeMessage, key).toLowerCase();
    }

    /**
     * internal process of encryptTask functions.
     * @param task encryptTask task
     * @param message message to process
     * @param key codification key
     * @return message encrypted or decrypted determinated by task value
     */
    private String encryptTask(final EncryptTask task, final String message, int key) {
        StringBuilder messageBuilder = new StringBuilder();
        if (message == null) {
            return messageBuilder.toString();
        }
        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                messageBuilder.append(encryptChar(task, c, key));
            } else {
                messageBuilder.append(c);
            }
        }
        return messageBuilder.toString();
    }

}
