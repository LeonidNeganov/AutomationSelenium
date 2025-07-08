package test.tetsLayer;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import test.Pages.DP;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest {

    //    @Test(dataProvider = "data-provider", dataProviderClass = DP.class)
    @Test(dataProvider = "data-provider")
    public void nameTest(String val) {
        Steps.inputText(val);
        String result = Steps.getSearchResult(val);
        Assert.assertEquals(result, val, "Not equals result");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{{"Buy iPhone 16 and iPhone 16 Plus - Apple"}
//                ,
//                {"Buy iPhone 15 and iPhone 15 Plus - Apple"},
//                {"Buy iPhone 16e - Apple"}
        };
    }
}
