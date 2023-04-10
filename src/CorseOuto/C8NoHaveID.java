// https://www.youtube.com/watch?v=YZ43cOcbmLI&list=PLxSed3v6XL9uH4zw_k1SA9LLmh_OElPq8&index=8
/*
בשיעור הזה נלמד איך למצוא אלמנטים כשאין (אידי)
חלק גדול מהאתרים אין להם (אי די)
ישנם עוד דרכים למצוא אלמנטים לפי:ך
id,name,className,tagName,partialLink או linkText ,xpath,csssELECTOR
מציאת האלמנטי בצורה טובה תעמוד ב - 2 דרישות הבאות:
1. אלמנט יהיה יחודי
2. שהסיכוי שהוא ישתנה יהיה הקטן ביותר
אם מחר משנים את הקוד


שלוש חוקים למציאת אלמנט
לרוב אנחנו נשתמש ב
csssELECTOR
 (csssELECTOR)אנחנו נשתמש ב ID במקום
בעזרת הסלרטורID אני מוצא את ה

 */
package CorseOuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C8NoHaveID {

    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwi5nJjD3739AhWJOuwKHe9bAkoQPAgI";
        System.out.println("Starting...");
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        driver.get("https://automation.co.il/tutorials/selenium/demo1/indexID.html");

        driver.findElement(By.cssSelector("#firstname")).sendKeys("Elya");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Daniel");
        driver.findElement(By.cssSelector("#email")).sendKeys("eeelya@fsg132");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-next.btn-fill.btn-warning.btn-wd.btn-sm")).click();
        driver.findElement(By.cssSelector(".fa.fa-child")).click();
        driver.findElement(By.cssSelector("[name='next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("streetname")).clear();
        driver.findElement(By.cssSelector("#streetname")).sendKeys("hatzhnim2");
        driver.findElement(By.cssSelector("#streetnumber")).sendKeys("hatzhnim2");
        driver.findElement(By.cssSelector("#city")).sendKeys("Sderot");
        driver.findElement(By.cssSelector("#finish")).click();
        Thread.sleep(2000);
        Thread.sleep(30000);
        driver.quit();
    }
}





