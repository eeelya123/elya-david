package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ISRAEL {


    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(option);
        driver.get(url);
        Thread.sleep(2000);

        // open israir
        driver.get("https://www.israir.co.il/");
        Thread.sleep(2000);

        // close Advertising
        driver.findElement(By.cssSelector("#adoric_smartbox_70e95703d033b > div.adoric_element.element-shape.closeLightboxButton > button > svg")).click();
        Thread.sleep(2000);

        // close coke
        driver.findElement(By.cssSelector("body > div.CookieMessage > div > button:nth-child(1) > i")).click();
        Thread.sleep(4000);

        // close Advertising
        driver.findElement(By.cssSelector("#adoric_smartbox_49cef01968fe > div.adoric_element.element-shape.closeLightboxButton > button > svg > polygon")).click();
        Thread.sleep(4000);

        // Select a flight
        driver.findElement(By.cssSelector("#mainContentDiv > div.templateCol.sortable.ui-sortable.rowSection > li > section > div.comp-summaryEngine__slider.show > div.comp-summaryEngine__wizard > div > div.summaryContainer__body.col-9 > div.summaryContainer__boxes > div > section:nth-child(1) > div > div.box.moduleBox.radiogroup.subBox > label.custom-radio.checkIcon.active-radio > span")).click();
        Thread.sleep(4000);

        // Select a
        driver.findElement(By.cssSelector("#mainContentDiv > div.templateCol.sortable.ui-sortable.rowSection > li > section > div.comp-summaryEngine__slider.show > div.comp-summaryEngine__wizard > div > div.summaryContainer__body.col-9 > div.summaryContainer__boxes > div > section:nth-child(1) > div > div.routeBox.radiogroup.col.col-6.subBox > label.custom-radio.checkIcon.oneWayWrapper.active-radio")).click();
        Thread.sleep(4000);




    }
}