import org.testng.annotations.Test;

public class MediaTests extends BaseUI{

    @Test
    public void media() {
        mainPage.clickPhotosLink();
        mediaPage.clickDropDownListSortBy();

    }
}
