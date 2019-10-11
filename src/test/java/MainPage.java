import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlView;
    String currentUrlSearch;
    String expectedUrlView = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By LINK_MEDIA = By.xpath("//a[text()='PHOTOS']");
    By LINK_GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    By LINK_TOUR = By.cssSelector(".nav-link");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.cssSelector("a[href='https://romanceabroad.com/users/login_form']");
    By EMAIL_INPUT_FIELD = By.xpath("//input[@name='email']");
    By PASSWORD_INPUT_FIELD = By.xpath("//input[@name='password']");
    By BUTTON_SIGN_IN = By.xpath("//button[@type='submit']");
    int indexLinkTour = 5;
    int timeDelay = 5;
    String currentUrlGift;
    String expectedUrGift = "https://romanceabroad.com/store/category-sweets";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @Test
    public void howWeWork() {
        driver.findElement(LINK_VIEW).click();
        currentUrlView = driver.getCurrentUrl();
        System.out.println(currentUrlView);
        Assert.assertEquals(currentUrlView, expectedUrlView);
    }

    @Test
    public void prettyWomen() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void photos() {
        WebElement linkMedia = driver.findElement(LINK_MEDIA);
        linkMedia.click();
    }

    @Test
    public void gifts() {
        driver.findElement(LINK_GIFT).click();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift,expectedUrGift );
    }

    @Test
    public void tourToUkraine() {
        driver.findElements(LINK_TOUR).get(indexLinkTour).click();
    }

    @Test
    public void blog() {
        WebElement linkBlog = driver.findElement(LINK_BLOG);
        linkBlog.click();
    }

    @Test
    public void signInButton() {
        driver.findElement(LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(timeDelay, TimeUnit.SECONDS);
        driver.findElement(EMAIL_INPUT_FIELD).sendKeys("test@gmail.com");
        driver.findElement(PASSWORD_INPUT_FIELD).sendKeys("1234test");
        driver.findElement(BUTTON_SIGN_IN).click();
    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }
}
