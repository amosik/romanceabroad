import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;

public class BlogTests extends BaseUI {


    @Test
    public void blogInfoContent() {
        mainPage.clickBlogLink();
        List<WebElement> infoContentUnderTitleBlog = blogPage.blogInfoContent();
        System.out.println(infoContentUnderTitleBlog.size());
        for (int i = 0; i < infoContentUnderTitleBlog.size(); i++) {
            Data.info = infoContentUnderTitleBlog.get(i).getText();
            System.out.println(Data.info);
            infoContentUnderTitleBlog.get(i).click();

            if (Data.info.contains("Kharkov Dating & Marriage Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleKharkov, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKharkov, Data.actualUrl);
            }

            if (Data.info.contains("Kiev marriage agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleKiev, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlKiev, Data.actualUrl);
            }

            if (Data.info.contains("Odessa Dating Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleOdessa, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlOdessa, Data.actualUrl);
            }

            if (Data.info.contains("Mail Order Girls Catalog")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleMail, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMail, Data.actualUrl);
            }

            if (Data.info.contains("Beautiful Ukrainian Girls Online")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianGirl, Data.actualUrl);
            }

            if (Data.info.contains("Beautiful Brides in Ukraine")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianBride, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianBride, Data.actualUrl);
            }

            if (Data.info.contains("Eastern European Girls")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUEuropeanGirl, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlEuropeanGirl, Data.actualUrl);
            }

            if (Data.info.contains("Marriage And Dating Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleMarriageAgency, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlMarriageAgency, Data.actualUrl);
            }

            if (Data.info.contains("Kiev Matchmaking Agency")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleDatingSite, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlDatingSite, Data.actualUrl);
            }

            if (Data.info.contains("Find Ukrainian Girlfriend Online")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkraineGirlfriend, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkraineGirlfriend, Data.actualUrl);
            }

            if (Data.info.contains("Slavic Lady for Marriage")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleSlavicLady, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlSlavicLady, Data.actualUrl);
            }

            if (Data.info.contains("How To Marry Ukraine Women")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleHowToMarry, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlHowToMarry, Data.actualUrl);
            }

            if (Data.info.contains("Ukrainian dating website for singles")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleForSingle, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlForSingle, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoContentUnderTitleBlog = blogPage.blogInfoContent();
        }
    }

    @Test
    public void backButton() {
        mainPage.clickBlogLink();
        List<WebElement> links = blogPage.blogInfoContent();
        links.get(new Random().nextInt(links.size())).click();
        blogPage.clickBackButton();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrBlog, Data.actualUrl);
    }


    @Test
    public void infoMenu() {
        mainPage.clickBlogLink();
        List<WebElement> infoMenuLeftSide = blogPage.infoMenu();
        System.out.println(infoMenuLeftSide.size());
        for (int i = 0; i < 6; i++) {
            Data.info = infoMenuLeftSide.get(i).getText();
            System.out.println(Data.info);
            infoMenuLeftSide.get(i).click();

            if (Data.info.contains("Advertising")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleAdvertising, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlAdvertising, Data.actualUrl);
            }

            if (Data.info.contains("Terms of use")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTermsOfUse, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTermsOfUse, Data.actualUrl);
            }

            if (Data.info.contains("Privacy Policy")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrivacyPolicy, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPrivacyPolicy, Data.actualUrl);
            }

            if (Data.info.contains("Ukrainian women for marriage")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleUkrainianWomenForMarriage, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlUkrainianWomenForMarriage, Data.actualUrl);
            }

            if (Data.info.contains("Shipping terms")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleShipping, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlShipping, Data.actualUrl);
            }

            if (Data.info.contains("Travel to Ukraine")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTravel, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTravel, Data.actualUrl);
            }

            driver.get(Data.mainUrl);
            mainPage.clickBlogLink();
            infoMenuLeftSide = blogPage.infoMenu();
        }
    }
}
