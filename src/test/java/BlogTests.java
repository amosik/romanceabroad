import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlogTests extends BaseUI {

    @Test
    public void blog() {
        mainPage.clickBlogLink();
    }

    @Test
    public void leftMenu() {
        String phrase = "Advertising";
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList(phrase, "Terms of use", "Privacy Policy", "Ukrainian women for marriage", "Shipping terms", "Travel to Ukraine", "Blog"));
        System.out.println(crunchifyList1);
        for (int i = 0; i < crunchifyList1.size(); i++) {
            String element = crunchifyList1.get(i);
            System.out.println(i + " iteration");

            if (element.contains("Terms")) {
                System.out.println(phrase);
                break;
            }
            if (element.equals("Sign in")) {
                System.out.println("Sign in");
            }
            if (element.contains("t")) {
                System.out.println(" 't' is inside of the list");
            }else {
                System.out.println("Can't find it");
            }

        }
    }

}
