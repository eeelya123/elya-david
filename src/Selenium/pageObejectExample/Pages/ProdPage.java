package Selenium.pageObejectExample.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdPage {


    private WebDriver driver;

    @FindBy(className = "inventory_item_price")
    WebElement price;

   @FindBy(id = "react-burger-menu-btn")
   WebElement menuButton;

   @FindBy(id = "react-burger-cross-btn")
   WebElement closeMenuBtn;

    public ProdPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void getPrice() {
        String prodPrice = price.getText();
        System.out.println("Price found it equals to " + prodPrice);

    }
    public void clickMenu() throws InterruptedException {
        menuButton.click();
        Thread.sleep(5000);
        closeMenuBtn.click();
    }
    }