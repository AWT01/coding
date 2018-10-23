package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.CesarCrypto;
import org.junit.Assert;
import org.junit.Test;

public class CesarCypherTest {
    @Test
    public void test1() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        String toTest = "hola";
        Assert.assertEquals("krod", cesarCrypto.encode(toTest, "3"));
        // System.out.println(to);
        //System.out.println(cesarCrypto.decode(to, -1));
    }
    @Test
    public void test2() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        String toTest = "zorro";
        Assert.assertEquals("etwwt", cesarCrypto.encode(toTest, "5"));
    }
}
