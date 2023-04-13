package ProjectRainer.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRainer {


    private WebDriver driver;

// Cookies pop-up window
    @FindBy(css = "#cookie-popup-with-overlay > div > div.cookie-popup-with-overlay__buttons > button.cookie-popup-with-overlay__button")
    WebElement closekoki;

    @FindBy(xpath = "/html/body/hp-app-root/hp-home-container/hp-home/hp-header/header/ry-header/div/div[2]/hp-header-content-container/hp-header-content/hp-header-sections-group[2]/hp-header-menu-item[4]/button/span")
    WebElement connect;
    @FindBy(name = "email")
    WebElement loginName2;
    @FindBy(css = "#ry-modal-portal > div > ry-auth-popup-container > div > ry-auth-popup > div > ry-login > form > ry-auth-password > ry-input-d > div > input")
    WebElement passwordElement;

    //@FindBy(className = "button[class='auth-submit__button ry-button--full ry-button--flat-yellow']")
    //WebElement submitUserElement;

    @FindBy(css = "#ry-modal-portal > div > ry-auth-popup-container > div > button > icon > span > svg")
    WebElement CloseLogInButtonElement;

    @FindBy(id = "input-button__departure")
    WebElement clickOnFromeElement;

    @FindBy(css = "#ry-tooltip-1 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-origin-container > fsw-airports > div > fsw-airports-list > div.list__airports-container.ng-star-inserted > div.list__airports-scrollable-container.small-height > fsw-airport-item > span > span")
    WebElement clickOnTelAvivElement;
    @FindBy(id = "input-button__destination")
    WebElement flyToElement;
@FindBy(css ="#ry-tooltip-3 > div.tooltip-inner > hp-app-controls-tooltips > fsw-controls-tooltips-container > fsw-controls-tooltips > fsw-destination-container > fsw-airports > div > fsw-airports-list > div.list__airports-container.ng-star-inserted > div.list__airports-scrollable-container.large-height > fsw-airport-item:nth-child(2) > span > span")
   WebElement choseBerlinElement;

@FindBy(className ="datepicker__arrow-wrap")
WebElement NoElement;
    public HomePageRainer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void closekoki() throws InterruptedException {

        Thread.sleep(5000);
        closekoki.click();
    }

    public void loginLink() throws InterruptedException {
        Thread.sleep(2000);
        connect.click();
    }

    public void clickOnUserName() throws InterruptedException {
        Thread.sleep(2000);
        loginName2.click();
    }

    public void logName(String userName) throws InterruptedException {
        Thread.sleep(2000);
        loginName2.sendKeys(userName);
    }

    public void setPassword(String passwordText) throws InterruptedException {
        Thread.sleep(2000);
        passwordElement.clear();
        passwordElement.click();
        passwordElement.sendKeys(passwordText);

    }
    /*
    public void submitOnloginButton() throws InterruptedException {
        Thread.sleep(2000);
        submitUserElement.click();

    }

     */
    public void setCloseLogInButtonElement() throws InterruptedException {
        Thread.sleep(2000);
        CloseLogInButtonElement.click();
    }
    public void setclickOnFromeElement (String frome) throws InterruptedException {
        Thread.sleep(2000);
        clickOnFromeElement.click();
        clickOnFromeElement.clear();
        clickOnFromeElement.sendKeys(frome);
    }
    public void setclickOnTelAvivElement() throws InterruptedException {
        Thread.sleep(2000);
        clickOnTelAvivElement.click();
    }

    public void setflyToElement (String to) throws InterruptedException {
        Thread.sleep(2000);
        flyToElement.click();
       flyToElement.clear();
       flyToElement.sendKeys(to);
    }


    public void setchoseBerlinElement() throws InterruptedException {
        Thread.sleep(3000);
        choseBerlinElement.click();
        choseBerlinElement.click();
    }

    public void setNoElement() throws InterruptedException {
        Thread.sleep(3000);
        NoElement.click();
    }














}