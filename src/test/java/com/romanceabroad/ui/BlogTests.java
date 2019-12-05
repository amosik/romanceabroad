package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class BlogTests extends BaseUI {


    @Test
    public void blogInfoContent() {
        mainPage.clickBlogLink();
        List<WebElement> infoContentUnderTitleBlog = blogPage.blogInfoContent();
        System.out.println(infoContentUnderTitleBlog.size());
        for (int i = 0; i < infoContentUnderTitleBlog.size(); i++) {
            Data.info = infoContentUnderTitleBlog.get(i).getText();
            System.out.println(Data.info);
            infoContentUnderTitleBlog.get(i).click();
            Data.actualTitle = mainPage.getTitleH1();
            Data.actualUrl = driver.getCurrentUrl();

            if (Data.info.contains("Kharkov dating agency")) {
                Assert.assertEquals(Data.expectedTitleKharkov, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKharkov, Data.actualUrl);
            }

            if (Data.info.contains("Kiev dating agency")) {
                Assert.assertEquals(Data.expectedTitleKiev, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKiev, Data.actualUrl);
            }

            if (Data.info.contains("Odessa dating agency")) {
                Assert.assertEquals(Data.expectedTitleOdessa, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlOdessa, Data.actualUrl);
            }

            if (Data.info.contains("Mail order girls")) {
                Assert.assertEquals(Data.expectedTitleMail, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMail, Data.actualUrl);
            }

            if (Data.info.contains("Beautiful ukrainian girls")) {
                Assert.assertEquals(Data.expectedTitleUkrainianGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianGirl, Data.actualUrl);
            }

            if (Data.info.contains("Real Ukrainian brides")) {
                Assert.assertEquals(Data.expectedTitleUkrainianBride, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianBride, Data.actualUrl);
            }

            if (Data.info.contains("Eastern European women")) {
                Assert.assertEquals(Data.expectedTitleUEuropeanGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlEuropeanGirl, Data.actualUrl);
            }

            if (Data.info.contains("Marriage agency in Ukraine")) {
                Assert.assertEquals(Data.expectedTitleMarriageAgency, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMarriageAgency, Data.actualUrl);
            }

            if (Data.info.contains("Kiev dating site")) {
                Assert.assertEquals(Data.expectedTitleDatingSite, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlDatingSite, Data.actualUrl);
            }

            if (Data.info.contains("Find Ukrainian girlfriend")) {
                Assert.assertEquals(Data.expectedTitleUkraineGirlfriend, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkraineGirlfriend, Data.actualUrl);
            }

            if (Data.info.contains("Slavic women for marriage")) {
                Assert.assertEquals(Data.expectedTitleSlavicLady, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSlavicLady, Data.actualUrl);
            }

            if (Data.info.contains("How to marry Ukraine lady")) {
                Assert.assertEquals(Data.expectedTitleHowToMarry, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlHowToMarry, Data.actualUrl);
            }

            if (Data.info.contains("Free Ukrainian dating site")) {
                Assert.assertEquals(Data.expectedTitleForSingle, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlForSingle, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoContentUnderTitleBlog = blogPage.blogInfoContent();
        }
    }

    @Test
    public void backButton() {
        mainPage.clickBlogLink();
        List<WebElement> links = blogPage.blogInfoContent();
        links.get(new Random().nextInt(links.size())).click();
        blogPage.clickBackButton();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrBlog, Data.actualUrl);
    }


    @Test
    public void infoMenu() {
        mainPage.clickBlogLink();
        List<WebElement> infoMenuLeftSide = blogPage.infoMenu();
        System.out.println(infoMenuLeftSide.size());
        for (int i = 0; i < 6; i++) {
            Data.info = infoMenuLeftSide.get(i).getText();
            System.out.println(Data.info);
            infoMenuLeftSide.get(i).click();
            Data.actualTitle = mainPage.getTitleH1();
            Data.actualUrl = driver.getCurrentUrl();

            if (Data.info.contains("Advertising")) {
                Assert.assertEquals(Data.expectedTitleAdvertising, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlAdvertising, Data.actualUrl);
            }

            if (Data.info.contains("Terms of use")) {
                Assert.assertEquals(Data.expectedTitleTermsOfUse, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTermsOfUse, Data.actualUrl);
            }

            if (Data.info.contains("Privacy Policy")) {
                Assert.assertEquals(Data.expectedTitlePrivacyPolicy, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPrivacyPolicy, Data.actualUrl);
            }

            if (Data.info.contains("How it works")) {
                Assert.assertEquals(Data.expectedTitleUkrainianWomenForMarriage, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianWomenForMarriage, Data.actualUrl);
            }

            if (Data.info.contains("Shipping terms")) {
                Assert.assertEquals(Data.expectedTitleShipping, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlShipping, Data.actualUrl);
            }

            if (Data.info.contains("Travel to Ukraine")) {
                Assert.assertEquals(Data.expectedTitleTravel, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTravel, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoMenuLeftSide = blogPage.infoMenu();
        }
    }
}
