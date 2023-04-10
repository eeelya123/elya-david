package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// מביא את כל מה שסלניום




public class GURU99 {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://demo.guru99.com/test/newtours/"; // מגדיר
        System.out.println("Starting..."); // תחילת הטסט
        ChromeOptions options = new ChromeOptions();//מגדיר אובייקט מסוג כרום

        options.addArguments(new String[]{"--start-maximized"}); //גודל פתיחת חלון
        WebDriverManager.chromedriver().setup(); //פה אני אומר שבהמשך אני מגדיר את "הדרייבר" ף
        ChromeDriver driver = new ChromeDriver(options);// עד כאן אתחול של הטסט
//
//
        driver.get(url); // פה הטסט מתחיל לרוץ משורת הקוד (15)
        WebElement userName = driver.findElement(By.name("userName")); //מתחיל לעבוד עם האלמנטים
        userName.click(); // ביצוע פעולה
        userName.sendKeys("Tutorial");
        WebElement pw = driver.findElement(By.name("password"));
        pw.click();
        pw.sendKeys("Tutorial");
        WebElement Login = driver.findElement(By.name("submit"));
        WebElement submit;
        Login.click();
        Thread.sleep(5000L);
        driver.close();
    }
}


