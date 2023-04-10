package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Youtube {
    public static void main(String[] args) {
        String url ="https://www.youtube.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
    //    options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement search = driver.findElement(By.id("search-input"));
        search.click();
        search.sendKeys("meduza");
        driver.close();
        //Thread.sleep(5000);
        System.out.println("stop test");
    }
}
