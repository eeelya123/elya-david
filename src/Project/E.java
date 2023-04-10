package Project;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E {


    public static void main(String[] args)  throws InterruptedException{
        String url = "https://www.google.com/search?q=wolt&oq=wolt&aqs=chrome..69i57.3267j0j15&sourceid=chrome&ie=UTF-8";
        System.out.println("Starting");
        ChromeOptions options = new ChromeOptions();
        options.addArguments();



        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        Thread.sleep(3000);

        //open Wolt
        driver.get("https://wolt.com/");
        Thread.sleep(3000);

        //close cookie
       // driver.findElement(By.cssSelector();



    }

}