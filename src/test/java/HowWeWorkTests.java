import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HowWeWorkTests extends BaseUI {

    @Test
    public void view() {
        mainPage.clickHowWeWorkLink();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.actualUrl, Data.expectedUrlView);
    }

    @Test
    public void topLeftNavigationMenu() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.openMenuSignOnHowWeWorkPage();
        Assert.assertTrue(driver.findElement(Locators.LEFT_MENU_CONTENT).isDisplayed());
        List<WebElement> links = driver.findElements(Locators.LEFT_MENU_ITEMS);
        System.out.println(links.size());
        for (int i = 1; i < links.size() ; i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("Sign up")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleSignUp, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSignUp, Data.actualUrl);
            }

            if (info.contains("Login")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            }

            if (info.contains("News")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleNews, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlNews, Data.actualUrl);
            }

            if (info.contains("Polls")) {
                Data.actualTitle = howWeWorkPage.getTitle();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleLogin, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlLoginForm, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickHowWeWorkLink();
            howWeWorkPage.openMenuSignOnHowWeWorkPage();
            links = driver.findElements(Locators.LEFT_MENU_ITEMS);

        }
    }


}