package test.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.coreLayer.Driver;

import java.time.Duration;


public class AdminHomePage extends BasePage {

    String url = "https://school-dev.mos.ru/";
    String loginText = "308 507 680 74";
    String passwordText = "6wL3skDC";
    By enterButton = By.xpath("//div[contains(text(),'Войти')]");
    By login = By.xpath("//input[@id='login']");
    By password = By.xpath("//input[@id='password']");
    By submit = By.xpath("//button[@id='bind']");
    By banner = By.xpath("//div[contains(text(), 'Административная')]");
    By adminForm = By.xpath("//div[contains(@class, 'react-grid-item')]");
    By adminButton = By.xpath("//div[contains(text(), 'Администратор системы')]");
    By filterField = By.xpath("//input[contains(@class, 'hot_search_callback_input')]");
    By fosButton = By.xpath("//div[@class='panel panel-body']//div[@class='media-body']//h6[contains(text(), 'ФОС')]");
    By psevdonim = By.xpath("//td[text() = 'aupd']");
    By quickAction = By.xpath("//button[contains(text(), 'Быстрые действия')]");
    By quickGenerate = By.xpath("//a[contains(text(), 'Генерация ссылки')]");
    By getTokenForm = By.xpath("//label[contains(text(),' Взять данные из токена')]//span");
    By tokenInputForm = By.xpath("//textarea[@name ='fos.token']");
    By buttonGenerateLink = By.xpath("//button[@type='submit'][contains(text(), 'Генерировать ссылку')]");
    By exitButton = By.xpath("//div[contains(text(), 'Выйти')]");


    public void openAdmin() {
        Driver.openPage(url);
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(enterButton));
        driver.findElement(enterButton).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(login));
        driver.findElement(login).sendKeys(loginText);
        driver.findElement(password).sendKeys(passwordText);
        driver.findElement(submit).click();
    }

    public String getAdminPanelBannerText(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(banner));
        return driver.findElement(banner).getText();
    }

    public void clickExitButton(){
        driver.findElement(exitButton).click();
    }

    public String checkStartPage(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(enterButton));
        return driver.findElement(enterButton).getText();
    }

    public void openListFos() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(adminForm));
        try {
            driver.findElement(adminForm).click();

        } finally {
            driver.findElement(adminButton).click();
        }
//        driver.findElement(adminForm).click();
//        driver.findElement(adminButton).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(fosButton));
        driver.findElement(fosButton).click();
    }


    public void findFos() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(filterField));
        driver.findElement(filterField).click();
        driver.findElement(filterField).sendKeys("aupd");
        driver.findElement(filterField).sendKeys(Keys.ENTER);

    }

    public void selectFos() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(psevdonim));
        driver.findElement(psevdonim).click();

    }

    public String checkFosAupd() {
        return driver.findElement(psevdonim).getText();
    }

    public void generateLinkForm() {
        driver.findElement(quickAction).click();
        driver.findElement(quickGenerate).click();
    }

    public void getTokenForm() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(getTokenForm));
        driver.findElement(getTokenForm).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(tokenInputForm));

    }

    public void inputToken() {
        String token = Driver.getCookieNamed("aupd_token").toString();
        driver.findElement(tokenInputForm).sendKeys(token.replaceAll("aupd_token=(.*); expires.*","$1"));
    }

    public void generateLink() {
        driver.findElement(buttonGenerateLink).click();
    }

}
