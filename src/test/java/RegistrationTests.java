import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        //mainPage.clickSignInLink();
        mainPage.ajaxClick(Locators.LINK_SIGN_IN);
        mainPage.completeRegistration();
        mainPage.ajaxClick(Locators.BUTTON_REGISTRATION);
        Data.actualUrlLoginForm = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrlLoginForm);
    }
    @Test
    public void signInButton () {
        mainPage.ajaxClick(Locators.JOIN_NOW_BUTTON);
        mainPage.completeFirstRegistrationPart();
        mainPage.ajaxClick(Locators.BUTTON_NEXT);
        mainPage.completeSecondRegistrationPart();
        WebElement checkBoxConfirmation = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        Assert.assertTrue(!driver.findElement(Locators.CONFIRMATION_CHECKBOX).isSelected(), "check box is not displayed");
        checkBoxConfirmation.click();
    }
}



