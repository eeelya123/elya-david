package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase() ;
        ChromeDriver driver = base.seleniumInit("https://demo.applitools.com/#");
        WebElement user = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement pw = driver.findElement(By.cssSelector("input[type='password']"));
        user.click();
        user.click();
        user.sendKeys("Elaya");
        pw.click();
        pw.clear();
        pw.sendKeys("123");
        WebElement login = driver.findElement(By.id("log-in"));
        login.click();
        Thread.sleep(2000);
        WebElement serch = driver.findElement(By.cssSelector("input[type='text']"));
        serch.click();
        serch.clear();
        serch.sendKeys("test");
        Thread.sleep(2000);
        base.seleniumClose(driver);

    }
}


