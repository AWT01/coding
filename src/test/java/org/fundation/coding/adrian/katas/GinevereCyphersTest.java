package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.GinevereCrypto;
import org.junit.Assert;
import org.junit.Test;

/**
 * Ginevere tests.
 */
public class GinevereCyphersTest {
    /**
     * Example tests on the specification of the kata.
     */
    @Test
    public void test3() {
        GinevereCrypto ginevereCrypto = new GinevereCrypto();
        Assert.assertEquals("txyp xmunhcrc", ginevereCrypto.encode("hola jalasoft", "limon"));
    }

    /**
     * test4.
     */
    @Test
    public void test4() {
        GinevereCrypto ginevereCrypto = new GinevereCrypto();
        Assert.assertEquals("hola jalasoft", ginevereCrypto.decode("txyp xmunhcrc", "limon"));
    }
}
