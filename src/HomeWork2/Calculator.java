package HomeWork2;

import Selenium.SelenuimBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        ChromeDriver driver = base.seleniumInit(" https://www.calculator.net/");
        Thread.sleep(4000);
        WebElement searchMenu = driver.findElement(By.id("calcSearchTerm"));
        WebElement searchBtn = driver.findElement(By.id("bluebtn"));
        List<String> products;
        products = new ArrayList<>();
        products.add("Time");
        products.add("BMI");
        products.add("Age");
        for (String product : products) {
            searchMenu.click();
            searchMenu.clear();
            searchMenu.sendKeys(product);
            searchBtn.click();
            WebElement res = driver.findElement(By.partialLinkText(product));
            String resultText = res.getText();
            System.out.println(resultText + " found as a result of search ");

            Thread.sleep(4000);

        }
    }
}



//