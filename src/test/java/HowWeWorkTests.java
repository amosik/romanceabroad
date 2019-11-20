import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowWeWorkTests extends BaseUI {

    @Test
    public void view() {
        mainPage.clickHowWeWorkLink();
        Data.currentUrlView = driver.getCurrentUrl();
        Assert.assertEquals(Data.currentUrlView, Data.expectedUrlView);
    }


    @Test
    public void topNavigationMenu() {
        driver.findElement(Locators.LINK_VIEW).click();
        driver.findElement(Locators.MENU_SIGN).click();
        Assert.assertTrue(driver.findElement(Locators.LEFT_MENU_CONTENT).isDisplayed());
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_ITEMS);
        System.out.println(links.size());
        for (int i = 1; i < links.size() ; i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("Sign up")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrlSignUp = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleSignUp, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSignUp, Data.actualUrlSignUp);
            }

            if (info.contains("Login")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrlLogin = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrlLogin);
            }

            if (info.contains("News")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrlNews = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleNews, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlNews, Data.actualUrlLogin);
            }

            if (info.contains("Polls")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrlLogin = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrlLogin);
            }

            driver.get(Data.mainUrl);
            driver.findElement(Locators.LINK_VIEW).click();
            driver.findElement(Locators.MENU_SIGN).click();
            links = driver.findElements(Locators.LEFT_MENU_ITEMS);

        }

    }
}