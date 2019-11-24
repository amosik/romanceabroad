import org.testng.annotations.Test;

public class ContactUsTests extends BaseUI{

    @Test
    public void contactAdministrator() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.clickContactUsFooterHelp();
        contactUsPage.fillContactAdministrationForm(Data.reason, Data.user_name, Data.email, Data.subject, Data.message);
    }
}
