package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FooterTests extends BaseUI{

    @Test
    public void footerLinks() {
        mainPage.clickHowWeWorkLink();
        List<WebElement> getAllFooterLinks = howWeWorkPage.footerLinks();
        for (int i = 0; i <6 ; i++) {
            if (i == 3) {
                continue;
            }
            Data.info = getAllFooterLinks.get(i).getText();
            System.out.println(Data.info);
            mainPage.ajaxClick(getAllFooterLinks.get(i));
            Data.actualTitle = mainPage.getTitleH1();
            if (i==0) {
                Assert.assertEquals(Data.expectedTitleContactUs, Data.actualTitle);
                Assert.assertTrue(driver.findElement(Locators.CONTACT_US_FORM).isDisplayed());
            }

            if (i==1) {
                Assert.assertEquals(Data.expectedTitleSiteMap, Data.actualTitle);
                Assert.assertTrue(driver.findElement(Locators.SITE_MAP_CONTENT).isDisplayed());
            }

            if (i==2) {
                Assert.assertEquals(Data.expectedTitleHowWeWork, Data.actualTitle);
                Assert.assertTrue(driver.findElement(Locators.INFO_MENU_22LINKS_LEFT_SIDE).isDisplayed());
            }

            if (i==4) {
                Assert.assertEquals(Data.expectedTitlePrivacy, Data.actualTitle);
                Assert.assertTrue(driver.findElement(Locators.INFO_MENU_22LINKS_LEFT_SIDE).isDisplayed());

                List<WebElement> privacyHeading = mainPage.getHeading();
                for (int k = 0; k <privacyHeading.size(); k++) {
                    Data.info = privacyHeading.get(k).getText();
                    System.out.println(Data.info);

                    if (k==0) {
                        Assert.assertEquals(Data.info,Data.privacyHeading1);
                    }

                    if (k==1) {
                        Assert.assertEquals(Data.info,Data.privacyHeading2);
                    }

                    if (k==2) {
                        Assert.assertEquals(Data.info,Data.privacyHeading3);
                    }

                    if (k==3) {
                        Assert.assertEquals(Data.info,Data.privacyHeading4);
                    }

                    if (k==4) {
                        Assert.assertEquals(Data.info,Data.privacyHeading5);
                    }

                    if (k==5) {
                        Assert.assertEquals(Data.info,Data.privacyHeading6);
                    }

                    if (k==6) {
                        Assert.assertEquals(Data.info,Data.privacyHeading7);
                    }

                    if (k==7) {
                        Assert.assertEquals(Data.info,Data.privacyHeading8);
                    }

                    if (k==8) {
                        Assert.assertEquals(Data.info,Data.privacyHeading9);
                    }
                }

            }

            if (i==5) {
                Assert.assertEquals(Data.expectedTitleTermsOfUse, Data.actualTitle);
                Assert.assertTrue(driver.findElement(Locators.INFO_MENU_22LINKS_LEFT_SIDE).isDisplayed());

                List<WebElement> termsHeading = mainPage.getHeading();
                for (int j = 0; j <termsHeading.size() ; j++) {
                    Data.info = termsHeading.get(j).getText();
                    System.out.println(Data.info);

                    if (j==0) {
                        Assert.assertEquals(Data.info,Data.termsHeading1);
                    }

                    if (j==1) {
                        Assert.assertEquals(Data.info,Data.termsHeading2);
                    }

                    if (j==2) {
                        Assert.assertEquals(Data.info,Data.termsHeading3);
                    }

                    if (j==3) {
                        Assert.assertEquals(Data.info,Data.termsHeading4);
                    }

                    if (j==4) {
                        Assert.assertEquals(Data.info,Data.termsHeading5);
                    }

                    if (j==5) {
                        Assert.assertEquals(Data.info,Data.termsHeading6);
                    }

                    if (j==6) {
                        Assert.assertEquals(Data.info,Data.termsHeading7);
                    }

                    if (j==7) {
                        Assert.assertEquals(Data.info,Data.termsHeading8);
                    }

                }

            }

            getAllFooterLinks = howWeWorkPage.footerLinks();
        }

    }
}
