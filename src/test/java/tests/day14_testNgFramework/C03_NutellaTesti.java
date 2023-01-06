package tests.day14_testNgFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTesti {

    @Test
    public void test01(){

        // 1- amazon anasayfasına gidin
        Driver.getDriver().get("https://amazon.com");

        // 2- nutella için arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" +Keys.ENTER);

        // 3- sonuçların Nutella içerdiğini test edin
        String expectedKelime="Nutella";
        String actualAramaSonucu = amazonPage.getAramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();
    }
}
