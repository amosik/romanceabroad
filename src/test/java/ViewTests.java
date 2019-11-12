import org.testng.annotations.Test;

public class ViewTests extends BaseUI {

    @Test
    public void view() {
        mainPage.clickHowWeWorkLink();
    }

    @Test
    public void titleAssertion() {
        String title = "Ukrainian women for marriage";
        if (title.equals("Ukrainian women for marriage")) {
            System.out.println("We can find our title");
        }
    }

}
