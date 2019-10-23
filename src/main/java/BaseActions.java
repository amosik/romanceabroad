import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;
    By LINK_TOUR = By.cssSelector(".nav-link");

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void getDropDownListByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static String generateNewNumbers (String name, int length) {
        return name + RandomStringUtils.random(length, "123456789");
    }
}
