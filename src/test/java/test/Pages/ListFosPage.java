package test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.coreLayer.Driver;

import java.time.Duration;

public class ListFosPage extends BasePage {
    String url = "";
    By fosTitle = By.xpath("//h6[@class='content-group text-semibold']");
    By filterField = By.xpath("//input[contains(@class, 'hot_search_callback_input')]");
    By psevdonim = By.xpath("//td[text() = 'aupd']");
    By cancelFilterButton = By.xpath("//a[@title='Отменить фильтры']");
    By cancelFilterText = By.xpath("//span[@class='text-semibold hot_search_count text-primary']");

    public void openListFosPage() {
        Driver.openPage(url);
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(cancelFilterButton));
        driver.findElement(cancelFilterButton).click();
    }

    public String getfosTitle() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(fosTitle));
        return driver.findElement(fosTitle).getText();
    }

    public String filterFos() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(filterField));
        driver.findElement(filterField).click();
        driver.findElement(filterField).sendKeys("aupd");
        driver.findElement(filterField).sendKeys(Keys.ENTER);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(cancelFilterButton));
        return driver.findElement(cancelFilterText).getText();

    }

    public String checkFosAupd() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(psevdonim));
        return driver.findElement(psevdonim).getText();
    }

    public void disableFilter() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(cancelFilterButton));
        driver.findElement(cancelFilterButton).click();
    }
}
