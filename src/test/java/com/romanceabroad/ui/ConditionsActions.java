package com.romanceabroad.ui;

import com.romanceabroad.ui.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConditionsActions {

    @Test
    public void searchNames() {
        List<String> crunchifyList = new ArrayList<>(Arrays.asList("Tanua", "Alla_24", "Marina_mari_", "Aliftina1978"));
        if (crunchifyList.contains("Marina_mari_")) ;
        {
            System.out.println(crunchifyList);
        }
    }

    @Test
    public void attention() {

        if (Data.check1.equals(Data.check1) && Data.check2.equals(Data.check2)) {
            System.out.println("We can find our checks");
        } else {
            Assert.fail("We can't find our checks");
        }
    }

    @Test
    public void searchAge() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(36, 43, 26, 46));
        if (crunchifyList1.contains(43)) ;
        {
            System.out.println(crunchifyList1);
        }
    }

    @Test
    public void leftMenu() {
        Data.phrase = "Advertising";
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList(Data.phrase, "Terms of use", "Privacy Policy",
                "Ukrainian women for marriage", "Shipping terms", "Travel to Ukraine", "Blog"));
        System.out.println(crunchifyList1);
        for (int i = 0; i < crunchifyList1.size(); i++) {
            Data.element = crunchifyList1.get(i);
            System.out.println(i + " iteration");

            if (Data.element.contains("Terms")) {
                System.out.println(Data.phrase);
            } else if (Data.element.equals("Sign in")) {
                System.out.println("Sign in");
            } else if (Data.element.contains("t")) {
                System.out.println(" 't' is inside of the list");
            } else {
                System.out.println("Can't find it");
            }
        }
    }


    @Test
    public void titleAssertion() {

        if (Data.expectedTitle.equals(Data.expectedTitle)) {
            String title = "Ukrainian women for marriage";
            if (title.equals(title)) {
                System.out.println("We can find our title");
            }
        }
    }

    @Test
    public void discount() {
        int number = 60;
        if (number == 60) {
            System.out.println("I cant find valid number");
        } else {
            System.out.println("I can't find valid number");
        }
    }
}