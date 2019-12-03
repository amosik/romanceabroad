package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage extends BaseActions {
    public ContactUsPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void fillContactAdministrationForm(String reason, String user_name, String email, String subject, String message) {
        driver.findElement(Locators.YOUR_NAME).sendKeys(user_name);
        driver.findElement(Locators.YOUR_EMAIL).sendKeys(email);
        driver.findElement(Locators.SUBJECT).sendKeys(subject);
        driver.findElement(Locators.MESSAGE).sendKeys(message);
    }


}
