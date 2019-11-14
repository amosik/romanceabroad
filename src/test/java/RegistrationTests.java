import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {

    @Test
    public void signInLink() {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.clickSignInLink();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.completeRegistration();
    }

    @Test
    public void signInButton () {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.clickJoinForFreeNowButton();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.completeFirstRegistrationPart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage.completeSecondRegistrationPart();
        WebElement checkBoxConfirmation = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        Assert.assertTrue(!driver.findElement(Locators.CONFIRMATION_CHECKBOX).isSelected(), "check box is not displayed");
        checkBoxConfirmation.click();
    }

}

