package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }


    public void openMenuSignOnHowWeWorkPage() {
        driver.findElement(Locators.MENU_SIGN_TOP_TAB).click();
    }

    public void clickContactUsFooterHelp() {

        driver.findElement(Locators.FOOTER_HELP).click();
    }

    public List<WebElement>topLeftNavigationMenu() {
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_ITEMS);
        return links;
    }



}
