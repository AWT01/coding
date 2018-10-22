package org.fundacionjala.coding;

/**
 * Class to encode a message using a key
 */
public class CesarCrypto {

    private static final  int CHAR_Z_UPPER_HASHCODE = 90;
    private static final  int CHAR_A_UPPER_HASHCODE = 65;

    /**
     * Enum encrypt tasks.
     */
    enum EncryptTask { ENCODE, DECODE }

    /**
     * codifies the alphabetic values of a message using a key.
     * @param message message to encode
     * @param key key to encode
     * @return message as UPPERCASE type encoded
     */
    public String encode(final String message, final int key) {
        return processEncrypt(EncryptTask.ENCODE, message, key);
    }

    /**
     * decode the alphabetic values of a message that was encode using a key.
     * @param encodeMessage message to decode
     * @param key key to decode
     * @return message as lowercase type decoded
     */
    public String decode(final int key, final String encodeMessage) {
        return processEncrypt(EncryptTask.DECODE, encodeMessage, key).toLowerCase();
    }

    /**
     * internal process of encrypt functions.
     * @param task encrypt task
     * @param message message to process
     * @param key codification key
     * @return message encrypted or decrypted determinated by task value
     */
    private String processEncrypt(final EncryptTask task, final String message, int key) {
        StringBuilder messageBuilder = new StringBuilder();
        if (message == null) {
            return messageBuilder.toString();
        }
        for (char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int newCharValue = 0;
                int charHash = Character.hashCode(Character.toUpperCase(c));
                if (task == EncryptTask.ENCODE) {
                    int aux = charHash + Math.abs(key);
                    int aux2 = aux - CHAR_Z_UPPER_HASHCODE;
                    newCharValue = aux > CHAR_Z_UPPER_HASHCODE ? (CHAR_A_UPPER_HASHCODE - 1) + aux2 : charHash + key;
                }
                if (task == EncryptTask.DECODE) {
                    int aux = charHash - Math.abs(key);
                    int aux2 = (CHAR_A_UPPER_HASHCODE - 1) - aux;
                    newCharValue = aux < CHAR_A_UPPER_HASHCODE
                            ? CHAR_Z_UPPER_HASHCODE - (aux2) : charHash - Math.abs(key);
                }
                messageBuilder.append(Character.toChars(newCharValue));
            } else {
                messageBuilder.append(c);
            }
        }
        return messageBuilder.toString();
    }
}
