package NoHaveIdAndName;

import Selenium.SelenuimBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Login {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/inventory.html");
        List<WebElement> elements = driver.findElements(By.className("input_error form_input"));
        WebElement user = elements.get(0);
        WebElement pw = elements.get(1);

        user.sendKeys("Elya");

       pw.click();
        pw.sendKeys("Daniel");
        Thread.sleep(2000);



        base.seleniumClose(driver);

    }
}
