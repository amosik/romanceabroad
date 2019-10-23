import org.testng.annotations.Test;

public class SearchTests extends BaseUI {


    @Test
    public void search() {
        mainPage.clickPrettyWomenLink();
        searchPage.clickDropDownListSortBy();
    }

}

