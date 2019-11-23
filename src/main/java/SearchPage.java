import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions{
    public SearchPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void clickDropDownListSortBy() {
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT_BY);
        getDropDownListByText(dropDownListSortBy, "Name");
    }

    public void clickSearchButtonOnPrettyWomenPage() {
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }

}
