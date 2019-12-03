package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class ContactUsTests extends BaseUI{

    @Test
    public void contactAdministrator() {
        mainPage.clickHowWeWorkLink();
        howWeWorkPage.clickContactUsFooterHelp();
        mainPage.selectItemDropDownRandomOption(Locators.REASON_DROP_DOWN_LIST_CONTACT_US_PAGE, "Reason");
        mainPage.javaWaitSec(2);
        contactUsPage.fillContactAdministrationForm(Data.reason, Data.user_name, Data.email1, Data.subject, Data.message);
    }
}
