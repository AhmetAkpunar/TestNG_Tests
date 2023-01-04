package tests.day14_testNgFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /*
        TestNG test method'larını isim sırasına göre çalıştırır
        priority değeri verilen method'lar priority değeri küçükten büyüğe doğru çalışır

     */

    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("ilk test çalıştı");
    }

    @Test (priority = 5)
    public void ikinciTest(){
        System.out.println("ikinci test çalıştı");
    }

    @Test (priority = 12)
    public void ucuncuTest(){
        System.out.println("üçüncü test çalıştı");
    }
}
