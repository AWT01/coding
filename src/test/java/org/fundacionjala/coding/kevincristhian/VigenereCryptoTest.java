package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * tests for vigenere.
 */
public class VigenereCryptoTest {
    private static final String LEMON = "LIMON";
    private VigenereCrypto vigenereCrypto;

    /**
     * instance of class.
     */
    @Before
    public void setUp() {
        vigenereCrypto = new VigenereCrypto();
    }

    /**
     * test for encode.
     */
    @Test
    public void encode() {
        Assert.assertEquals("TXYPXMUNHCRC", vigenereCrypto.encode("HOLAJALASOFT", LEMON));
        Assert.assertEquals("TXYP XMUNHCRC", vigenereCrypto.encode("HOLA JALASOFT", LEMON));
        Assert.assertEquals("", vigenereCrypto.encode(null, LEMON));
        Assert.assertEquals("BCD", vigenereCrypto.encode("ABC", "A"));
        Assert.assertEquals("!", vigenereCrypto.encode("!", "A"));
        Assert.assertEquals("a", vigenereCrypto.encode("a", "A"));
    }

    /**
     * test for decode.
     */
    @Test
    public void decode() {
        Assert.assertEquals("HOLAJALASOFT", vigenereCrypto.decode("TXYPXMUNHCRC", LEMON));
        Assert.assertEquals("HOLA JALASOFT", vigenereCrypto.decode("TXYP XMUNHCRC", LEMON));
        Assert.assertEquals("", vigenereCrypto.decode(null, LEMON));
        Assert.assertEquals("BC", vigenereCrypto.decode("CD", "A"));
        Assert.assertEquals("!", vigenereCrypto.decode("!", "B"));
        Assert.assertEquals("a", vigenereCrypto.decode("a", "B"));
    }
}
