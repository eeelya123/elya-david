package ProjectWolt.test;


import ProjectWolt.Pages.HomePageWolt;
import Selenium.SelenuimBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base=new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://wolt.com/");
        HomePageWolt prodPageRiner = new HomePageWolt(driver);
        prodPageRiner.closekoki();
        prodPageRiner.setSignupElement();
        prodPageRiner.setemailElement("test@nir&elya");
        prodPageRiner.setcloseUserElement();
        prodPageRiner.setclickOnPlaceInTLVrElement();
        Thread.sleep(5000);
          prodPageRiner.getText();
        Thread.sleep(4000);
dfhjlnljk
        base.seleniumClose(driver);
    }
}