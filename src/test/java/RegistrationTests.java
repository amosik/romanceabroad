import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        String email = "test@gmail.com";
        String password = "1234test";
        mainPage.ajaxClick(Locators.LINK_SIGN_IN);
        mainPage.completeRegistration(Data.email, Data.password);
        WebElement emailField = driver.findElement(Locators.EMAIL_INPUT_FIELD);
        mainPage.ajaxSendKeys(emailField, email);
        WebElement passwordField = driver.findElement(Locators.PASSWORD_INPUT_FIELD);
        mainPage.ajaxSendKeys(passwordField, password);
        mainPage.ajaxClick(Locators.SIGN_IN_BUTTON_LOGIN_FORM_PAGE);
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
    }

    @Test
    public void joinForFreeNowButton() {
        mainPage.ajaxClick(Locators.JOIN_FOR_FREE_NOW_BUTTON);
        mainPage.completeFirstRegistrationPart(Data.email, Data.password);
        mainPage.ajaxClick(Locators.BUTTON_NEXT);
        mainPage.completeSecondRegistrationPart(mainPage.generateNewNumbers(Data.user_name, 5), Data.month,
                Data.day, Data.year, Data.phone_number, Data.city, Data.location);
        mainPage.javaWaitSec(2);
        WebElement checkBoxConfirmation = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        Assert.assertTrue(!driver.findElement(Locators.CONFIRMATION_CHECKBOX).isSelected(), "check box is not displayed");
        checkBoxConfirmation.click();
    }
}


