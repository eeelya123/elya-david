package HomeWork1;

import Selenium.SelenuimBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Speakers {
    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        ChromeDriver driver = base.seleniumInit("http://advantageonlineshopping.com/#/category/Speakers/4");
        Thread.sleep(3000);
        driver.findElement(By.id("accordionAttrib2")).click(); // open weight
        Thread.sleep(4000);
        driver.findElement(By.id("weight_4")).click(); //choose weight 4
        Thread.sleep(4000);
        driver.findElement(By.id("accordionColor")).click(); //open Color
        Thread.sleep(4000);
        driver.findElement(By.id("productsColors414141")).click(); //choose Color
        Thread.sleep(4000);
        base.seleniumClose(driver);




    }

}

