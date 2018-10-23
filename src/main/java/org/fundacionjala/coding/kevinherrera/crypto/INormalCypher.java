package org.fundacionjala.coding.kevinherrera.crypto;

/**
 * Interface for normal cypher.
 */
public interface INormalCypher {

    /**
     * encode a message using a Integer key.
     * @param message message to encode
     * @param key key to encode
     * @return message encoded
     */
    String encode(String message, int key);

    /**
     * decode a message using a Integer key.
     * @param key key to decode
     * @param encodeMessage message to decode
     * @return message as lowercase type decoded
     */
    String decode(int key, String encodeMessage);

}
