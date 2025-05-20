package test.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class HomePage extends BasePage {

    private static Logger LOGGER = LoggerFactory.getLogger(HomePage.class);

    By searchButton = By.xpath("//a[@id='globalnav-menubutton-link-search']");
    By searchbar = By.xpath("//input[@class='globalnav-searchfield-input']");


    public void clickSearchButton() {
        LOGGER.info("Clicking search button");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchButton));
        WebElement element = driver.findElement(searchButton);
        element.click();

    }

    public void inputInSearchbar(String val) {
        LOGGER.info("Input in search bar");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchbar));
        WebElement searchbarElement = driver.findElement(searchbar);
        searchbarElement.sendKeys(val);
        searchbarElement.sendKeys(Keys.ENTER);

    }


}
