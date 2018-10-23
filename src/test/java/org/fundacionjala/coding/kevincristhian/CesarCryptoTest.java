package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Test;

/**
 * test.
 */
public class CesarCryptoTest {

    private static final String NEGATIVE_THREE = "-3";
    private static final String NEGATIVE_FIVE = "-5";
    private static final String THREE = "3";
    private static final String FIFTY_TWO = "-52";
    private static final String ZERO = "0";
    private static final String FOX = "ZORRO";
    private static final String ONE = "1";
    private static final String FORTY = "40";
    private static final String NEGATIVE_FORTY = "-40";

    /**
     * decode encode cesar tests.
     */
    @Test
    public void decode() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals(FOX, cesarCrypto.decode("ETWWT", NEGATIVE_FIVE));
        Assert.assertEquals("", cesarCrypto.decode("", THREE));
        Assert.assertEquals("KROD", cesarCrypto.decode("HOLA", THREE));
        Assert.assertEquals("", cesarCrypto.decode("", THREE));
        Assert.assertEquals("N", cesarCrypto.decode("Z", FORTY));
        Assert.assertEquals("N", cesarCrypto.decode("Z", NEGATIVE_FORTY));
        Assert.assertEquals("A", cesarCrypto.decode("Z", ONE));
    }

    /**
     * decode encode cesar tests.
     */
    @Test
    public void encode() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLA", cesarCrypto.encode("KROD", NEGATIVE_THREE));
        Assert.assertEquals("HOL A", cesarCrypto.encode("HOL A", ZERO));
        Assert.assertEquals(FOX, cesarCrypto.encode(FOX, FIFTY_TWO));
        Assert.assertEquals("", cesarCrypto.decode(null, THREE));
        Assert.assertEquals("B", cesarCrypto.decode("A", ONE));
    }
}
