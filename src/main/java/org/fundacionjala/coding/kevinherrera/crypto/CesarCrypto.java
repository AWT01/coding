package org.fundacionjala.coding.kevinherrera.crypto;

/**
 * Class to encode a message using a key.
 */
public abstract class CesarCrypto {

    protected static final  int CHAR_Z_UPPER_HASHCODE = Character.hashCode('Z');
    protected static final  int CHAR_A_UPPER_HASHCODE = Character.hashCode('A');

    /**
     * Enum encrypt tasks.
     */
    enum EncryptTask { ENCODE, DECODE }

    /**
     * encode a message using a Integer key.
     * @param message message to encode
     * @param key key to encode
     * @return message encoded
     */
    protected abstract String encode(String message, String key);

    /**
     * decode a message using a Integer key.
     * @param key key to decode
     * @param encodeMessage message to decode
     * @return message as lowercase type decoded
     */
    protected abstract String decode(String key, String encodeMessage);

    /**
     * internal process of encryptTask functions.
     * @param task encryptTask task
     * @param message message to process
     * @param key codification key
     * @return message encrypted or decrypted determinated by task value
     */
    protected abstract String encryptTask(EncryptTask task, String message, String key);

    /**
     * encode a character using his hashcode value and a key.
     * @param task determinate if the character should be encode or decode
     * @param c character to transform
     * @param key key for the encrypt task
     * @return a new char encrypted
     */
    protected char[] encryptChar(final EncryptTask task, final char c, final int key) {
        int charHash = Character.hashCode(Character.toUpperCase(c));
        int newCharValue = 0;
        if (task == EncryptTask.ENCODE) {
            int aux = charHash + Math.abs(key);
            int aux2 = aux - CHAR_Z_UPPER_HASHCODE;
            newCharValue = aux > CHAR_Z_UPPER_HASHCODE ? (CHAR_A_UPPER_HASHCODE - 1) + aux2 : charHash + key;
        } else {
            int aux = charHash - Math.abs(key);
            int aux2 = (CHAR_A_UPPER_HASHCODE - 1) - aux;
            newCharValue = aux < CHAR_A_UPPER_HASHCODE ? CHAR_Z_UPPER_HASHCODE - (aux2) : charHash - Math.abs(key);
        }
        return Character.toChars(newCharValue);
    }
}
