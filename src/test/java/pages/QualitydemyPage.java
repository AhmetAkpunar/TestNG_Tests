package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement logInLinki;

    @FindBy (id ="login-email")
    public  WebElement kullaniciEmail;

    @FindBy (id="login-password")
    public  WebElement kullaniciPassword;

    @FindBy (xpath= "//button[text()='Login']")
    public  WebElement loginButonu;

    @FindBy(linkText = "Accept")
    public WebElement cookie;
}
