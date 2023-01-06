package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import tests.day14_testNgFramework.C04_HardAssert;
import utilities.Driver;

public class C01_SoftAsserts {


    @Test
    public void test01(){

        //amazon anasayfaya gidin
        Driver.getDriver().get("https://amazon.com");
        // amazon anasayfaya gittiğini doğrulayın
        SoftAssert softAssert = new SoftAssert();
        String expectedUrlKelime="amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));

        //  Nutella aratın arama sonuclarının nutella içerdiğini doğrulayın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // Java aratın arama sonuclarının 1000'den fazla oldugunu dogrulayın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java" + Keys.ENTER);




        softAssert.assertAll();
        Driver.closeDriver();
    }

}
