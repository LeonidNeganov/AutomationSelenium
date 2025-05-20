package test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.coreLayer.Driver;

import java.time.Duration;

public class FosPage extends AdminHomePage {

    By titleFos = By.xpath("//div[@class = 'site_header__title']");
//    By defaultRegion = By.xpath("//span[@class = 'select2-selection select2-selection--single']/span[@title='Москва']");
    By defaultRegion = By.xpath("//span[contains(@class,'select2-selection')]/span[@title='Москва']");
    By regionMoscow = By.xpath("//li[text() = 'Москва']");
    By confirmRegionButton = By.xpath("//button[@data-command='FosConfirmRegion']");
    By confirmProblemButton = By.xpath("//button[not(contains(@disabled, 'disabled'))]");
    By selectProblemBar = By.xpath("//span[@class = 'select2-selection__placeholder']");
    By selectProblemProchee = By.xpath("//li[text() = 'Прочее']");
    By selectProblemTakoiUchetnoiZapisiNet = By.xpath("//li[text() = 'Ошибка \"Такой учетной записи нет\"']");
    By roleUchenikcheckBox = By.xpath("//input[@value = 'student']/following-sibling::span");
    By registrationCheckBox = By.xpath("//input[@value = 'way_simplified']/following-sibling::span");
    By roleText = By.xpath("//p[text() = 'Выберите роль пользователя, у которого возникает ошибка']");
    By instructionText = By.xpath("(//div[@class='input-file_description'])[last()]/p");
    By buttonNewRepeat = By.xpath("//button[@id='do_repeat']");

    public void switchWindowFos() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Driver.switchWindow(1);
    }

    public String getTitleFos() {
        return driver.findElement(titleFos).getText();
    }

    public void selectRegion() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(defaultRegion));
        driver.findElement(defaultRegion).click();
        driver.findElement(regionMoscow).click();
        driver.findElement(confirmRegionButton).click();
    }

    public void selectProblemBar() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(selectProblemBar));
        driver.findElement(selectProblemBar).click();
    }

    public void selectProblemProchee() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(selectProblemProchee));
        driver.findElement(selectProblemProchee).click();
    }

    public void confirmProblem() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(confirmProblemButton));
        driver.findElement(confirmProblemButton).click();
    }

    public void selectProblemTUZN() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(selectProblemTakoiUchetnoiZapisiNet));
        driver.findElement(selectProblemTakoiUchetnoiZapisiNet).click();
    }

    public String checkRoleText() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(roleText));
        return driver.findElement(roleText).getText();
    }

    public void selectRoleUchenik() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(roleUchenikcheckBox));
        driver.findElement(roleUchenikcheckBox).click();
    }

    public void selectRegistrationType() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(registrationCheckBox));
        driver.findElement(registrationCheckBox).click();
    }

    public String checkInstruction() {
        WebDriverWait WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(buttonNewRepeat));
        return driver.findElement(instructionText).getText();
    }

    //Выберите роль пользователя, у которого возникает ошибка
}
