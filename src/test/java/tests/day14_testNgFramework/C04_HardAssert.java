package tests.day14_testNgFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {

    /*
        TestNG' de iki tane Assert class'ı vardır
        1.si JUnit'deki Assert class'ı ile aynı method'lara sahiptir.
        ilk FAILED olan assert işleminde çalışmayı durdurur ve hata mesajını verir

        2. assert calss'ının adı softassert olduğu için ilkine hard assert denmiştir.

        2. Assert class'ı ise SoftAssert class'ıdır.
        SoftAssert biz raporla deyinceye kadar
        Assertion'ları failed olsa bile çalıştırmaya devam eder
        biz raporla dediğimizde çalışan assertions'lardan kaçının failed olduğunu söyler
        ve failed assertion varsa raporla dediğimiz satırda çalışmayı durdurur.

     */

    @Test
    public void test01(){

        Assert.assertTrue(6 > 4);
        System.out.println("1. Assertion sonrası");
        Assert.assertTrue(6 > 14);
        System.out.println("2. Assertion sonrası");
        Assert.assertTrue(6 > 6);
        System.out.println("3. Assertion sonrası");

    }
}
