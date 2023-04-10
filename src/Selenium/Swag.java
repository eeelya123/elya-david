package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class Swag {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.saucedemo.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments(new String[]{"--start-maximized"});
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);


        driver.get(url);
        WebElement search = driver.findElement(By.id("user-name"));
        search.click();
        search.sendKeys(new CharSequence[]{"standard_user"});
        WebElement pw = driver.findElement(By.id("password"));
        pw.click();
        pw.sendKeys(new CharSequence[]{"secret_sauce"});
        WebElement Login = driver.findElement(By.id("login-button"));
        Login.click();
        Thread.sleep(5000L);
        driver.close();
    }
}

