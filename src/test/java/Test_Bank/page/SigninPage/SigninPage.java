package Test_Bank.page.SigninPage;

import Test_Bank.page.BasePage;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;

import static Test_Bank.page.SigninPage.SigninPageLocator.USERNAMEINPUT;
import static Test_Bank.page.SigninPage.SigninPageLocator.PASSWORDINPUT;
import static Test_Bank.page.SigninPage.SigninPageLocator.SIGNINBUTTON;

public class SigninPage extends BasePage {
    private static final Logger log = Logger.getLogger(SigninPage.class);

    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";

    @Step("Clear Login")
    public void clearLogin() {
        lookForElement(USERNAMEINPUT).clear();
        log.info("Очистили поле логина");
    }

    @Step("Insert Login")
    public void insertLogin(String login) {
        lookForElement(USERNAMEINPUT).sendKeys(login);
        log.info("Ввели пароль");
    }

    @Step("Clear Password")
    public void clearPassword() {
        lookForElement(PASSWORDINPUT).clear();
        log.info("Очистили поле пароля");
    }

    @Step("Insert Password")
    public void insertPassword(String password) {
        lookForElement(PASSWORDINPUT).sendKeys(password);
        log.info("Ввели пароль");
    }

    @Step("Click Button")
    public void clickLoginButton() {
        lookForElement(SIGNINBUTTON).click();
        log.info("Нажали кнопку 'Войти'");
    }

    @Step("Open URL")
    public void open() {
        super.open(pageURL);
        log.info("Открыли страницу");
    }
}



