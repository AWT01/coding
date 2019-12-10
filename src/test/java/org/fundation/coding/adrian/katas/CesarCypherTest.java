package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.CesarCrypto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Cesar cypher.
 */
public class CesarCypherTest {
    private CesarCrypto cesarCrypto;

    /**
     * Instance crypto Cesar.
     */
    @Before
    public void instantiateCrypto() {
        cesarCrypto = new CesarCrypto();
    }
    /**
     * test1.
     */
    @Test
    public void test1() {
        String toTest = "hola";
        Assert.assertEquals("krod", cesarCrypto.encode(toTest, "3"));
        // System.out.println(to);
        //System.out.println(cesarCrypto.decode(to, -1));
    }

    /**
     * test2.
     */
    @Test
    public void test2() {
        String toTest = "zorro";
        Assert.assertEquals("etwwt", cesarCrypto.encode(toTest, "5"));
    }
}
