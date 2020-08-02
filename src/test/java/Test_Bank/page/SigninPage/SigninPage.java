package Test_Bank.page.SigninPage;

import Test_Bank.page.BasePage;
import static Test_Bank.page.SigninPage.SigninPageLocator.usernameInput;
import static Test_Bank.page.SigninPage.SigninPageLocator.passwordInput;
import static Test_Bank.page.SigninPage.SigninPageLocator.signInButton;


public class SigninPage extends BasePage {
    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true";

    public void clearLogin() {
        lookForElement(usernameInput).clear();
    }

    public void insertLogin(String login) {
        lookForElement(usernameInput).sendKeys(login);
    }

    public void clearPassword() {
        lookForElement(passwordInput).clear();
    }

    public void insertPassword(String password) {
        lookForElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        lookForElement(signInButton).click();
    }

    public void open() {
        super.open(pageURL);
    }
}



