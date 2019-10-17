import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        driver.findElement(Locators.LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(Data.timeDelay, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    @Test
    public void signInButton () {
        driver.findElement(Locators.JOIN_NOW_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL)));
        driver.findElement(Locators.EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.USER_NAME_INPUT_FIELD).sendKeys(Data.user_name);
        driver.findElement(Locators.PHONE_INPUT_FIELD).sendKeys(Data.phone_number);
        driver.switchTo().frame("id");
    }
}

