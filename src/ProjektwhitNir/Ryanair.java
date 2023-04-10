package ProjektwhitNir;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Ryanair {
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
        driver.get("https://www.ryanair.com/gb/en");
        Thread.sleep(2000);

        // close coki
        driver.findElement(By.cssSelector("#cookie-popup-with-overlay > div > div.cookie-popup-with-overlay__buttons > button.cookie-popup-with-overlay__button")).click();
        Thread.sleep(2000);

        // Click on connect user
        driver.findElement(By.cssSelector("body > hp-app-root > hp-home-container > hp-home > hp-header > header > ry-header > div > div.header__center > hp-header-content-container > hp-header-content > hp-header-sections-group.hp-header-content__menu-right.ng-star-inserted > hp-header-menu-item:nth-child(4) > button > span")).click();
        Thread.sleep(2000);

        // Email address
        driver.findElement(By.cssSelector("#ry-modal-portal > div > ry-auth-popup-container > div > ry-auth-popup > div > ry-login > form > ry-auth-email > ry-input-d > div > input")).sendKeys("elya@test");
        Thread.sleep(2000);
        // Email address
        driver.findElement(By.cssSelector("#ry-modal-portal > div > ry-auth-popup-container > div > ry-auth-popup > div > ry-login > form > ry-auth-password > ry-input-d > div > input")).sendKeys("Elya123456");
        Thread.sleep(2000);
       // click on login
        driver.findElement(By.cssSelector("#ry-modal-portal > div > ry-auth-popup-container > div > ry-auth-popup > div > ry-login > form > ry-auth-submit > button")).click();
        Thread.sleep(2000);

        // click on from
        driver.findElement(By.cssSelector("#ry-modal-portal > div > ry-auth-popup-container > div > button > icon > span > svg")).click();
        Thread.sleep(2000);

        // click on web home
        driver.findElement(By.cssSelector("body > hp-app-root > hp-home-container > hp-home > hp-header > header > ry-header > div > div.header__left > a > icon > span > svg")).click();
        Thread.sleep(2000);
        // click on from
        driver.findElement(By.id("input-button__departure")).click();
        Thread.sleep(2000);
        // clear input from
        driver.findElement(By.id("input-button__departure")).clear();
        Thread.sleep(2000);
        //flight from
         driver.findElement(By.id("input-button__departure")).sendKeys("Tel Aviv");
        Thread.sleep(2000);
        //click on tel aviv
        driver.findElement(By.cssSelector("#ry-tooltip-1 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-origin-container > fsw-airports > div > fsw-airports-list > div.list__airports-container.ng-star-inserted > div.list__airports-scrollable-container.small-height > fsw-airport-item > span > span")).click();
        Thread.sleep(2000);
        //clear to
        driver.findElement(By.id("input-button__destination")).clear();
        Thread.sleep(2000);
        //Enter a flight destination
         driver.findElement(By.id("input-button__destination")).sendKeys("Berlin Brandenburg");
        Thread.sleep(2000);
        //click on Berlin Brandenburg
        driver.findElement(By.cssSelector("#ry-tooltip-3 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-destination-container > fsw-airports > div > fsw-airports-list > div.list__airports-container.ng-star-inserted > div.list__airports-scrollable-container.large-height > fsw-airport-item:nth-child(2) > span > span")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > hp-app-root > hp-home-container > hp-home > hp-search-widget-container > hp-search-widget > div > hp-flight-search-widget-container > fsw-flight-search-widget-container > fsw-flight-search-widget > div > div > div > button > span")).click();
        Thread.sleep(2000);
        // click date
        driver.findElement(By.cssSelector("body > hp-app-root > hp-home-container > hp-home > hp-search-widget-container > hp-search-widget > div > hp-flight-search-widget-container > fsw-flight-search-widget-container > fsw-flight-search-widget > div > fsw-flight-search-widget-controls-container > fsw-flight-search-widget-controls > div.flight-widget-controls__control-block.flight-widget-controls__control-block--details.ng-trigger.ng-trigger-collapseExpandElement.ng-tns-c79-4.ng-star-inserted > div > fsw-input-button.flight-widget-controls__control.flight-widget-controls__control--date.ng-tns-c79-4.ng-trigger.ng-trigger-datesFromTripTypeChange.input-button--connected-right > div > div.input-button__input.ng-star-inserted")).click();
        Thread.sleep(2000);
        // chose date from
        driver.findElement(By.cssSelector("#ry-tooltip-6 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-flexible-datepicker-container > fsw-datepicker > ry-datepicker-desktop > div.datepicker__calendars > calendar.datepicker__calendar.datepicker__calendar--left > calendar-body > div:nth-child(5) > div:nth-child(13) > div")).click();
        Thread.sleep(2000);
        // chose date to
        driver.findElement(By.cssSelector("#ry-tooltip-7 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-flexible-datepicker-container > fsw-datepicker > ry-datepicker-desktop > div.datepicker__calendars > calendar.datepicker__calendar.ng-star-inserted > calendar-body > div:nth-child(3) > div:nth-child(1) > div")).click();
        Thread.sleep(2000);
        // click search
        driver.findElement(By.cssSelector("body > hp-app-root > hp-home-container > hp-home > hp-search-widget-container > hp-search-widget > div > hp-flight-search-widget-container > fsw-flight-search-widget-container > fsw-flight-search-widget > div > div > div > button")).click();
        Thread.sleep(2000);







        WebElement price = driver.findElement(By.className("ng-tns-c163-15"));
        String priceOfIem= price.getText();
        System.out.println("The price of item is "+priceOfIem);
        Thread.sleep(4000);




        List<WebElement> prices = driver.findElements(By.className("ng-tns-c163-15")); // מקבל ליסט עם כל המחירים
        for (WebElement pricesToAnalyze:prices){
            String pattern =  pricesToAnalyze.getText();
            System.out.println("price found" + pattern);
        }


    }

}
