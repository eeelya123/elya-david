package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eged {

    public static void main(String[] args) throws InterruptedException {
       /* SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        ChromeDriver driver = base.seleniumInit("https://www.egged.co.il/HomePage.aspx");
    */
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        driver.get("https://www.egged.co.il/HomePage.aspx");


        Thread.sleep(4000);

        WebElement from = driver.findElement(By.id("from"));
        from.sendKeys("Netanya");                                 //Enter text in the search
        Thread.sleep(3000);
        WebElement to = driver.findElement(By.id("to"));
        to.sendKeys("Sderot King David");                                 //Enter text in the search
        Thread.sleep(3000);
    }
}
