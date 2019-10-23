import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaPage extends BaseActions{
    public MediaPage(WebDriver driver, WebDriverWait wait){

        super(driver, wait);
    }

    public void clickDropDownListSortBy(){
        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_MEDIA);
        getDropDownListByText(dropDownListMedia,"Views count");

    }

}
