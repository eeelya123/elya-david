package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;

public class GetText {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url ="https://shop.demoqa.com/my-account/";
        System.out.println("Starting...");
      /*  ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
       */
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.get(url);

        WebElement button = driver.findElement(By.name("register"));
        // Get the text from the button element
        String buttonText = button.getText();
        // Print the button text
        System.out.println("Button text: " + buttonText);


        sleep(3000);
        driver.close();
    }
}

