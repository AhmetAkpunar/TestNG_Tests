package tests.day14_testNgFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {
    @Test
    public void ilkTest(){
        System.out.println("ilk test çalıştı");
        Assert.assertTrue(5>7);
    }

    @Test (dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci test çalıştı");
    }

    @Test (dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("üçüncü test çalıştı");
    }
}
