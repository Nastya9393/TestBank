package Test_Bank.page;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Test_Bank.Driver.DriverSingleton;

public class BasePage {
    //private static WebDriver driver = DriverSingleton.getDriver();

//    protected WebElement lookForElement(By by) {
//        return driver.findElement(by);
//    }

    protected WebElement lookForElement(By by) {
        return webDriver.findElement(by);
    }



    private final Logger log = LogManager.getRootLogger();
    protected WebDriver webDriver = DriverSingleton.getDriver();

    protected WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    protected void waitForElementVisible(By by) {

    }

    protected void waitForElementClickable(By by) {

    }

    protected void clearField(By by) {
        findElement(by).clear();
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    @Step("Open {pageURL}")
    public void open(String pageURL) {
        webDriver.get(pageURL);
    }

    protected void clickButton(By by) {
        waitForElementVisible(by);
        findElement(by).click();
    }

    protected void enterText(By by, String text) {
        findElement(by).sendKeys(text);
    }

    protected String getText(By by) {
        waitForElementVisible(by);
        return findElement(by).getText();
    }


}