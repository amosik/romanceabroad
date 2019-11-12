import org.openqa.selenium.By;

public class Locators {
    //Search page
    public static final By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_SORT = By.xpath("//div[@class='form-inline']//select");

    //Registration page
    public static final By LINK_SIGN_IN = By.cssSelector("a[href='https://romanceabroad.com/users/login_form']");
    public static final By EMAIL_INPUT_FIELD = By.xpath("//input[@name='email']");
    public static final By PASSWORD_INPUT_FIELD = By.xpath("//input[@name='password']");
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@type='submit']");
    public static final By JOIN_NOW_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By EMAIL = By.cssSelector("#email");
    public static final By PASSWORD = By.cssSelector("#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By USER_NAME_INPUT_FIELD = By.cssSelector("#nickname");
    public static final By PHONE_INPUT_FIELD = By.cssSelector("input[name='data[phone]']");
    public static final By BIRTHDATE_DAY = By.cssSelector("#daySelect");
    public static final By BIRTHDATE_DAY_SELECT = By.xpath("//ul//li[@data-handler='selectDay']//a[text()='5']");
    public static final By BIRTHDATE_MONTH = By.cssSelector("#monthSelect");
    public static final By BIRTHDATE_MONTH_SELECT = By.xpath("//ul//li[@data-handler='selectMonth']//a[text()='Mar']");
    public static final By BIRTHDATE_YEAR = By.cssSelector("#yearSelect");
    public static final By BIRTHDATE_YEAR_SELECT = By.xpath("//ul//li[@data-handler='selectYear']//a[text()='1992']");
    public static final By CONFIRMATION_CHECKBOX = By.cssSelector("#confirmation");


    //Media page
    public static final By LINK_MEDIA = By.xpath("//a[text()='PHOTOS']");
    public static final By DROP_DOWN_MEDIA = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    public static final By TAB_LINKS = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By TAB_HOME = By.xpath("//a[text()='HOME']");


    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //View page
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Gifts page
    public static final By LINK_GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

    //Main page youtube
    public static final By YOUTUBE_LINK = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON = By.cssSelector(".ytp-large-play-button.ytp-button");

}
