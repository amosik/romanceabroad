import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void ajaxClick(WebElement element){

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void ajaxClick(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }

    public void ajaxClick(By by, int index) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElements(by).get(index));
    }

    public void performClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void performClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

}
