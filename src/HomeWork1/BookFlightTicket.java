package HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class BookFlightTicket {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);

        driver.get(url);
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");

        Thread.sleep(2000);

        List<WebElement>tripType = driver.findElements(By.name("tripType"));
        WebElement OneWay = tripType.get(1);
        OneWay.click();
        Thread.sleep(2000);

        WebElement radioBtn = driver.findElement(By.name("tripType"));   //Radio
        radioBtn.click();
        WebElement Passengers = driver.findElement(By.name("passCount"));//Passengers
        Select Passengerss = new Select(Passengers);
        Passengerss.selectByIndex(2);

        WebElement Frome = driver.findElement(By.name("fromPort"));//Frome
        Select Departing = new Select(Frome);
        Departing.selectByIndex(2);

        WebElement On = driver.findElement(By.name("fromMonth"));//ON
        Select Onn = new Select(On);
        Onn.selectByIndex(4);

        WebElement day = driver.findElement(By.name("fromDay"));//on-Day
        Select dayy = new Select(day);
        dayy.selectByIndex(4);

        WebElement To = driver.findElement(By.name("toPort"));//to Port
        Select to = new Select(To);
        to.selectByIndex(4);

        WebElement Returning = driver.findElement(By.name("toMonth"));//to Returning
        Select Returningg = new Select(Returning);
        Returningg.selectByIndex(1);

        WebElement Day = driver.findElement(By.name("toDay"));//to toDay
        Select d = new Select(Day);
        d.selectByIndex(4);

       // driver.findElement(By.name("servClass")).click();

        WebElement Airline = driver.findElement(By.name("airline"));//Airline
        Select a = new Select(Airline);
        a.selectByIndex(2);

        driver.findElement(By.name("findFlights")).click();






    }
}
