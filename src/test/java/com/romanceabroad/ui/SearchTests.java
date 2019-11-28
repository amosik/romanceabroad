package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.openPrettyWomenPage();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.actualUrl, Data.expectedUrlSearch);
        searchPage.clickDropDownListSortBy();

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

    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class)
    public void searchDifferentResults(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);

        searchPage.setDropDownByMinAgeByMaxAgeBySort(minAge, maxAge, sortBy);

        List<WebElement> infoAboutUser = searchPage.infoAboutUser();
        for (int i = 0; i < infoAboutUser.size(); i++) {
            String info = infoAboutUser.get(i).getText();
            System.out.println(info);


        }
    }
}

