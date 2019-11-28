package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class GiftsTests extends BaseUI{

    @Test
    public void gifts() {
        mainPage.clickGiftsLink();
        Data.actualUrl = driver.getCurrentUrl();
        softAssert.assertEquals(Data.actualUrl, Data.expectedUrlGifts, "Url is wrong");

    }
}
