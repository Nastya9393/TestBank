package Test_Bank.utils;

import Test_Bank.Driver.DriverSingleton;
import io.qameta.allure.Attachment;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Screenshot {

        private static Logger log = Logger.getRootLogger();

        @Attachment
        public static byte[] saveScreenshot() {
            log.error("Screenshot");
            return ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
        }
}
