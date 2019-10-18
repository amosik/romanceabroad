import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI{

    @Test
    public void media() {
        WebElement linkMedia = driver.findElement(Locators.LINK_MEDIA);
        linkMedia.click();
        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_MEDIA);
        getDropDownListByText(dropDownListMedia,"Views count");

    }
}
