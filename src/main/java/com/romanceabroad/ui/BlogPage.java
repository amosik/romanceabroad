package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public List<WebElement>blogInfoContent() {
        List<WebElement> infoContentUnderTitleBlog = driver.findElements(Locators.INFO_CONTENT_BLOG);
        return infoContentUnderTitleBlog;
    }

    public List<WebElement>infoMenu(){
        List<WebElement> infoMenuLeftSide = driver.findElements(Locators.INFO_MENU_22LINKS_LEFT_SIDE);
        return infoMenuLeftSide;
    }

    public void clickBackButton() {

        driver.findElement(Locators.BACK_BUTTON_BLOG_PAGE).click();
    }

}
