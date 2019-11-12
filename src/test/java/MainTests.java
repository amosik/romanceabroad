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
    public void discount() {
        int number = 60;
        if (number==60){
            System.out.println("I cant find valid number");
        }else {
            System.out.println("I can't find valid number");
        }
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
            driver.get(Data.mainUrl);
            links = driver.findElements(Locators.TAB_LINKS);
        }
    }
}