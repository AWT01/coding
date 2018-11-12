package org.fundacionjala.coding.kevinherrera.crypto;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test NormalCrypto class.
 */
public class TestCesarCrypto {
    private static final String ENCODE_KEY_3 = "3";
    private static final String ENCODE_KEY_MINUS_3 = "-3";
    private static final String ENCODE_KEY_5 = "5";
    private static final String ENCODE_KEY_MINUS_5 = "-5";
    private CesarCrypto crypto;

    /**
     * instance class NormalCrypto before start test.
     */
    @Before
    public void setUp() {
        crypto = new NormalCrypto();
    }

    /**
     * test encode.
     */
    @Test
    public void testEncodeNormal() {
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
        assertEquals("hola", crypto.decode(ENCODE_KEY_MINUS_3, "KROD"));
        assertEquals("zorro", crypto.decode(ENCODE_KEY_5, "ETWWT"));
        assertEquals("yate", crypto.decode(ENCODE_KEY_5, "DFYJ"));
        assertEquals("!23 zorro $56", crypto.decode(ENCODE_KEY_MINUS_5, "!23 ETWWT $56"));
        assertEquals("", crypto.decode(ENCODE_KEY_5, ""));
        assertEquals("", crypto.decode(ENCODE_KEY_MINUS_5, null));
    }
}
