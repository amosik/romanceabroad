import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class MainTests extends BaseUI {

    @Test
    public void main() {
        mainPage.clickYouTubeVideo();
    }

    @Test
    public void home() {
        WebElement tabSearch = driver.findElement(Locators.TAB_HOME);
        if(tabSearch.isDisplayed()){
            tabSearch.click();
        }else {
            Assert.fail("I can't find HOME tab");
        }
    }

    @Test
    public void tabLinks() {
        List<WebElement> links = driver.findElements(Locators.TAB_LINKS);
        System.out.println(links.size());
        for (int i = 0; i < links.size() ; i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("HOW WE WORK")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleHowWeWork, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlHowWeWork, Data.actualUrl);
                driver.findElement(Locators.PAGE_CONTENT_LEFT_MENU).isDisplayed();
            }

            if (info.contains("PRETTY WOMEN")) {
                Data.actualTitle = driver.findElement(Locators.TITLE).getText();
                Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPrettyWomen, Data.actualUrl);
                driver.findElement(Locators.PHOTOS_OF_WOMEN).isDisplayed();
            }

            if (info.contains("PHOTOS")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePhotos, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlPhotos, Data.actualUrl);
                driver.findElement(Locators.PHOTO_VIDEO_ALBUMS).isDisplayed();
            }

            if (info.contains("GIFT")) {
             Data.actualTitle = driver.findElement(Locators.GIFT_TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleGifts, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlGifts, Data.actualUrl);
                driver.findElement(Locators.BESTSELLERS).isDisplayed();
                driver.findElement(Locators.BESTSELLERS_QUICK_VIEW).isDisplayed();
            }

            if (info.contains("TOUR TO UKRAINE")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleTourToUkraine, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrlTourToUkraine, Data.actualUrl);
            }

            if (info.contains("BLOG")) {
             Data.actualTitle = driver.findElement(Locators.TITLE).getText();
             Data.actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleBlog, Data.actualTitle);
                Assert.assertEquals(Data.expectedUrBlog, Data.actualUrl);
                driver.findElement(Locators.LEFT_MENU).isDisplayed();
            }

            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_LINKS);
        }
    }

    @Test
    public void testLinksOnHowWeWorkPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        mainPage.openPrettyWomenPage();
        mainPage.checkLinksOnWebPage("//img", "src");
    }

}