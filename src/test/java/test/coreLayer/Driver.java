package test.coreLayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    //    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
  private static WebDriver driver;

//    private Driver() {
//    }

    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver(options);
            driver = new ChromeDriver();
        }
        return driver;
//        return driver;
    }

    public static Cookie getCookieNamed(String str) {
        return driver.manage().getCookieNamed(str);
    }

    public static void openPage(String str) {
        driver.get(str);
    }

//    public static WebElement findElement(By by) {
//        return driver.findElement(by);
//    }

    public static void setPrefference() {
        driver.manage().window().maximize();
    }

    public static void switchWindow(int number) {
        Object[] windowHandles = driver.getWindowHandles().toArray();
//        driver.close();
        driver.switchTo().window((String) windowHandles[number]);
    }

    public static void quit() {
        driver.quit();
    }

}
