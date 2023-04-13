package projects.ProjectRyanair.test;


import Selenium.SelenuimBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projects.ProjectRyanair.Pages.HomePageRainer;

public class TestRyanair {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base = new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://www.ryanair.com/gb/en");
        HomePageRainer prodPageRiner = new HomePageRainer(driver);
        prodPageRiner.closekoki();
        prodPageRiner.loginLink();
        prodPageRiner.clickOnUserName();
        prodPageRiner.logName("elya@test.com");
        prodPageRiner.setPassword("elya1234566");
       // prodPageRiner.submitOnloginButton();
        prodPageRiner.setCloseLogInButtonElement();
        prodPageRiner.setclickOnFromeElement("Tel Aviv");
        prodPageRiner.setclickOnTelAvivElement();
        prodPageRiner.setflyToElement("Berlin Brandenburg");
        Thread.sleep(3000);
        prodPageRiner.setchoseBerlinElement();
        Thread.sleep(4000);
        Thread.sleep(4000);

        base.seleniumClose(driver);
    }


    }


