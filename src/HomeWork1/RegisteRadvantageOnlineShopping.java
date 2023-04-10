package HomeWork1;

import Selenium.SelenuimBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisteRadvantageOnlineShopping {


    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        String url = "https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI";
        ChromeDriver driver = base.seleniumInit("https://www.google.com/webhp?hl=iw&sa=X&ved=0ahUKEwiJ7s7DvsX9AhU0bvEDHaHuA58QPAgI");
        WebElement link = driver.findElement(By.partialLinkText("Mortgage"));
        link.click();
        WebElement input = driver.findElement(By.partialLinkText("Down"));
        String text = input.getText();
        System.out.println("Text found the value is "+text);



        driver.get("http://advantageonlineshopping.com/#/register");
        Thread.sleep(2000);
        driver.findElement(By.name("usernameRegisterPage")).sendKeys("eeelya123"); //UserName
        Thread.sleep(2000);
        driver.findElement(By.name("passwordRegisterPage")).sendKeys("Elya056156"); //Password
        Thread.sleep(2000);
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Elya056156"); //Password check
        Thread.sleep(1000);
        driver.findElement(By.name("emailRegisterPage")).sendKeys("elya@gmail.com"); //email
        Thread.sleep(1000);
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Elya"); //FristName
        Thread.sleep(1000);
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Daniel"); //LastName
        Thread.sleep(1000);
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("0543054470"); // Phone
        Thread.sleep(1000);

        WebElement Country = driver.findElement(By.name("countryListboxRegisterPage"));//Country
        Select Countryy = new Select(Country);
        Countryy.selectByIndex(8);
        Thread.sleep(1000);
        driver.findElement(By.name("cityRegisterPage")).sendKeys("Sderot"); // City
        Thread.sleep(1000);
        driver.findElement(By.name("addressRegisterPage")).sendKeys("Htzhnim"); // Address
        Thread.sleep(1000);
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("8100"); // Address
        Thread.sleep(1000);
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("8100"); // Postal Code
        Thread.sleep(1000);
        WebElement radioBtn = driver.findElement(By.name("i_agree"));   //Radio
        radioBtn.click();
        Thread.sleep(2000);
        driver.findElement(By.id("register_btnundefined")).click();
        Thread.sleep(2000);

        base.seleniumClose(driver);


    }
}