import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {
    int timeDelay = 5;

    @Test
    public void signInButton() {
        driver.findElement(Locators.LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(timeDelay, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }
}
