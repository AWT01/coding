package org.fundacionjala.coding;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author KevinHerrera - AWT-[01].
 * @version 0.1
 */
public class TestCesarCrypto {
    @Test
    public void testEncode1() {
        CesarCrypto crypto = new CesarCrypto();
        assertEquals("KROD",crypto.Encode("HOLA",3));
        assertEquals("ETWWT",crypto.Encode("Zorro",5));
        assertEquals("!23 ETWWT $56",crypto.Encode("!23 Zorro $56",5));
        assertEquals("",crypto.Encode("",5));
        assertEquals("",crypto.Encode(null,5));
    }
}
