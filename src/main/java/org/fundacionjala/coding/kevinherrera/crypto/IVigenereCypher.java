package org.fundacionjala.coding.kevinherrera.crypto;

/**
 * Interface for vigenere cypher.
 */
public interface IVigenereCypher {

    /**
     * encode a message using a String key.
     * @param message message to encode
     * @param key key to encode
     * @return message encoded
     */
    String encode(String message, String key);

    /**
     * decode a message using a String key.
     * @param key key to decode
     * @param encodeMessage message to decode
     * @return message decoded
     */
    String decode(String key, String encodeMessage);
}
