package Test_Bank.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Test_Bank.Driver.DriverSingleton;

public class BasePage {

    protected WebElement lookForElement(By by) {
        return webDriver.findElement(by);
    }

    protected WebDriver webDriver = DriverSingleton.getDriver();

    public void open(String pageURL) {
        webDriver.get(pageURL);
    }

}