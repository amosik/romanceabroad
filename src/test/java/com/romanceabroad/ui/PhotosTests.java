package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotosTests extends BaseUI{

    @Test
    public void media() {
        mainPage.clickPhotosLink();
        Data.actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(Data.expectedUrlPhotos, Data.actualUrl);
        photosPage.clickDropDownListSortBy();
    }

    @Test
    public void testUserTabs() {
        mainPage.clickPhotosLink();
        List<WebElement> userTabs = photosPage.getUserProfileLinks();
        Data.actualTitle = mainPage.getTitleH1();
        Assert.assertEquals(Data.actualTitle, Data.expectedTitleGallery);
        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            Data.actualTitle = mainPage.getTitleH1();
            if (i == 0){
                Assert.assertEquals(Data.actualTitle, Data.expectedTitleAllPhotos);
            }else if(i == 1){
                Assert.assertEquals(Data.actualTitle, Data.expectedTitlePhoto);
            }else if(i == 2){
                Assert.assertEquals(Data.actualTitle, Data.expectedTitleVideo);
            }else if(i == 3){
                Assert.assertEquals(Data.actualTitle, Data.expectedTitleAlbums);
            }

            userTabs = photosPage.getUserProfileLinks();

        }

    }
}
