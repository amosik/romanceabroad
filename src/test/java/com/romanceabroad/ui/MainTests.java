package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MainTests extends BaseUI {

    @Test
    public void main() {
        mainPage.clickYouTubeVideo();
    }

    @Test
    public void home() {
        WebElement tabSearch = mainPage.tabHome();
        if(tabSearch.isDisplayed()){
            tabSearch.click();
        }else {
            Assert.fail("I can't find HOME tab");
        }
    }

    @Test
    public void tabLinks() {
        List<WebElement> links = mainPage.tabLinks();
        System.out.println(links.size());
        for (int i = 0; i < links.size() ; i++) {
            Data.info = links.get(i).getText();
            System.out.println(Data.info);
            links.get(i).click();

            if (Data.info.contains("HOW WE WORK")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleHowWeWork, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlHowWeWork, Data.actualUrl);
            }

            if (Data.info.contains("PRETTY WOMEN")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPrettyWomen, Data.actualUrl);
            }

            if (Data.info.contains("PHOTOS")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePhotos, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPhotos, Data.actualUrl);
            }

            if (Data.info.contains("GIFT")) {
             Data.actualTitle = driver.findElement(Locators.GIFT_TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleGifts, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlGifts, Data.actualUrl);
            }

            if (Data.info.contains("TOUR TO UKRAINE")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTourToUkraine, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTourToUkraine, Data.actualUrl);
            }

            if (Data.info.contains("BLOG")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleBlog, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrBlog, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            links = mainPage.tabLinks();
        }
    }

    @Test
    public void testLinksOnHowWeWorkPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        mainPage.openPrettyWomenPage();
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test
    public void print() {
        searchPage.javaWaitSec(3);
    }
}