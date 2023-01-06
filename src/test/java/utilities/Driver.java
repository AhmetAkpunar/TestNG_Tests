package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

      /*
        Driver class'ından driver'i gerDriver() ile kullanıyoruz
        Sonradan projeye katılan insanların driver class'ından obje olusturarak
        driver kullanmaya calışmalarını engellemek için

        Driver class'ını SINGLETON PATTERN ile düzenleyebiliriz

        Bunun için Driver class'ının parametresiz constructor'ını oluşturup
        Access modifier'ını Private yapmamız yeterli olur
     */


    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){


        String browser = ConfigReader.getProperty("browser");
        if(driver==null){

            switch (browser){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }

    public static void closeDriver(){

        if (driver != null) {
            driver.quit();
            driver=null;
        }
    }
}
