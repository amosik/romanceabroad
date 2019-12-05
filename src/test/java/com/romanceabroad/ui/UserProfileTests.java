package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserProfileTests extends BaseUI {

    @Test
    public void test() {
        mainPage.clickPrettyWomenLink();
        List<WebElement> infoAboutUser = searchPage.getInfoAboutUserByName();
        for (int i = 0; i < infoAboutUser.size(); i++) {
            String info = infoAboutUser.get(i).getText();
//            infoAboutUser.get(i).click();
            mainPage.ajaxClick2(infoAboutUser.get(i));
            Data.nameTitle = userProfilePage.getNameTitle();
            Data.nameItem = userProfilePage.getNameItem();

            if (info.equals(Data.nameTitle)) {
                Assert.assertEquals(info, Data.nameTitle, Data.nameItem);
                System.out.println("Names are match: " + info + ", " + Data.nameTitle + ", " + Data.nameItem);
                Assert.assertTrue(driver.findElement(Locators.MAIN_PHOTO).isDisplayed());
                Assert.assertTrue(driver.findElement(Locators.USER_PROFILE_DESCRIPTION).isDisplayed());
                Assert.assertTrue(driver.findElement(Locators.PROFILE_MENU).isDisplayed());
                Assert.assertTrue(driver.findElement(Locators.USER_INFO).isDisplayed());
            }

            if (userProfilePage.getButtonName().equals(Data.buttonName)) {
                System.out.println("Button names match: " + userProfilePage.getButtonName() + ", " + Data.buttonName);
            }else {
                Assert.fail("Button is missing or names do not match");
            }

            if (driver.findElement(Locators.THREE_DOTS_BUTTON).isDisplayed()) {
                driver.findElement(Locators.THREE_DOTS_BUTTON).click();
                Assert.assertTrue(driver.findElement(Locators.USER_MENU_ACTION).isDisplayed());
            }


            driver.get(Data.mainUrl);
            mainPage.clickPrettyWomenLink();
            infoAboutUser = searchPage.getInfoAboutUserByName();
        }

    }
}