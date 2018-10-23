package org.fundacionjala.coding.kevincristhian;

/**
 * abstract class with common elements.
 */
public abstract class Cypher {
    public static final int NINETY = 90;
    public static final int SIXTY_FOUR = 64;
    public static final int TWENTY_SIX = 26;

    /**
     * encode method.
     * @param message input.
     * @param key key.
     * @return string.
     */
    public abstract String encode(String message, String key);

    /**
     * decode method.
     * @param message input.
     * @param key key.
     * @return string.
     */
    public abstract String decode(String message, String key);
}
