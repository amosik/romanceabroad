import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewTests extends BaseUI{
    String currentUrlView;

    @Test
    public void view() {
        driver.findElement(Locators.LINK_VIEW).click();
        currentUrlView = driver.getCurrentUrl();
        System.out.println(currentUrlView);
        Assert.assertEquals(currentUrlView, Data.expectedUrlView);
    }
}
