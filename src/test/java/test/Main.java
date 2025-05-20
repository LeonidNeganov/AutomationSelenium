package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(10000);

        WebElement dissmisButton = driver.findElement(By.cssSelector("#nav-main > div.nav-left > div > div > div.glow-toaster-footer > span.a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss > span > input"));
        dissmisButton.click();

        WebElement searchBar = driver.findElement(By.cssSelector("[aria-label=\"Search Amazon\"]"));
        System.out.println(searchBar.getTagName());
        System.out.println(searchBar.getLocation());
        WebElement searchBarXpath = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        System.out.println(searchBarXpath.getTagName());
        System.out.println(searchBarXpath.getLocation());

        WebElement searchIcon = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        System.out.println(searchIcon.getTagName());
        System.out.println(searchIcon.getLocation());

        WebElement searchIconXpath = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        System.out.println(searchIconXpath.getTagName());
        System.out.println(searchIconXpath.getLocation());

        WebElement todaysDeals = driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_gb']"));
        System.out.println(todaysDeals.getTagName());
        System.out.println(todaysDeals.getLocation());

        WebElement todaysDealsXpath = driver.findElement(By.xpath("//*[@data-csa-c-content-id=\"nav_cs_customerservice\"]"));
        System.out.println(todaysDealsXpath.getTagName());
        System.out.println(todaysDealsXpath.getLocation());

        WebElement sell = driver.findElement(By.cssSelector("[data-csa-c-content-id=\"nav_cs_sell\"]"));
        System.out.println(sell.getTagName());
        System.out.println(sell.getLocation());

        WebElement sellXpath = driver.findElement(By.xpath("//*[@data-csa-c-content-id=\"nav_cs_sell\"]"));
        System.out.println(sellXpath.getTagName());
        System.out.println(sellXpath.getLocation());

        // xpath //*[contains(@class,"icp-nav-flag-us")]
        WebElement flagIcon = driver.findElement(By.cssSelector("span.icp-nav-flag-us"));
        System.out.println(flagIcon.getTagName());
        System.out.println(flagIcon.getLocation());

        WebElement flagIconXpath = driver.findElement(By.xpath("//*[contains(@class,'icp-nav-flag-us')]"));
        System.out.println(flagIconXpath.getTagName());
        System.out.println(flagIconXpath.getLocation());

        WebElement iconNext = driver.findElement(By.cssSelector("i.a-icon-next-rounded"));
        System.out.println(iconNext.getTagName());
        System.out.println(iconNext.getLocation());

        WebElement iconNextXpath = driver.findElement(By.xpath("//*[contains(@class,\"a-icon-next-rounded\")]"));
        System.out.println(iconNextXpath.getTagName());
        System.out.println(iconNextXpath.getLocation());
        iconNext.click();


        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }

}
