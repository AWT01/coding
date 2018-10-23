package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Test;

/**
 * tests for vigenere.
 */
public class VigenereCryptoTest {
    private static final String LEMON = "LIMON";

    /**
     * test for encode.
     */
    @Test
    public void encode() {
        VigenereCrypto vigenereCrypto = new VigenereCrypto();
        Assert.assertEquals("TXYPXMUNHCRC", vigenereCrypto.encode("HOLAJALASOFT", LEMON));
        Assert.assertEquals("TXYP XMUNHCRC", vigenereCrypto.encode("HOLA JALASOFT", LEMON));

    }

    /**
     * test for decode.
     */
    @Test
    public void decode() {
        VigenereCrypto vigenereCrypto = new VigenereCrypto();
        Assert.assertEquals("HOLAJALASOFT", vigenereCrypto.decode("TXYPXMUNHCRC", LEMON));
        Assert.assertEquals("HOLA JALASOFT", vigenereCrypto.decode("TXYP XMUNHCRC", LEMON));

    }
}
