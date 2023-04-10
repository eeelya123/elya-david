package Selenium.pageObejectExample.test;


import Selenium.SelenuimBase;
import Selenium.pageObejectExample.Pages.LoginPage;
import Selenium.pageObejectExample.Pages.ProdPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base=new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");

        ProdPage prodPage = new ProdPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToPage("standard_user","secret_sauce");
        prodPage.getPrice();
        prodPage.clickMenu();
        Thread.sleep(5000);
        base.seleniumClose(driver);
    }

}