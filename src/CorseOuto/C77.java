package CorseOuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C77 {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");

        driver.findElement(By.id("firstname")).sendKeys("eelyaa18593692");
        driver.findElement(By.id("lastname")).sendKeys("Elya");
        driver.findElement(By.id("email")).sendKeys("Elya@fenhbuwkn.com");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Beginner")).click();
        driver.findElement(By.id("next")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("streetname")).clear();
        driver.findElement(By.id("streetname")).sendKeys("Htzhnim");
        driver.findElement(By.id("streetnumber")).sendKeys("20");
        driver.findElement(By.id("city")).sendKeys("Sderot");
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(30000);

        driver.quit();
    }
}



