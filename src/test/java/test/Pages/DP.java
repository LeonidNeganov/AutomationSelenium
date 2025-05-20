package test.Pages;

import org.testng.annotations.DataProvider;

public class DP {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Buy iPhone 16 and iPhone 16 Plus - Apple"},
                {"Buy iPhone 15 and iPhone 15 Plus - Apple"},
                {"Buy iPhone 16e - Apple"}
        };
    }
}
