package Test_Bank.uitest;

import Test_Bank.page.ConfirmationPage.ConfirmationPage;
import Test_Bank.page.ErrorPage.ErrorPage;
import Test_Bank.page.SigninPage.SigninPage;
import Test_Bank.utils.Screenshot;
import io.qameta.allure.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Test_Bank.Driver.DriverSingleton;

public class LoginTest extends BaseTest {
    ConfirmationPage confirmationPage;
    SigninPage signinPage;
    ErrorPage errorMessagePage;

    @BeforeMethod
    public void setup() {
        signinPage = new SigninPage();
        confirmationPage = new ConfirmationPage();
        errorMessagePage = new ErrorPage();
        ChromeOptions option = new ChromeOptions();
        option.setHeadless(true); // true - браузер не запускается
        signinPage.open();
        signinPage.clearLogin();
        signinPage.clearPassword();
    }

    @Override
    @AfterTest
    public void tearDown() {
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
    }

    @Test(description = "Все поля заполнены верно")
    @Epic("Testing https://idemo.bspb.ru/")
    @Feature(value = "Testing bank")
    @Description ("authorization passed")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Log in with valid credentials")
    public void validData() {
        signinPage.insertLogin("demo");
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();
        Screenshot.saveScreenshot();
        Assert.assertTrue(confirmationPage.isDispalyed());

    }

    @Test(description = "Все поля не заполнены")
    @Epic("Testing https://idemo.bspb.ru/")
    @Feature(value = "Testing bank")
    @Severity(SeverityLevel.CRITICAL)
    @Description ("Authorization failed")
    @Story("Log in with empty fields")
    public void loginWithEmptyFields() {
        signinPage.clickLoginButton();
        Screenshot.saveScreenshot();
        Assert.assertTrue(errorMessagePage.isDispalyed());

    }

    @Test(description = "Поле имя пустое")
    @Epic("Testing https://idemo.bspb.ru/")
    @Feature(value = "Testing bank")
    @Severity(SeverityLevel.CRITICAL)
    @Description ("Authorization failed")
    @Story("Login with blank field name")
    public void oneEmptyFields() {
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();
        Screenshot.saveScreenshot();
        Assert.assertTrue(errorMessagePage.isDispalyed());

    }

    @Test(description = "Поля логин и пароль введены неверно")
    @Epic("Testing https://idemo.bspb.ru/")
    @Feature(value = "Testing bank")
    @Description ("Authorization failed")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login with incorrect data entered")
    public void wrongData() {
        signinPage.insertLogin("2525");
        signinPage.insertPassword("5555");
        signinPage.clickLoginButton();
        Screenshot.saveScreenshot();
        Assert.assertTrue(errorMessagePage.isDispalyed());

    }
}