package projects.ProjectWolt.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageWolt {

    private WebDriver Driver;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/button[2]/div[3]")
    WebElement closekokiElement;  //Closing the cookie pop-up window


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[2]/div[3]/div/div/button")
    WebElement SignupElement; //connect to wolt

    @FindBy(css = "input#method-select-email.sc-8b48855d-0")
    WebElement emailElement; //Enter email

    @FindBy(xpath = "/html/body/div[7]/div/aside/div[1]/button")
    WebElement closeUserElement; // Log in - close button

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[1]/div/div[2]/div[3]/a")
    WebElement clickOnPlaceInTLVrElement; //Click on a link that appears on the home page
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div/div[7]/div/div[2]/div/div/div[1]/a/div/div/div[2]/div/p")
    List<WebElement> printText; //Prints the number of stores in Tel Aviv

    @FindBy(css = "#mainContent > div.sc-84c3953a-0.goPFCh > div > div > div:nth-child(7) > div > div.sc-fdefad94-0.egehHl > div > div > div:nth-child(1) > a > div > div > div.sc-ce2624b5-0.dehyAS")
    WebElement clickOnShopsInTelAvivElement; //Entrance to shops in Tel Aviv

    public HomePageWolt(WebDriver driver) {
        this.Driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void closekoki() throws InterruptedException {
        Thread.sleep(5000);
        closekokiElement.click();
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

    public void setcclickOnShopsInTelAvivElement() throws InterruptedException {
        Thread.sleep(2000);
        clickOnShopsInTelAvivElement.click();

    }


}