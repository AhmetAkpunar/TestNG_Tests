package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitMethodu;

public class C02_NegatifLoginTesti {





    QualitydemyPage qualitydemyPage;

    @BeforeMethod
    public void driverSetUp(){
        qualitydemyPage = new QualitydemyPage();
    }

    @AfterMethod
    public void driverClose(){
        Driver.closeDriver();
    }

    @Test (testName = "Wrong Email with True Password")
    public void yanlisEmailDogruSifre(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // Kullanıcı login linkine tıklar
        qualitydemyPage.logInLinki.click();
        // email kısmına yanlış email girer
        qualitydemyPage.kullaniciEmail.sendKeys(ConfigReader.getProperty("qdGecersizUserName"));
        // şifreyi doğru girer
        qualitydemyPage.kullaniciPassword.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        // cookie accept yap button'una tıklar
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        // login button'una tıklar
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }

    @Test (testName = "True Email with Wrong Password")
    public void dogruEmailYanlisSire(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.logInLinki.click();
        qualitydemyPage.kullaniciEmail.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        qualitydemyPage.kullaniciPassword.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }

    @Test (testName = "Wrong Email with With Password")
    public void yanlisEmailYanlisSifre(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.logInLinki.click();
        qualitydemyPage.kullaniciEmail.sendKeys(ConfigReader.getProperty("qdGecersizUserName"));
        qualitydemyPage.kullaniciPassword.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }
}
