package Project.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToRainer {
    @FindBy(id = "user-name")
    WebElement user;

    @FindBy(id = "password")
    WebElement pw;

    @FindBy(name = "login-button")
    WebElement submit;
    private WebDriver driver;

    public LoginToRainer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginToPage(String userToType, String pwToType) {
        user.click();
        user.clear();
        user.sendKeys(userToType);

        pw.click();
        pw.clear();
        pw.sendKeys(pwToType);

        submit.click();


    }

    public String printUserPw(String user, String pw) {
        System.out.println("The user is " + user + "Pw is " + pw);
        if (user.length() == 4) {
            System.out.println("User length is 4");

        }
        return user;
    }


}