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
    protected String encode(String message, int key) {
        return null;
    }

    /**
     * decode a message using a Integer key.
     * @param key key to decode
     * @param encodeMessage message to decode
     * @return message as lowercase type decoded
     */
    protected String decode(int key, String encodeMessage) {
        return null;
    }


    /**
     * encode a message using a String key.
     * @param message message to encode
     * @param key key string to encode
     * @return message encoded
     */
    protected String encode(String message, String key) {
        return null;
    }

    /**
     * decode a message using a String key.
     * @param key key string to decode
     * @param encodeMessage message to decode
     * @return message decoded
     */
    protected String decode(String key, String encodeMessage) {
        return null;
    }

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
