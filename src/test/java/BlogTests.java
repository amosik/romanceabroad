import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI{

    @Test
    public void blog() {
        WebElement linkBlog = driver.findElement(Locators.LINK_BLOG);
        linkBlog.click();
    }
}
