import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUI{
    String currentUrlGift;

    @Test
    public void gifts() {
        driver.findElement(Locators.LINK_GIFT).click();
        currentUrlGift = driver.getCurrentUrl();
        System.out.println(currentUrlGift);
        Assert.assertEquals(currentUrlGift, Data.expectedUrGift);
    }
}
