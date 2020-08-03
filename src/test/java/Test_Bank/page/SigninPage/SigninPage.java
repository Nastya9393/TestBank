package Test_Bank.page.SigninPage;

import Test_Bank.page.BasePage;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;

import static Test_Bank.page.SigninPage.SigninPageLocator.usernameInput;
import static Test_Bank.page.SigninPage.SigninPageLocator.passwordInput;
import static Test_Bank.page.SigninPage.SigninPageLocator.signInButton;

public class SigninPage extends BasePage {
    //private static final Logger log = Logger.getLogger(SigninPage.class);

    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";

    @Step("Clear Login")
    public void clearLogin() {
        lookForElement(usernameInput).clear();
        //log.info("Очистили поле логина");
    }

    @Step("Insert Login")
    public void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);
        //log.info("Ввели пароль");
    }

    @Step("Clear Password")
    public void clearPassword() {
        lookForElement(passwordInput).clear();
        //log.info("Очистили поле пароля");
    }

    @Step("Insert Password")
    public void insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);
        //log.info("Ввели пароль");
    }

    @Step("Click Button")
    public void clickLoginButton() {
        lookForElement(signInButton).click();
        //log.info("Нажали кнопку 'Войти'");
    }

    public void open() {
          super.open(pageURL);
    }
}



