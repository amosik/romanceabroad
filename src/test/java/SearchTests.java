import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.clickPrettyWomenLink();
        Data.currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals(Data.currentUrlSearch, Data.expectedUrlSearch);
        searchPage.clickDropDownListSortBy();
        Assert.assertTrue(driver.findElement(Locators.DROP_DOWN_BY_NAME).isDisplayed());

    }

}

