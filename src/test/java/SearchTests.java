import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.openPrettyWomenPage();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.actualUrl, Data.expectedUrlSearch);
        searchPage.clickDropDownListSortBy();
        Assert.assertTrue(driver.findElement(Locators.DROP_DOWN_BY_NAME).isDisplayed());

    }

    @Test
    public void selectRandomDropDownListSortBy() {
        mainPage.openPrettyWomenPage();
        for (int i = 0; i < 6; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_SORT_BY, "Sort by");
            searchPage.javaWaitSec(2);
        }
    }

    @Test
    public void selectRandomDropDownListByMaxAge() {
        mainPage.openPrettyWomenPage();
        int sizeOfDropDownListByMaxAge = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListByMaxAge);
        for (int i = 0; i < sizeOfDropDownListByMaxAge; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Max age");
            searchPage.clickSearchButtonOnPrettyWomenPage();
            searchPage.javaWaitSec(2);
        }
    }
}

