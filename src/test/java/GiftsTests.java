import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUI{

    @Test
    public void gifts() {
        driver.findElement(Locators.LINK_GIFT).click();
        Data.currentUrlGift = driver.getCurrentUrl();
        System.out.println(Data.currentUrlGift);
        Assert.assertEquals(Data.currentUrlGift, Data.expectedUrGift);
    }
}
