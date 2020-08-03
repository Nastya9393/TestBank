package Test_Bank.page.ErrorPage;

import static Test_Bank.page.ErrorPage.ErrorPageLocator.*;
import Test_Bank.page.BasePage;

public class ErrorPage extends BasePage {
    public boolean isDispalyed() {
        return lookForElement(ERROR_LOGIN_MESSAGE).isDisplayed();
    }

}
