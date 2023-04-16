package ProjectWolt.test;


import ProjectWolt.pages.HomePageWolt;
import Selenium.SelenuimBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWolt {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base=new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://wolt.com/"); //The WOLT site was opened
        HomePageWolt prodPageRiner = new HomePageWolt(driver);
        prodPageRiner.closekoki();                    //Approval of cookies agreement
        prodPageRiner.setSignupElement();             //Log in to the user
        prodPageRiner.setemailElement("test@nir&elya");//Enter a user's email
        prodPageRiner.setcloseUserElement();           // // Here I close without a real connection so that the Volt system does not block me
        prodPageRiner.setclickOnPlaceInTLVrElement();  // Clicking on " או לצפות במקומות הכי אהובים באיזור תל אביב"
        Thread.sleep(5000);
        prodPageRiner.getText();                        // Prints the number of stores there are
        prodPageRiner.setcclickOnShopsInTelAvivElement(); // Click on a store in Tel Aviv
        Thread.sleep(5000);

        base.seleniumClose(driver);
    }

}
