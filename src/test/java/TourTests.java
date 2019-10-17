import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {
    By LINK_TOUR = By.cssSelector(".nav-link");

    @Test
    public void tourToUkraine() {
        driver.findElements(LINK_TOUR).get(Data.indexLinkTour).click();
    }
}
