package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {

    @DataProvider(name = "RegistrationLink")
    public static Object[][] testRegistrationLink() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationLink.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0],});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "RegistrationButton2")
    public static Object[][] testRegistrationButton1() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationButton.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });
        return out.toArray(new Object[out.size()][]);
    }

    @DataProvider(name = "RegistrationButton1")
    public static Object[][] testRegistrationButton2() {
        return new Object[][]{

                {Data.email2,Data.generate_user_name,true},
                {Data.email3,Data.generate_user_name,true},
                {Data.email4,Data.generate_user_name,false}

        };
    }

    @DataProvider(name = "Search")
    public static Object[][] testSearchFeature() {
        return new Object[][]{

                {"18","80","Name"},
                {"18","25","Default"},
                {"30","40","Views"},
                {"50","80","Registration date"},

        };
    }
}
