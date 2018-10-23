package org.fundacionjala.coding.kevinherrera.crypto;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test CesarCrypto class.
 */
public class TestCesarCrypto {
    private static final int ENCODE_KEY_3 = 3;
    private static final int ENCODE_KEY_MINUS_3 = -3;
    private static final int ENCODE_KEY_5 = 5;
    private static final int ENCODE_KEY_MINUS_5 = -5;
    private static final String ENCODE_KEY_STRING = "LIMON";


    /**
     * test encode.
     */
    @Test
    public void testEncodeNormal() {
        NormalCrypto crypto = new NormalCrypto();
        assertEquals("KROD", crypto.encode("HOLA", ENCODE_KEY_3));
        assertEquals("ETWWT", crypto.encode("Zorro", ENCODE_KEY_5));
        assertEquals("DFYJ", crypto.encode("Yate", ENCODE_KEY_5));
        assertEquals("!23 ETWWT $56", crypto.encode("!23 Zorro $56", ENCODE_KEY_5));
        assertEquals("", crypto.encode("", ENCODE_KEY_5));
        assertEquals("", crypto.encode(null, ENCODE_KEY_5));
    }

    /**
     * test decode.
     */
    @Test
    public void testDecodeNormal() {
        NormalCrypto crypto = new NormalCrypto();
        assertEquals("hola", crypto.decode(ENCODE_KEY_MINUS_3, "KROD"));
        assertEquals("zorro", crypto.decode(ENCODE_KEY_5, "ETWWT"));
        assertEquals("yate", crypto.decode(ENCODE_KEY_5, "DFYJ"));
        assertEquals("!23 zorro $56", crypto.decode(ENCODE_KEY_MINUS_5, "!23 ETWWT $56"));
        assertEquals("", crypto.decode(ENCODE_KEY_5, ""));
        assertEquals("", crypto.decode(ENCODE_KEY_MINUS_5, null));
    }

    /**
     * test encode with vigenere method.
     */
    @Test
    public void testEncodeVigenere() {
        VigenereCrypto crypto = new VigenereCrypto();
        assertEquals("TXYP XMUNHCRC", crypto.encode("Hola Jalasoft", ENCODE_KEY_STRING));
        assertEquals("!23$TXYP XMUNHCRC!23$", crypto.encode("!23$Hola Jalasoft!23$", ENCODE_KEY_STRING));
        assertEquals("", crypto.encode("", ""));
        assertEquals("", crypto.decode("", null));
        assertEquals("", crypto.encode(null, null));
    }

    /**
     * test encode with vigenere method.
     */
    @Test
    public void testDecodeVigenere() {
        VigenereCrypto crypto = new VigenereCrypto();
        assertEquals("hola jalasoft", crypto.decode(ENCODE_KEY_STRING, "TXYP XMUNHCRC"));
        assertEquals("!23$hola jalasoft!23$", crypto.decode(ENCODE_KEY_STRING, "!23$TXYP XMUNHCRC!23$"));
        assertEquals("", crypto.decode("", ""));
        assertEquals("", crypto.decode("", null));
        assertEquals("", crypto.decode(null, ""));
        assertEquals("", crypto.decode(null, null));

    }
}
