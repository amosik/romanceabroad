package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test(dataProvider = "RegistrationLink", dataProviderClass = DataProviders.class)
    public void signInLink(String email) {
        mainPage.clickSignInLink();
        mainPage.completeRegistration(email, Data.password);
        WebElement emailField = mainPage.emailInputField();
        mainPage.ajaxSendKeys(emailField, email);
        WebElement passwordField = mainPage.passwordInputField();
        mainPage.ajaxSendKeys(passwordField, Data.password);
        mainPage.ajaxClick(Locators.SIGN_IN_BUTTON_LOGIN_FORM_PAGE);
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
    }


    @Test(dataProvider = "RegistrationButton2", dataProviderClass = DataProviders.class)
    public void joinForFreeNowButton1(String email, String name, boolean requirement) {
        System.out.println(email);
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart(email, Data.password);
        if (!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR_MESSAGE).isDisplayed());
        } else {
            mainPage.completeSecondRegistrationPart(name, Data.day, Data.month,
                    Data.year, Data.phone_number, Data.city, Data.location);
        }
    }

    @Test(dataProvider = "RegistrationButton1", dataProviderClass = DataProviders.class)
    public void joinForFreeNowButton2(String email, String password, String day, String month, String year,
                                      String phone_number, String city, String location){
        mainPage.clickJoinForFreeNowButton();
        mainPage.completeFirstRegistrationPart(email, password);
        mainPage.completeSecondRegistrationPart(mainPage.generateNewNumbers(Data.user_name, 5), day, month,
                year, phone_number, city, location);
    }
}


