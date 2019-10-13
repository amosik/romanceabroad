import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI{
    @Test
    public void media() {
        WebElement linkMedia = driver.findElement(Locators.LINK_MEDIA);
        linkMedia.click();
    }
}
