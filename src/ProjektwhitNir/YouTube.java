package ProjektwhitNir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YouTube {


    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.get(url);
        Thread.sleep(2000);
        driver.get("https://www.youtube.com/");                  // open youtube
        Thread.sleep(3000);
        driver.findElement(By.name("search_query")).clear();  // clear search
        Thread.sleep(2000);
        driver.findElement(By.name("search_query")).sendKeys("berlin");  // search in YouTube
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click(); // click on search
        Thread.sleep(3000);

       // driver.findElement(By.id("channel-info")).click(); // close coke
        //driver.findElement(By.cssSelector("yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded")).click(); // close coke


    }
}

