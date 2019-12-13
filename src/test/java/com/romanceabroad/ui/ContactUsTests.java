package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VideoListener.class)

public class ContactUsTests extends BaseUI {


    @Video(name = "Contact Administrator test")

    @Test
    public void contactAdministrator() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.clickContactUsFooterHelp();
        mainPage.selectItemDropDownRandomOption(Locators.REASON_DROP_DOWN_LIST_CONTACT_US_PAGE, "Reason");
        mainPage.javaWaitSec(2);
        contactUsPage.fillContactAdministrationForm(Data.reason, Data.user_name, Data.email1, Data.subject, Data.message);
    }
}
