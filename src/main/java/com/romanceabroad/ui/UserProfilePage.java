package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserProfilePage extends BaseActions {
    public UserProfilePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public String getNameTitle () {
        String name1 = driver.findElement(Locators.TITLE).getText();
        return name1;
    }

    public String getNameItem () {
        String name2 = driver.findElement(Locators.GET_NAME_ITEM).getText();
        return name2;
    }

    public String getButtonName () {
        String buttonName = driver.findElement(Locators.SEND_MESSAGE_BUTTON).getText();
        return buttonName;
    }




}
