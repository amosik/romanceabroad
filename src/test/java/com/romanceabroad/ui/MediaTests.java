package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI{

    @Test
    public void media() {
        mainPage.openPhotosPage();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlPhotos, Data.actualUrl);
        mediaPage.clickDropDownListSortBy();

    }
}
