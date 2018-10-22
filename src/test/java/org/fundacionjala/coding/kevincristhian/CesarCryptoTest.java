package org.fundacionjala.coding.kevincristhian;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CesarCryptoTest {

    @Test
    public void encode() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("TXYPXMUNHCRC", cesarCrypto.encode("HOLAJALASOFT", "LIMON"));
        Assert.assertEquals("TXYP XMUNHCRC", cesarCrypto.encode("HOLA JALASOFT", "LIMON"));
    }

    @Test
    public void decode() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        Assert.assertEquals("HOLA", cesarCrypto.decode("KROD", -3));
        Assert.assertEquals("ZORRO", cesarCrypto.decode("ETWWT", -5));
        Assert.assertEquals("", cesarCrypto.decode("", 3));
        Assert.assertEquals("KROD", cesarCrypto.decode("HOLA", 3));
        Assert.assertEquals("ZORRO", cesarCrypto.decode("ZORRO", -52));
        Assert.assertEquals("", cesarCrypto.decode("", 3));
        Assert.assertEquals("", cesarCrypto.decode(null, 3));
    }
}