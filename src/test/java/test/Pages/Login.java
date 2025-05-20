package test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.coreLayer.Driver;

import java.time.Duration;

public class Login extends BasePage {
    String url = "https://school-dev.mos.ru/";
    String loginText = "308 507 680 74";
    String passwordText = "6wL3skDC";
    By enterButton = By.xpath("//div[contains(text(),'Войти')]");
    By login = By.xpath("//input[@id='login']");
    By password = By.xpath("//input[@id='password']");
    By submit = By.xpath("//button[@id='bind']");
    By banner = By.xpath("//div[contains(text(), 'Административная')]");

    public void getLoginPage() {
        Driver.openPage(url);
    }

    public void clickEnterButton() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(enterButton));
        driver.findElement(enterButton).click();
    }

    public void inputLogin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(login));
        driver.findElement(login).sendKeys(loginText);
    }

    public void inputPassword() {
        driver.findElement(password).sendKeys(passwordText);
    }

    public void submitToChoice() {
        driver.findElement(submit).click();
    }

    public String getAdminPanelBannerText() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(banner));
        return driver.findElement(banner).getText();
    }
}
