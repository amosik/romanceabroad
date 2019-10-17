import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTests extends BaseUI {

    @Test
    public void view() {
        driver.findElement(Locators.LINK_VIEW).click();
        Data.currentUrlView = driver.getCurrentUrl();
        System.out.println(Data.currentUrlView);
        Assert.assertEquals(Data.currentUrlView, Data.expectedUrlView);
    }
}
