package Test_Bank.page.ConfirmationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Test_Bank.page.BasePage;

import static Test_Bank.page.ConfirmationPage.ConfirmationPageLocators.CONFIRMATION;

public class ConfirmationPage extends BasePage {

    public WebElement lookForElement(By by) {
        return super.lookForElement(by);
    }

    public boolean isDispalyed() {
        return lookForElement(CONFIRMATION).isDisplayed();
    }

}


