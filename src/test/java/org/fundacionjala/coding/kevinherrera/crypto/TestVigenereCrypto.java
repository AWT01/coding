package org.fundacionjala.coding.kevinherrera.crypto;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * test VigenereCrypto class.
 */
public class TestVigenereCrypto {

    private static final String ENCODE_KEY_STRING = "LIMON";
    private CesarCrypto crypto;

    /**
     * instance class VigenereCrypto before start test.
     */
    @Before
    public void setUp() {
        crypto = new VigenereCrypto();
    }


    /**
     * test encode with vigenere method.
     */
    @Test
    public void testEncodeVigenere() {
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
        assertEquals("hola jalasoft", crypto.decode(ENCODE_KEY_STRING, "TXYP XMUNHCRC"));
        assertEquals("!23$hola jalasoft!23$", crypto.decode(ENCODE_KEY_STRING, "!23$TXYP XMUNHCRC!23$"));
        assertEquals("", crypto.decode("", ""));
        assertEquals("", crypto.decode("", null));
        assertEquals("", crypto.decode(null, ""));
        assertEquals("", crypto.decode(null, null));

    }
}
