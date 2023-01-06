package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitMethodu;

public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){

        // qualitydemy anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // Login linlkie Tıkla
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.logInLinki.click();

        //Username gir
        qualitydemyPage.kullaniciEmail.sendKeys(ConfigReader.getProperty("qdGecerlUserName"));

        // Geçerli password gir
        qualitydemyPage.kullaniciPassword.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //Login buttonuna bas
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.girisBasarili.isDisplayed());

        Driver.closeDriver();
    }
}
