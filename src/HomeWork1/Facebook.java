package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
    /*    String url = "https://www.facebook.com/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments(new String[]{"--start-maximized"});
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
      */
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);

        driver.get(url);
        driver.get("https://www.facebook.com/");

        WebElement username = driver.findElement(By.name("email"));
        username.click();
        username.sendKeys("NIR123");

        WebElement password = driver.findElement(By.name("pass"));
        password.click();
        password.sendKeys("el519616");

        WebElement Login = driver.findElement(By.name("login"));
        Login.click();
        driver.navigate().back();
        Thread.sleep(5000000000L);
        driver.close();
    }
}
