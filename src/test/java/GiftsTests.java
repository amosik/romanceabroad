import org.testng.annotations.Test;

public class GiftsTests extends BaseUI{

    @Test
    public void gifts() {
        mainPage.clickGiftsLink();
        softAssert.assertEquals(Data.currentUrlGift, Data.expectedUrGift, "Url is wrong");
    }
}
