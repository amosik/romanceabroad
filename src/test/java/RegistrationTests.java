import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        mainPage.clickSignInLink();
        mainPage.completeRegistration();
    }

    @Test
    public void signInButton () {
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart();
        mainPage.completeSecondRegistrationPart();
        WebElement checkBoxConfirmation = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        Assert.assertTrue(!driver.findElement(Locators.CONFIRMATION_CHECKBOX).isSelected(), "check box is not displayed");
        checkBoxConfirmation.click();

    }

}

