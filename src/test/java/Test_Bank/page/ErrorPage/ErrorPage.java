package Test_Bank.page.ErrorPage;

import static Test_Bank.page.ErrorPage.ErrorPageLocator.*;
import Test_Bank.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ErrorPage extends BasePage {

    public WebElement lookForElement(By by) {
        return super.lookForElement(by);
    }

    public boolean isDispalyed() {
        return lookForElement(ERROR).isDisplayed();
    }

}


