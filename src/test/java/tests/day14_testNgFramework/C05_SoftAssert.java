package tests.day14_testNgFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test
    public void test01(){

        // 1. adım softAssert objesi oluşturmak

        SoftAssert softassert = new SoftAssert();

        // 2. adım softassert objesini kullanarak istenilen assertion'ları yapın

        softassert.assertEquals(6,8); // Failed
        System.out.println("1. Assertion sonrası");

        softassert.assertTrue(5>3); // Passed
        System.out.println("2. Assertion sonrası");

        softassert.assertFalse(8 > 5); // Failed
        System.out.println("3. Assertion sonrası");

        // 3. adım softAssert'e raporla diyecez
        // softassert.assertAll(); // Bu satırda çalışma durur, çünkü failed olan assertion var
        System.out.println("assertAll sonrası");

    }
}
