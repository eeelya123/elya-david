package AddName;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class GetPrice {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.get(url);
        Thread.sleep(2000);
        // open ryanair
        driver.get("https://www.saucedemo.com/inventory.html\\");
        Thread.sleep(2000);


        Thread.sleep(4000);
        WebElement search = driver.findElement(By.id("user-name"));
        search.click();
        search.sendKeys(new CharSequence[]{"standard_user"});
        WebElement pw = driver.findElement(By.id("password"));
        pw.click();
        pw.sendKeys(new CharSequence[]{"secret_sauce"});
        WebElement Login = driver.findElement(By.id("login-button"));
        Login.click();
        Thread.sleep(4000);



        WebElement price = driver.findElement(By.className("inventory_item_price"));
        String priceOfIem= price.getText();
        System.out.println("The price of item is "+priceOfIem);
        Thread.sleep(4000);




        List<WebElement> prices = driver.findElements(By.className("inventory_item_price")); // מקבל ליסט עם כל המחירים
        for (WebElement pricesToAnalyze:prices){
           String pattern =  pricesToAnalyze.getText();
           System.out.println("price found" + pattern);
        }

        Thread.sleep(4000);
       /* base.seleniumClose(driver);
*/

    }
    }