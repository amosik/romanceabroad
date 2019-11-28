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
        for (int i = 1; i < links.size() ; i++) {
            Data.info = links.get(i).getText();
            System.out.println(Data.info);
            links.get(i).click();

            if (Data.info.contains("Sign up")) {
                Data.actualTitle = mainPage.getTitleH1();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleSignUp, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSignUp, Data.actualUrl);
            }

            if (Data.info.contains("Login")) {
                Data.actualTitle = mainPage.getTitleH1();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            }

            if (Data.info.contains("News")) {
                Data.actualTitle = mainPage.getTitleH1();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleNews, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlNews, Data.actualUrl);
            }

            if (Data.info.contains("Polls")) {
                Data.actualTitle = mainPage.getTitleH1();
                Data.actualUrl = driver.getCurrentUrl();
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