package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickDropDownListSortBy() {
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT_BY);
        getDropDownListByText(dropDownListSortBy, "Name");
    }

    public void clickSearchButtonOnPrettyWomenPage() {
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }

    public List<WebElement> infoAboutUser() {
        List<WebElement> links = driver.findElements(Locators.GET_INFO_ABOUT_USER);
        return links;
    }

    public void setDropDownByMinAgeByMaxAgeBySort(String minAge, String maxAge, String sortBy) {
        driver.findElement(Locators.LINK_SEARCH).click();
        MainPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MIN_AGE), minAge);
        MainPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_MAX_AGE), maxAge);
        MainPage.getDropDownListByText(driver.findElement(Locators.DROP_DOWN_SORT_BY), sortBy);
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }
}
