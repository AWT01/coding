package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Test;

/**
 * test.
 */
public class CesarCryptoTest {

    /**
     * encodeVigenere tests.
     */
    @Test
    public void encodeVigenere() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("TXYPXMUNHCRC", cesarCrypto.encodeVigenere("HOLAJALASOFT", "LIMON"));
        Assert.assertEquals("TXYP XMUNHCRC", cesarCrypto.encodeVigenere("HOLA JALASOFT", "LIMON"));
    }

    /**
     * decode encode cesar tests.
     */
    @Test
    public void decodeCesar() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLA", cesarCrypto.decode("KROD", -3));
        Assert.assertEquals("ZORRO", cesarCrypto.decode("ETWWT", -5));
        Assert.assertEquals("", cesarCrypto.decode("", 3));
        Assert.assertEquals("KROD", cesarCrypto.decode("HOLA", 3));
        Assert.assertEquals("HOL A", cesarCrypto.decode("HOL A", 0));
        Assert.assertEquals("ZORRO", cesarCrypto.decode("ZORRO", -52));
        Assert.assertEquals("", cesarCrypto.decode("", 3));
        Assert.assertEquals("", cesarCrypto.decode(null, 3));
    }

    /**
     * decode vigenere tests.
     */
    @Test
    public void decodeVigenere() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLAJALASOFT", cesarCrypto.decodeVigenere("TXYPXMUNHCRC", "LIMON"));
        Assert.assertEquals("HOLA JALASOFT", cesarCrypto.decodeVigenere("TXYP XMUNHCRC", "LIMON"));
    }
}