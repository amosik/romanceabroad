import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickHowWeWorkLink(){
        driver.findElement(Locators.LINK_VIEW).click();

    }

    public void clickPhotosLink(){
        WebElement linkMedia = driver.findElement(Locators.LINK_PHOTOS);
        linkMedia.click();
    }

    public void clickGiftsLink(){
        driver.findElement(Locators.LINK_GIFT).click();

    }

    public void clickTourToUkraineLink(){
        driver.findElements(LINK_TOUR).get(Data.indexLinkTour).click();
    }

    public void clickBlogLink(){
        WebElement linkBlog = driver.findElement(Locators.LINK_BLOG);
        linkBlog.click();
    }

    public void clickSignInLink(){
        driver.findElement(Locators.LINK_SIGN_IN).click();


    }

    public void completeRegistration(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_BUTTON_MODAL_WINDOW).click();

    }


    public void completeFirstRegistrationPart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL)));
        driver.findElement(Locators.EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);
        //driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondRegistrationPart(){
        driver.findElement(Locators.USER_NAME_INPUT_FIELD).sendKeys(generateNewNumbers(Data.user_name, 5));
        driver.findElement(Locators.BIRTHDATE_DAY).click();
        driver.findElement(Locators.BIRTHDATE_DAY_SELECT).click();
        driver.findElement(Locators.BIRTHDATE_MONTH).click();
        driver.findElement(Locators.BIRTHDATE_MONTH_SELECT).click();
        driver.findElement(Locators.BIRTHDATE_YEAR).click();
        driver.findElement(Locators.BIRTHDATE_YEAR_SELECT).click();
        driver.findElement(Locators.PHONE_INPUT_FIELD).sendKeys(Data.phone_number);
        }

    public void clickYouTubeVideo(){
        WebElement youtube = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(youtube);
        driver.findElement(Locators.YOUTUBE_BUTTON).click();
    }

}
