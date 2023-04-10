
package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class DropDown {
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://demo.guru99.com/test/newtours/reservation.php";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
   //     options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(url);
        WebElement dropDown = driver.findElement(By.name("passCount"));
        Select passangers = new Select(dropDown);
//passangers.selectByIndex(1);
        passangers.selectByIndex(1);
WebElement radioBtn = driver.findElement(By.name("tripType"));
radioBtn.click();
        sleep(3000);
        driver.close();
}
}
