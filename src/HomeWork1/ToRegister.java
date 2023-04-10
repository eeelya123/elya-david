package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRegister {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI\n";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
driver.get(url);
        driver.get("http://advantageonlineshopping.com/#/");
        driver.findElement(By.id("menuUser")).click();
        Thread.sleep(2000);
        driver.quit();

    }
    }
