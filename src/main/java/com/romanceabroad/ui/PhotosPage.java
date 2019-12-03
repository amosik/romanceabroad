package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PhotosPage extends BaseActions {
    public PhotosPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickDropDownListSortBy() {
        WebElement dropDownListMedia = driver.findElement(Locators.DROP_DOWN_MEDIA);
        getDropDownListByText(dropDownListMedia, "Views count");
    }

    public  List<WebElement> getUserProfileLinks() {
        List<WebElement> userProfileLinks = driver.findElements(Locators.LINKS_TAB_USER_PROFILE);
        return userProfileLinks;
    }

}
