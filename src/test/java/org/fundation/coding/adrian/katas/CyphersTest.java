package org.fundation.coding.adrian.katas;

import org.fundation.coding.adrian.katas.cyphers.CesarCrypto;
import org.fundation.coding.adrian.katas.cyphers.GinevereCrypto;
import org.junit.Assert;
import org.junit.Test;

public class CyphersTest {

    @Test
    public void test1() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        String toTest = "hola";
        Assert.assertEquals("krod", cesarCrypto.encode(toTest, 3));
        // System.out.println(to);
        //System.out.println(cesarCrypto.decode(to, -1));
    }
    @Test
    public void test2() {
        CesarCrypto cesarCrypto = new CesarCrypto();
        String toTest = "zorro";
        Assert.assertEquals("etwwt", cesarCrypto.encode(toTest, 3));
    }

    @Test
    public void test3() {
        GinevereCrypto ginevereCrypto = new GinevereCrypto();
        Assert.assertEquals("txyp xmunhcrc",ginevereCrypto.encode("hola jalasoft","limon"));
    }

    @Test
    public void test4() {
        GinevereCrypto ginevereCrypto = new GinevereCrypto();
        Assert.assertEquals("hola jalasoft",ginevereCrypto.decode("txyp xmunhcrc","limon"));
    }
}
