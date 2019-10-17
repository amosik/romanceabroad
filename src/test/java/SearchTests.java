import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void search() {
        driver.findElement(Locators.LINK_SEARCH).click();
        Data.currentUrlSearch = driver.getCurrentUrl();
        System.out.println(Data.currentUrlSearch);
        Assert.assertEquals(Data.currentUrlSearch, Data.expectedUrlSearch);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT);
        getDropDownListByText(dropDownListSortBy, "Name");

    }

}

