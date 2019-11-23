import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;

public class BlogTests extends BaseUI {

    public static final boolean testCase101 = true;
    public static final boolean testCase102 = true;
    public static final boolean testCase103 = true;

    @Test(priority = 3, enabled = testCase101, groups = {"firefox"})
    public void blogInfoContentTestCase101() {
        mainPage.clickBlogLink();
        Assert.assertTrue(driver.findElement(Locators.TITLE).isDisplayed());
        List<WebElement> infoContentUnderTitleBlog = driver.findElements(Locators.INFO_CONTENT_BLOG);
        System.out.println(infoContentUnderTitleBlog.size());
        for (int i = 0; i < infoContentUnderTitleBlog.size(); i++) {
            String info = infoContentUnderTitleBlog.get(i).getText();
            System.out.println(info);
            infoContentUnderTitleBlog.get(i).click();

            if (info.contains("Kharkov Dating & Marriage Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleKharkov, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKharkov, Data.actualUrl);
            }

            if (info.contains("Kiev marriage agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleKiev, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKiev, Data.actualUrl);
            }

            if (info.contains("Odessa Dating Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleOdessa, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlOdessa, Data.actualUrl);
            }

            if (info.contains("Mail Order Girls Catalog")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleMail, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMail, Data.actualUrl);
            }

            if (info.contains("Beautiful Ukrainian Girls Online")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianGirl, Data.actualUrl);
            }

            if (info.contains("Beautiful Brides in Ukraine")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianBride, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianBride, Data.actualUrl);
            }

            if (info.contains("Eastern European Girls")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUEuropeanGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlEuropeanGirl, Data.actualUrl);
            }

            if (info.contains("Marriage And Dating Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleMarriageAgency, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMarriageAgency, Data.actualUrl);
            }

            if (info.contains("Kiev Matchmaking Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleDatingSite, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlDatingSite, Data.actualUrl);
            }

            if (info.contains("Find Ukrainian Girlfriend Online")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkraineGirlfriend, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkraineGirlfriend, Data.actualUrl);
            }

            if (info.contains("Slavic Lady for Marriage")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleSlavicLady, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSlavicLady, Data.actualUrl);
            }

            if (info.contains("How To Marry Ukraine Women")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleHowToMarry, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlHowToMarry, Data.actualUrl);
            }

            if (info.contains("Ukrainian dating website for singles")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleForSingle, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlForSingle, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoContentUnderTitleBlog = driver.findElements(Locators.INFO_CONTENT_BLOG);
        }
    }

    @Test(priority = 2, enabled = testCase102, groups = {"ie"})
    public void backButtonTestCase102() {
        mainPage.clickBlogLink();
        List<WebElement> links = driver.findElements(Locators.INFO_CONTENT_BLOG);
        links.get(new Random().nextInt(links.size())).click();
        driver.findElement(Locators.BACK_BUTTON_BLOG_PAGE).click();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrBlog, Data.actualUrl);
    }

    @Test(priority = 1, enabled = testCase103, groups = {"chrome"})
    public void infoMenuTestCase103() {
        mainPage.clickBlogLink();
        List<WebElement> infoMenuLeftSide = driver.findElements(Locators.INFO_MENU_LEFT_SIDE);
        System.out.println(infoMenuLeftSide.size());
        for (int i = 0; i < 6; i++) {
            String info = infoMenuLeftSide.get(i).getText();
            System.out.println(info);
            infoMenuLeftSide.get(i).click();

            if (info.contains("Advertising")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleAdvertising, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlAdvertising, Data.actualUrl);
            }

            if (info.contains("Terms of use")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTermsOfUse, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTermsOfUse, Data.actualUrl);
            }

            if (info.contains("Privacy Policy")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrivacyPolicy, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPrivacyPolicy, Data.actualUrl);
            }

            if (info.contains("Ukrainian women for marriage")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianWomenForMarriage, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianWomenForMarriage, Data.actualUrl);
            }

            if (info.contains("Shipping terms")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleShipping, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlShipping, Data.actualUrl);
            }

            if (info.contains("Travel to Ukraine")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTravel, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTravel, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoMenuLeftSide = driver.findElements(Locators.INFO_MENU_LEFT_SIDE);
        }
    }
}
