package test.tetsLayer;

import org.testng.annotations.*;


public class BaseTest {

    private final String URL = "https://www.apple.com/";

    @BeforeTest
    public void before() {
//        Browser br = new Browser();
//        br.webDriver();
//        br.setPrefference();
//        webDriver();
//        setPrefference();
        Steps.openBrowser(URL);
    }

    @AfterTest
    public void after() {
//        Browser br = new Browser();
//        br.closeBrowser();
//        closeBrowser();
       Steps.quitBrowser();
//        Driver.quit();

    }
}
