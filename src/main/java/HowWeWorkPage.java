import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public String getTitle() {
        String text = driver.findElement(Locators.TITLE).getText();
        return text;
    }

    public void openMenuSignOnHowWeWorkPage() {
        driver.findElement(Locators.MENU_SIGN_TOP_TAB).click();
    }


}
