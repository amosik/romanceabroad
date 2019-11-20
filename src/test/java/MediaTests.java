import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI{

    @Test
    public void media() {
        mainPage.clickPhotosLink();
        Data.actualUrlPhotos = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlPhotos, Data.actualUrlPhotos);
        mediaPage.clickDropDownListSortBy();
        Assert.assertTrue(driver.findElement(Locators.DROP_DOWN_MEDIA_BY_VIEWS_COUNT).isDisplayed());

    }
}
