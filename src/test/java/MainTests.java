import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainTests extends BaseUI{

    @Test
    public void main() {
        WebElement youtube = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(youtube);
        driver.findElement(Locators.YOUTUBE_BUTTON).click();
    }
}