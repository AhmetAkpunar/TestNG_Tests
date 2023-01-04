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

        // amazon anasayfasına gidin
        Driver.getDriver().get("https://amazon.com");

        // nutella için arama yapın
        // WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        // aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // sonuçların Nutella içerdiğini test edin
        //WebElement aramaSonucuElementi = Driver.getDriver().findElement(By.xpath("//div[@class" + "='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime="Nutella";
        String actualAramaSonucu = amazonPage.getAramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();
    }
}
