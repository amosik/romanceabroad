import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickHowWeWorkLink() {
        driver.findElement(Locators.LINK_VIEW).click();
    }

    public void openPhotosPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();
    }

    public void clickGiftsLink() {
        driver.findElement(Locators.LINK_GIFT).click();

    }

    public void clickTourToUkraineLink() {
        driver.findElements(LINK_TOUR).get(Data.indexLinkTour).click();
    }

    public void clickBlogLink() {
        driver.findElement(Locators.LINK_BLOG).click();
    }

    public void clickSignInLink() {
        driver.findElement(Locators.LINK_SIGN_IN).click();
    }

    public void completeRegistration(String email, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(email);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(password);
        driver.findElement(Locators.SIGN_IN_BUTTON_MODAL_WINDOW).click();

    }


    public void completeFirstRegistrationPart(String email, String password) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL)));
        driver.findElement(Locators.EMAIL).sendKeys(email);
        driver.findElement(Locators.PASSWORD).sendKeys(password);
    }

    public void completeSecondRegistrationPart(String user_name, String month, String day, String year,
                                               String phone_number, String city, String location) {
        driver.findElement(Locators.USER_NAME_INPUT_FIELD).sendKeys(user_name);
        driver.findElement(Locators.BIRTHDATE_DAY).click();
        clickValueOfList(Locators.BIRTHDATE_DAY_SELECT, day);
        driver.findElement(Locators.BIRTHDATE_MONTH).click();
        clickValueOfList(Locators.BIRTHDATE_MONTH_SELECT, month);
        driver.findElement(Locators.BIRTHDATE_YEAR).click();
        clickValueOfList(Locators.BIRTHDATE_YEAR_SELECT, year);
        driver.findElement(Locators.PHONE_INPUT_FIELD).sendKeys(phone_number);

        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LIST_VALUE_LOCATION)));
        javaWaitSec(2);
        clickValueOfList(Locators.LIST_VALUE_LOCATION, location);
    }

    public void clickYouTubeVideo() {
        WebElement youtube = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(youtube);
        driver.findElement(Locators.YOUTUBE_BUTTON).click();
    }

    public void openPrettyWomenPage() {
        driver.findElement(Locators.LINK_SEARCH).click();
    }


}
