package ProjectWolt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageWolt {

    private WebDriver Driver;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/button[2]/div[3]")
    WebElement closeKokiElement;

    @FindBy(css = "button[type='button']")
    WebElement SignupElement;

    @FindBy(css = "input#method-select-email.sc-8b48855d-0")
    WebElement emailElement;

    @FindBy(xpath = "/html/body/div[7]/div/aside/div[1]/button")
    WebElement closeUserElement;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div[1]/div/div[2]/div[3]/a")
    WebElement clickOnPlaceInTLVrElement;
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div/div[5]/div/div[2]/div/div/div[1]/a/div/div/div[2]/div/p")
    List<WebElement> getStoresElement;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[3]/div/div/div[5]/div/div[2]/div/div/div[1]/a/div/div/div[2]/div/p")
    WebElement clickOnShopsInTelAvivElement;

    public HomePageWolt(WebDriver driver) {
        this.Driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Closing the cookie pop-up window
    public void closekoki() throws InterruptedException {
        Thread.sleep(5000);
        closeKokiElement.click();
    }

    //connect to wolt
    public void setSignupElement() throws InterruptedException {
        Thread.sleep(2000);
        SignupElement.click();

    }

    //Enter email
    public void setemailElement(String passwordText) throws InterruptedException {
        Thread.sleep(2000);
        emailElement.clear();
        emailElement.click();
        emailElement.sendKeys(passwordText);
    }

    // Log in - close button
    public void setcloseUserElement() throws InterruptedException {
        Thread.sleep(2000);
        closeUserElement.click();

    }

    //Click on a link that appears on the home page
    public void setclickOnPlaceInTLVrElement() throws InterruptedException {
        Thread.sleep(2000);
        clickOnPlaceInTLVrElement.click();

    }
    //Prints the number of stores in Tel Aviv
    public void getText() {

        for (WebElement printT : getStoresElement) {
            String print1 = printT.getText();
            System.out.println("בתל אביב"+print1);
        }
    }

    //Entrance to shops in Tel Aviv
    public void setcclickOnShopsInTelAvivElement() throws InterruptedException {
        Thread.sleep(2000);
        clickOnShopsInTelAvivElement.click();

    }


}