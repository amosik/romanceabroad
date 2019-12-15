package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test(dataProvider = "RegistrationLink", dataProviderClass = DataProviders.class)
    public void signInLink(String email) {
        Reports.log("Registration link test");
        mainPage.clickSignInLink();
        mainPage.completeRegistration(email, Data.password);
        if (driver.findElement(Locators.EMAIL_AND_PASSWORD_FIELDS_LOGIN_FORM_PAGE).isDisplayed()) {
            Assert.assertTrue(driver.findElement(Locators.ALLERT_ERROR_MESSAGE).isDisplayed());
        }
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
    }

    @Test(dataProvider = "RegistrationButton3FirstPartEmail", dataProviderClass = DataProviders.class)
    public void signInLinkNegativeEmail(String email, boolean requirement) {
        mainPage.clickSignInLink();
        mainPage.signInNegativeEmail(email);
        if (!requirement) {
            Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            Assert.assertTrue(driver.findElement(Locators.ALLERT_ERROR_MESSAGE).isDisplayed());
        }
    }

    @Test(dataProvider = "RegistrationButton3FirstPartPassword", dataProviderClass = DataProviders.class)
    public void signInLinkNegativePassword(String password, boolean requirement) {
        mainPage.clickSignInLink();
        mainPage.signInNegativePassword(password);
        if (!requirement) {
            Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            Assert.assertTrue(driver.findElement(Locators.ALLERT_ERROR_MESSAGE).isDisplayed());
        }
    }




    @Test(dataProvider = "RegistrationButton1", dataProviderClass = DataProviders.class)
    public void joinForFreeNowButton1(String email, String name, boolean requirement) {
        System.out.println(email);
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart(email, Data.password);
        if (!requirement) {
            Reports.log("Error message is not displayed");
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR_MESSAGE).isDisplayed());
        } else {
            mainPage.completeSecondRegistrationPart(name, Data.day, Data.month,
                    Data.year, Data.phone_number, Data.city, Data.location);
        }
    }

    @Test(dataProvider = "RegistrationButton2", dataProviderClass = DataProviders.class)
    public void joinForFreeNowButton2(String email, String password, String day, String month, String year,
                                      String phone_number, String city, String location) {
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart(email, password);
        mainPage.completeSecondRegistrationPart(mainPage.generateNewNumbers(Data.user_name, 5), day, month,
                year, phone_number, city, location);
    }

    @Test(dataProvider = "RegistrationButton3FirstPartEmail", dataProviderClass = DataProviders.class)
    public void joinForFreeButton3NegativeTestsEmail(String email, boolean requirement) {
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPartNegativeEmail(email);
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR_MESSAGE).isDisplayed());
            Assert.assertTrue(driver.findElement(Locators.EMAIL_AND_PASSWORD_FIELDS_MODAL_WINDOW).isDisplayed());
        }
    }

    @Test(dataProvider = "RegistrationButton3FirstPartPassword", dataProviderClass = DataProviders.class)
    public void joinForFreeButton3NegativeTestsPassword(String password, boolean requirement){
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPartNegativePassword(password);
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR_MESSAGE).isDisplayed());
            Assert.assertTrue(driver.findElement(Locators.EMAIL_AND_PASSWORD_FIELDS_MODAL_WINDOW).isDisplayed());
            }

        }

}

