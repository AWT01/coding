package org.fundacionjala.coding;

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


    /**
     * test encode.
     */
    @Test
    public void testEncode() {
        CesarCrypto crypto = new CesarCrypto();
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
    public void testDecode() {
        CesarCrypto crypto = new CesarCrypto();
        assertEquals("hola", crypto.decode(ENCODE_KEY_MINUS_3, "KROD"));
        assertEquals("zorro", crypto.decode(ENCODE_KEY_5, "ETWWT"));
        assertEquals("yate", crypto.decode(ENCODE_KEY_5, "DFYJ"));
        assertEquals("!23 zorro $56", crypto.decode(ENCODE_KEY_MINUS_5, "!23 ETWWT $56"));
        assertEquals("", crypto.decode(ENCODE_KEY_5, ""));
        assertEquals("", crypto.decode(ENCODE_KEY_MINUS_5, null));
    }
}
