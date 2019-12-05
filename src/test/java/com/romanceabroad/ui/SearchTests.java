package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.clickPrettyWomenLink();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.actualUrl, Data.expectedUrlSearch);
        searchPage.clickDropDownListSortBy();

    }

    @Test
    public void selectRandomDropDownListSortBy() {
        mainPage.clickPrettyWomenLink();
        for (int i = 0; i < 6; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_SORT_BY, "Sort by");
            searchPage.javaWaitSec(2);
        }
    }

    @Test
    public void selectRandomDropDownListByMaxAge() {
        mainPage.clickPrettyWomenLink();
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

        mainPage.clickPrettyWomenLink();
        mainPage.getDropDownListByText(Locators.DROP_DOWN_MIN_AGE, minAge);
        mainPage.getDropDownListByText(Locators.DROP_DOWN_MAX_AGE, maxAge);
        mainPage.getDropDownListByText(Locators.DROP_DOWN_SORT_BY, sortBy);
        searchPage.clickSearchButtonOnPrettyWomenPage();
        mainPage.javaWaitSec(3);

        List<WebElement> infoAboutUser = searchPage.getInfoAboutUser();
        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                String info = infoAboutUser.get(i).getText();
                String[] splitedPhrase = info.split(", ");
                String age = splitedPhrase[1];
                int ageNum = Integer.parseInt(age);

                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + " is correct");
                } else {
                    Assert.fail("Wrong age " + ageNum);
                }
            }
        }
        mainPage.javaWaitSec(3);
        infoAboutUser = searchPage.getInfoAboutUser();


    }
}

