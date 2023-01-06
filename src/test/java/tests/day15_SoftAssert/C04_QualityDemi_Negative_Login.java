package tests.day15_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.WaitMethodu;

public class C04_QualityDemi_Negative_Login {

    // 2- https://www.qualitydemy.com/
    // 3 test method'u olusturun
    // 1.de yanlis email, dogru sifre
    // 2.de dogru email yanlis sifre
    // 3.de yanlis email, yanlis sifre ile giris yapmayi deneyin
    // giris yapilamadigini test edin

    // email: user_1106147@login.com
    // doğru şifre: 31488081

    static QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @BeforeMethod
    public void driverSetUp(){
        qualitydemyPage = new QualitydemyPage();
    }

    @AfterMethod
    public void driverClose(){
        Driver.closeDriver();
    }

    @Test
    public void yanlisEmailDogruSifre(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        // Kullanıcı login linkine tıklar
        qualitydemyPage.logInLinki.click();
        // email kısmına yanlış email girer
        qualitydemyPage.kullaniciEmail.sendKeys("abc@gmail.com");
        // şifreyi doğru girer
        qualitydemyPage.kullaniciPassword.sendKeys("31488081");
        // cookie accept yap button'una tıklar
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        // login button'una tıklar
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }

    @Test
    public void dogruEmailYanlisSire(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.logInLinki.click();
        qualitydemyPage.kullaniciEmail.sendKeys("user_1106147@login.com");
        qualitydemyPage.kullaniciPassword.sendKeys("122345");
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }

    @Test
    public void yanlisEmailYanlisSifre(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.logInLinki.click();
        qualitydemyPage.kullaniciEmail.sendKeys("abc@gmail.com");
        qualitydemyPage.kullaniciPassword.sendKeys("122345");
        qualitydemyPage.cookie.click();
        WaitMethodu.bekle(2);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmail.isDisplayed());
    }
}
