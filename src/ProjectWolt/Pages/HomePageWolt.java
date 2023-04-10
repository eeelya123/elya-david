package ProjectWolt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageWolt {


    private WebDriver Driver;
    @FindBy(xpath = "/html/body/div[5]/div/div/div/button[2]/div[3]")
    WebElement closekoki;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[2]/div[3]/div/div/button")
    WebElement SignupElement;

    @FindBy(css = "input#method-select-email.sc-8b48855d-0")
    WebElement emailElement;

    @FindBy(xpath = "/html/body/div[7]/div/aside/div[1]/button")
    WebElement closeUserElement;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[1]/div/div[2]/div[3]/a")
    WebElement clickOnPlaceInTLVrElement;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div/div[7]/div/div[2]/div/div/div[1]/a/div/div/div[2]/div/p")
    List<WebElement> printText;


    public HomePageWolt(WebDriver driver) {
        this.Driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void closekoki() throws InterruptedException {
        Thread.sleep(5000);
        closekoki.click();
    }

    public void setSignupElement() throws InterruptedException {
        Thread.sleep(2000);
        SignupElement.click();

    }

    public void setemailElement(String passwordText) throws InterruptedException {
        Thread.sleep(2000);
        emailElement.clear();
        emailElement.click();
        emailElement.sendKeys(passwordText);
    }

    public void setcloseUserElement() throws InterruptedException {
        Thread.sleep(2000);
        closeUserElement.click();

    }

    public void setclickOnPlaceInTLVrElement() throws InterruptedException {
        Thread.sleep(2000);
        clickOnPlaceInTLVrElement.click();

    }

    public void getText() {

        for (WebElement printT : printText) {
            String print1 = printT.getText();
            System.out.println(print1);
        }
    }
}