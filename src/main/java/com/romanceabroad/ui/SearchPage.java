package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BaseActions {

    @FindBy(css = "input#main_search_button_user_advanced")
    WebElement buttonSearch;

    public SearchPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickDropDownListSortBy() {
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_SORT_BY);
        getDropDownListByText(dropDownListSortBy, "Name");
    }

    public void clickSearchButtonOnPrettyWomenPage() {
        buttonSearch.click();
    }

    public List<WebElement> getInfoAboutUser() {
        List<WebElement> links = driver.findElements(Locators.GET_INFO_ABOUT_USER);
        return links;
    }

    public List<WebElement> getInfoAboutUserByName() {
        List<WebElement> name = driver.findElements(Locators.GET_INFO_ABOUT_USER_BY_NAME);
        return name;
    }

   /* public void setDropDownByMinAgeByMaxAgeBySort(String minAge, String maxAge, String sortBy) {
        driver.findElement(Locators.LINK_SEARCH).click();
        getDropDownListByText(Locators.DROP_DOWN_MIN_AGE, minAge);
        getDropDownListByText(Locators.DROP_DOWN_MAX_AGE, maxAge);
        getDropDownListByText(Locators.DROP_DOWN_SORT_BY, sortBy);
        driver.findElement(Locators.BUTTON_SEARCH).click();
    }*/

}
