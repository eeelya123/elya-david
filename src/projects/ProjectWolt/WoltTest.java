package projects.ProjectWolt;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WoltTest {


    public static void main(String[] args)  throws InterruptedException{
        String url = "https://www.google.com/search?q=wolt&oq=wolt&aqs=chrome..69i57.3267j0j15&sourceid=chrome&ie=UTF-8";
        System.out.println("Starting");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        Thread.sleep(3000);

        //open Wolt
        driver.get("https://wolt.com/");
        Thread.sleep(3000);

        //close cookiePopUp
        WebElement acceptCookie =  driver.findElement(By.xpath("/html/body/div[5]/div/div/div/button[2]/div[3]"));
        acceptCookie.click();
        Thread.sleep(3000);

        //click signup
        WebElement signUpButton =  driver.findElement(By.cssSelector("div.sc-eda0895a-3"));
        signUpButton.click();

        //click on email

        WebElement Email = driver.findElement(By.cssSelector("input#method-select-email.sc-8b48855d-0"));
        Email.sendKeys("nir@test.com");
        Thread.sleep(2000);

        //click on next

        Thread.sleep(2000);

        // close user
        WebElement closeUser =  driver.findElement(By.xpath("/html/body/div[7]/div/aside/div[1]/button"));
        closeUser.click();
        Thread.sleep(2000);

        // click on place in TLV
        WebElement PlaceInTlv =  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div/div[2]/div[3]/a"));
        PlaceInTlv.click();
        Thread.sleep(4000);

        // click on next
        WebElement next =  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div/div/div[7]/div/div[2]/div/div/div[1]/a/div/div/div[2]"));
        next.click();
        Thread.sleep(6000);

        // click on Restaurant












    }

}