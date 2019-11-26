import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RegistrationTests extends BaseUI {

    @DataProvider(name = "RegistrationLink")
    public static Object[][] testRegistration1() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationLink.csv")).stream().forEach(s-> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0],});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @Test(dataProvider = "RegistrationLink")
    public void signInLink(String email) {
        mainPage.clickSignInLink();
        mainPage.completeRegistration(email, Data.password);
        WebElement emailField = mainPage.emailInputField();
        mainPage.ajaxSendKeys(emailField, email);
        WebElement passwordField = mainPage.passwordInputField();
        mainPage.ajaxSendKeys(passwordField, Data.password);
        mainPage.ajaxClick(Locators.SIGN_IN_BUTTON_LOGIN_FORM_PAGE);
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
    }

    @DataProvider(name = "RegistrationButton")
    public static Object[][] testRegistration2() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationButton.csv")).stream().forEach(s-> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @Test(dataProvider = "RegistrationButton")
    public void joinForFreeNowButton(String email, String password, String day, String month, String year,
                                     String phone_number, String city, String location) {
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart(email, password);
        mainPage.completeSecondRegistrationPart(mainPage.generateNewNumbers(Data.user_name, 5), day, month,
                year, phone_number, city, location);
        /*mainPage.javaWaitSec(2);
        WebElement checkBoxConfirmation = mainPage.confirmationCheckBox();
        Assert.assertTrue(!driver.findElement(Locators.CONFIRMATION_CHECKBOX).isSelected(), "check box is not displayed");
        checkBoxConfirmation.click();*/
    }
}


