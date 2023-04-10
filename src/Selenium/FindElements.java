package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        SelenuimBase base = new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement fristColuname = driver.findElement(By.className("rt-resizable-header-content"));
        List<WebElement> headers = driver.findElements(By.className("rt-resizable-header-content"));
        for (WebElement header : headers) {
        }
        base.seleniumClose(driver);
    }

}
