package tests.day15_SoftAssert;

import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_PozitifLoginTesti {

    @Test
    public void test01(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        // 3- Kullanici email’i olarak valid email girin
        // 4- Kullanici sifresi olarak valid sifre girin
        // 5- Login butonuna basarak login olun
        // 6- Basarili olarak giris yapilabildigini test edin//

    }
}
