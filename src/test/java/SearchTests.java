import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.clickPrettyWomenLink();
        searchPage.clickDropDownListSortBy();
    }

    @Test
    public void searchNames() {
        List<String> crunchifyList = new ArrayList<>(Arrays.asList("Tanua", "Alla_24", "Marina_mari_", "Aliftina1978"));
        if (crunchifyList.contains("Marina_mari_")); {
            System.out.println(crunchifyList);
        }

    }

    @Test
    public void  searchAge() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(36, 43, 26, 46));
        if (crunchifyList1.contains(43)); {
            System.out.println(crunchifyList1);
        }
    }

}

