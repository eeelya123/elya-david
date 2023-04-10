package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Math {

    public static void main(String[] args) throws InterruptedException {
      /*  SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        ChromeDriver driver = base.seleniumInit("https://www.calculator.net/");
        Thread.sleep(3000);
*/

        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);

        driver.get(url);
        driver.get("https://www.calculator.net/\"");


        WebElement search = driver.findElement(By.id("calcSearchTerm"));
        search.sendKeys("Math");                                 //Enter text in the search
        Thread.sleep(3000);

        //driver.findElement(By.id("bluebtn")).click();// Click on the search button

        WebElement button = driver.findElement(By.id("bluebtn"));
        String buttonText = button.getText();                       //Get text of button
        System.out.println("Button text: " + buttonText);

        Thread.sleep(3000);
       // base.seleniumClose(driver);

    }
}