import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {
    By LINK_TOUR = By.cssSelector(".nav-link");
    int indexLinkTour = 5;

    @Test
    public void tourToUkraine() {
        driver.findElements(LINK_TOUR).get(indexLinkTour).click();
    }

}
