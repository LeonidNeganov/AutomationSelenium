package test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import test.coreLayer.Driver;
//import test.tetsLayer.BaseTest;

import java.time.Duration;

public class SearchPage extends HomePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchPage.class);

//    By iphoneName = By.xpath("//a[text() = " + val);

    public String getProductText(String val) {

        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(iphoneName));
//        WebDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = '" + val + "'" + "]")));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = '" + val + "'" + "]")));
        WebElement prodElement = driver.findElement(By.xpath("//a[text() = '" + val + "'" + "]"));
        LOGGER.info("Running 'getProductText' method, text - {}", prodElement.getText());
//        System.out.println(prodElement.getText());
        return prodElement.getText();

    }
}
