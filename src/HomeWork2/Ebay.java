package HomeWork2;

import Selenium.SelenuimBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        ChromeDriver driver = base.seleniumInit("https://www.ebay.com/");
        Thread.sleep(4000);

        WebElement search = driver.findElement(By.id("gh-ac"));
        search.sendKeys("USB", Keys.ENTER);
        Thread.sleep(4000);
        base.seleniumClose(driver);

    }
    }
