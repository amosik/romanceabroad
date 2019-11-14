import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    @Test
    public void tourToUkraine() {

        mainPage.clickTourToUkraineLink();
    }

    @Test
    public void attention() {

        if (Data.check1.equals(Data.check1)&& Data.check2.equals(Data.check2)) {

            System.out.println("We can find our checks");
        }else {
            Assert.fail("We can't find our checks");
        }
    }

}

