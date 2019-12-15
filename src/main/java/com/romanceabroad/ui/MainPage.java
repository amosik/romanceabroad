package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void javaWaitSec(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickHowWeWorkLink() {

        driver.findElement(Locators.LINK_VIEW).click();
    }

    public void clickPhotosLink() {

        driver.findElement(Locators.LINK_PHOTOS).click();
    }

    public void clickGiftsLink() {

        driver.findElement(Locators.LINK_GIFT).click();
    }

    public void clickTourToUkraineLink() {

        driver.findElements(LINK_TOUR).get(Data.indexLinkTour).click();
    }

    public void clickBlogLink() {

        driver.findElement(Locators.LINK_BLOG).click();
    }

    public void clickSignInLink() {
        Reports.log("Click sign in link");
        driver.findElement(Locators.LINK_SIGN_IN).click();
    }

    public void clickPrettyWomenLink() {

        driver.findElement(Locators.LINK_SEARCH).click();
    }

    public void clickJoinForFreeNowButton() {

        driver.findElement(Locators.JOIN_FOR_FREE_NOW_BUTTON).click();
    }

    public void completeRegistration(String email, String password) {
        Reports.log("Wait email input field");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));

        Reports.log("Type email: " + email);
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(email);

        Reports.log("Type password: " + password);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(password);

        Reports.log("Click sign in button");
        driver.findElement(Locators.SIGN_IN_BUTTON_MODAL_WINDOW).click();

    }


    public void completeFirstRegistrationPart(String email, String password) {
        javaWaitSec(3);

        Reports.log("Type email " + email);
        driver.findElement(Locators.EMAIL).sendKeys(email);

        Reports.log("Type password: " + password);
        driver.findElement(Locators.PASSWORD).sendKeys(password);

        Reports.log("Click next button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeFirstRegistrationPartNegativeEmail(String email) {
        Reports.log("Type email: " + email);
        driver.findElement(Locators.EMAIL).sendKeys(email);

        Reports.log("Type password: " + Data.password);
        driver.findElement(Locators.PASSWORD).sendKeys(Data.password);

        Reports.log("Click next button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void signInNegativeEmail(String email) {
        Reports.log("Wait email input field");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));

        Reports.log("Type email: " + email);
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(email);

        Reports.log("Type password: " + Data.password);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(Data.password);

        Reports.log("Click sign in button");
        driver.findElement(Locators.SIGN_IN_BUTTON_MODAL_WINDOW).click();
        Data.actualUrl = driver.getCurrentUrl();
    }

    public void signInNegativePassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_INPUT_FIELD));

        Reports.log("Type email: " + Data.email1);
        driver.findElement(Locators.EMAIL_INPUT_FIELD).sendKeys(Data.email1);

        Reports.log("Type password: " + password);
        driver.findElement(Locators.PASSWORD_INPUT_FIELD).sendKeys(password);

        Reports.log("Click sign in button");
        driver.findElement(Locators.SIGN_IN_BUTTON_MODAL_WINDOW).click();
        Data.actualUrl = driver.getCurrentUrl();
    }

    public void completeFirstRegistrationPartNegativePassword(String password) {
        Reports.log("Type email: " + Data.email1);
        driver.findElement(Locators.EMAIL).sendKeys(Data.email1);

        Reports.log("Type password: " + password);
        driver.findElement(Locators.PASSWORD).sendKeys(password);

        Reports.log("Click email field");
        driver.findElement(Locators.EMAIL).click();

        Reports.log("Click next button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondRegistrationPart(String user_name, String day, String month, String year,
                                               String phone_number, String city, String location) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Reports.log("Type user name: " + user_name);
        driver.findElement(Locators.USER_NAME_INPUT_FIELD).sendKeys(user_name);

        Reports.log("Click list of days");
        driver.findElement(Locators.BIRTHDATE_DAY).click();

        Reports.log("Select day");
        clickValueOfList(Locators.BIRTHDATE_DAY_SELECT, day);

        Reports.log("Click list of month");
        driver.findElement(Locators.BIRTHDATE_MONTH).click();

        Reports.log("Select month");
        clickValueOfList(Locators.BIRTHDATE_MONTH_SELECT, month);

        Reports.log("Click list of year");
        driver.findElement(Locators.BIRTHDATE_YEAR).click();

        Reports.log("Select year");
        clickValueOfList(Locators.BIRTHDATE_YEAR_SELECT, year);

        Reports.log("Type phone number: " + phone_number);
        driver.findElement(Locators.PHONE_INPUT_FIELD).sendKeys(phone_number);

        Reports.log("Select confirmation checkbox");
        driver.findElement(Locators.CONFIRMATION_CHECKBOX).click();

        Reports.log("Clean location autofilling form");
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();

        Reports.log("Type city: " + city);
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);

        javaWaitSec(2);
        clickValueOfList(Locators.LIST_VALUE_LOCATION, location);
    }

    public WebElement emailInputField() {
        WebElement emailField = driver.findElement(Locators.EMAIL_INPUT_FIELD);
        return emailField;
    }

    public WebElement passwordInputField() {
        WebElement passwordField = driver.findElement(Locators.PASSWORD_INPUT_FIELD);
        return passwordField;
    }

    public WebElement confirmationCheckBox() {
        WebElement checkBoxConfirmation = driver.findElement(Locators.CONFIRMATION_CHECKBOX);
        return checkBoxConfirmation;
    }

    public WebElement tabHome() {
        WebElement tabSearch = driver.findElement(Locators.TAB_HOME);
        return tabSearch;
    }

    public void clickYouTubeVideo() {
        WebElement youtube = driver.findElement(Locators.YOUTUBE_LINK);
        driver.switchTo().frame(youtube);
        driver.findElement(Locators.YOUTUBE_BUTTON).click();
    }


    public List<WebElement> tabLinks() {
        List<WebElement> links = driver.findElements(Locators.TAB_LINKS);
        return links;
    }

    public List<WebElement> getHeading() {
        List<WebElement> heading = driver.findElements(Locators.HEADING);
        return heading;
    }


}
