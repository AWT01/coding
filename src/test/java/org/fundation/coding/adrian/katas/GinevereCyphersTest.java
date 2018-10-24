package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.GinevereCrypto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Ginevere tests.
 */
public class GinevereCyphersTest {
    private GinevereCrypto ginevereCrypto;
    /**
     * Instance crypto Ginevere.
     */
    @Before
    public void instantiateCrypto() {
        ginevereCrypto = new GinevereCrypto();
    }

    /**
     * Example tests on the specification of the kata.
     */
    @Test
    public void test3() {

        Assert.assertEquals("txyp xmunhcrc", ginevereCrypto.encode("hola jalasoft", "limon"));
    }

    /**
     * test4.
     */
    @Test
    public void test4() {
        Assert.assertEquals("hola jalasoft", ginevereCrypto.decode("txyp xmunhcrc", "limon"));
    }
}
