import org.openqa.selenium.By;

public class Locators {
    //Search page
    public static final By LINK_SEARCH = By.cssSelector("a[href='https://romanceabroad.com/users/search']");

    //Registration page
    public static final By LINK_SIGN_IN = By.cssSelector("a[href='https://romanceabroad.com/users/login_form']");
    public static final By EMAIL_INPUT_FIELD = By.xpath("//input[@name='email']");
    public static final By PASSWORD_INPUT_FIELD = By.xpath("//input[@name='password']");
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@type='submit']");
    public static final By JOIN_NOW_BUTTON = By.cssSelector("#show-registration-block");
    public static final By EMAIL = By.cssSelector("#email");
    public static final By PASSWORD = By.cssSelector("#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By USER_NAME_INPUT_FIELD = By.cssSelector("#nickname");
    public static final By PHONE_INPUT_FIELD = By.cssSelector("input[name='data[phone]']");


    //Media page
    public static final By LINK_MEDIA = By.xpath("//a[text()='PHOTOS']");

    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");

    //View page
    public static final By LINK_VIEW = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");

    //Gifts page
    public static final By LINK_GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");

}
