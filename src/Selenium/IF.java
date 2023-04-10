package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static java.lang.Thread.sleep;


/*
 */
public class IF {


    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String ur = "http://advantageonlineshopping.com/#/";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
      //  options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);

        driver.get(ur);

        String url = driver.getCurrentUrl();
        if (url.contains("http://advantageonlineshopping.com/#/")) {  // אם הכתובת של האתר זה.. אז תדפיס לי את המלל הזה
            System.out.println("you are good");
        }
String titel = driver.getTitle();
        System.out.println(titel);
        String pagesource = driver.getPageSource();

        driver.get("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiVmoe6krv9AhVN66QKHRLQB-8QPAgI");
        driver.navigate().back();
        driver.navigate().forward();   //ללכת קדימה
        driver.navigate().refresh();
        driver.navigate().back();


        sleep(3000);
        driver.close();

    }
}
