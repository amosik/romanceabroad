package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowWeWorkTests extends BaseUI {

    @Test
    public void view() {
        mainPage.clickHowWeWorkLink();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.actualUrl, Data.expectedUrlView);
    }

    @Test
    public void topLeftNavigationMenu() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.openMenuSignOnHowWeWorkPage();
        List<WebElement> links = howWeWorkPage.topLeftNavigationMenu();
        System.out.println(links.size());
        for (int i = 1; i < links.size(); i++) {
            if (i == 3) {
                continue;
            }
            Data.info = links.get(i).getText();
            System.out.println(Data.info);
            links.get(i).click();
            Data.actualTitle = mainPage.getTitleH1();
            Data.actualUrl = driver.getCurrentUrl();

            if (i == 1) {
                Assert.assertEquals(Data.expectedTitleSignUp, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSignUp, Data.actualUrl);
            }

            if (i == 2) {
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginFormSlash, Data.actualUrl);
            }

            if (i == 4) {
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickHowWeWorkLink();
            howWeWorkPage.openMenuSignOnHowWeWorkPage();
            links = howWeWorkPage.topLeftNavigationMenu();

        }
    }
}
