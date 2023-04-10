package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

    public static void main(String[] args){
        SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.wikipedia.org/");
        ChromeDriver driver = base.seleniumInit("https://www.wikipedia.org/");

        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys("sderot", Keys.ENTER);

       // Thread.sleep(2000);
        base.seleniumClose(driver);

    }

}
