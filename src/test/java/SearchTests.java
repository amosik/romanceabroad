import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        driver.findElement(Locators.LINK_SEARCH).click();
        Data.currentUrlSearch = driver.getCurrentUrl();
        Assert.assertEquals(Data.currentUrlSearch, Data.expectedUrlSearch);
        searchPage.clickDropDownListSortBy();
        Assert.assertTrue(driver.findElement(Locators.DROP_DOWN_BY_NAME).isDisplayed());

    }

    @Test
    public void selectRandomDropDownListSortBy() {
        driver.findElement(Locators.LINK_SEARCH).click();
        for (int i = 0; i < 6; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_SORT_BY, "Sort by");
            searchPage.javaWaitSec(2);
        }
    }

    @Test
    public void selectRandomDropDownListByAge() {
        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeOfDropDownListByMaxAge = searchPage.getSizeDropDownList(Locators.DROP_DOWN_MAX_AGE);
        System.out.println(sizeOfDropDownListByMaxAge);
        for (int i = 0; i < sizeOfDropDownListByMaxAge; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_MAX_AGE, "Max age");
            driver.findElement(Locators.BUTTON_SEARCH).click();
            searchPage.javaWaitSec(2);
        }
    }
}

