package test.tetsLayer;

import io.qameta.allure.Step;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test.Pages.HomePage;
import test.Pages.SearchPage;
import test.coreLayer.Driver;

public class Steps {

    private static Logger LOGGER = LoggerFactory.getLogger(Steps.class);

    @Step("Open browser")
    public static void openBrowser(String URL) {
        LOGGER.info("Open browser");
        Driver.getDriver();
        Driver.openPage(URL);
        Driver.setPrefference();
    }

    @Step("Input text")
    public static void inputText(String val) {
        HomePage hp = new HomePage();
        hp.clickSearchButton();
        hp.inputInSearchbar(val);
    }

    @Step("Search text")
    public static String getSearchResult(String val) {
        SearchPage sp = new SearchPage();
        return sp.getProductText(val);
    }

    @Step("Quit browser")
    public static void quitBrowser() {
        LOGGER.info("Quit browser");
        Driver.quit();
    }
}
