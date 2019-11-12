import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    @Test
    public void tourToUkraine() {

        mainPage.clickTourToUkraineLink();
    }

    @Test
    public void attention() {
        String check1 = "ATTENTION! Tour does not include:";
        String check2 = "Flight tickets";

        if (check1.equals("ATTENTION! Tour does not include:")&& check2.equals("Flight tickets")) {
            System.out.println("We can find our checks");
        }else {
            Assert.fail("We can't find our checks");
        }
    }

}

