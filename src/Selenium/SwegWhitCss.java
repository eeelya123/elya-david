package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwegWhitCss {
    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com");
        WebElement user = driver.findElement(By.cssSelector("input['input_error form_input']"));
        WebElement pw = driver.findElement(By.cssSelector("input[type='password']"));
        user.click();
        user.click();
        user.sendKeys("standard_user");
        pw.click();
        pw.clear();
        pw.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(2000);
        base.seleniumClose(driver);
    }
}
