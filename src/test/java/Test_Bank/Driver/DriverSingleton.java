package Test_Bank.Driver;

import Test_Bank.utils.WebDriverListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverSingleton {
    static Logger log = LogManager.getRootLogger();

    private static WebDriver driver;
    private DriverSingleton() {
            }

    public static WebDriver getDriver() {

        if (driver == null) {
            driverStart();
         }
        return driver;
    }

        private static void driverStart(){
            WebDriverManager.chromedriver ().setup ();
            driver = new EventFiringWebDriver (new ChromeDriver());

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }


    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
