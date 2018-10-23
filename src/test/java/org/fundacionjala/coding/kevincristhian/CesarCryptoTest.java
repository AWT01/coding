package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Test;

/**
 * test.
 */
public class CesarCryptoTest {

    private static final int NEGATIVE_THREE = -3;
    private static final int NEGATIVE_FIVE = -5;
    private static final int THREE = 3;
    private static final int FIFTY_TWO = -52;
    private static final int ZERO = 0;
    private static final String FOX = "ZORRO";
    private static final String LEMON = "LIMON";
    /**
     * encodeVigenere tests.
     */
    @Test
    public void encodeVigenere() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("TXYPXMUNHCRC", cesarCrypto.encodeVigenere("HOLAJALASOFT", LEMON));
        Assert.assertEquals("TXYP XMUNHCRC", cesarCrypto.encodeVigenere("HOLA JALASOFT", LEMON));
    }

    /**
     * decode encode cesar tests.
     */
    @Test
    public void decodeCesar() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLA", cesarCrypto.decode("KROD", NEGATIVE_THREE));
        Assert.assertEquals(FOX, cesarCrypto.decode("ETWWT", NEGATIVE_FIVE));
        Assert.assertEquals("", cesarCrypto.decode("", THREE));
        Assert.assertEquals("KROD", cesarCrypto.decode("HOLA", THREE));
        Assert.assertEquals("HOL A", cesarCrypto.decode("HOL A", ZERO));
        Assert.assertEquals(FOX, cesarCrypto.decode(FOX, FIFTY_TWO));
        Assert.assertEquals("", cesarCrypto.decode("", THREE));
        Assert.assertEquals("", cesarCrypto.decode(null, THREE));
    }

    /**
     * decode vigenere tests.
     */
    @Test
    public void decodeVigenere() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLAJALASOFT", cesarCrypto.decodeVigenere("TXYPXMUNHCRC", LEMON));
        Assert.assertEquals("HOLA JALASOFT", cesarCrypto.decodeVigenere("TXYP XMUNHCRC", LEMON));
    }
}
