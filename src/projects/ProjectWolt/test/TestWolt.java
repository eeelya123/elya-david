package projects.ProjectWolt.test;


import Selenium.SelenuimBase;
import org.openqa.selenium.chrome.ChromeDriver;
import projects.ProjectWolt.Pages.HomePageWolt;

public class TestWolt {

    public static void main(String[] args) throws InterruptedException {
        SelenuimBase base=new SelenuimBase();
        ChromeDriver driver = base.seleniumInit("https://wolt.com/"); //The WOLT site was opened
        HomePageWolt prodPageRiner = new HomePageWolt(driver);
        prodPageRiner.closekoki();                    //Approval of cookies agreement
        prodPageRiner.setSignupElement();             //Log in to the user
        prodPageRiner.setemailElement("test@nir&elya");//Enter a user's email
        prodPageRiner.setcloseUserElement();           // פה אני מבצע סגירה בלי התחברות אמיתית כדי שהמערכת וולט לא תחסום אותי
        prodPageRiner.setclickOnPlaceInTLVrElement();  // Clicking on " או לצפות במקומות הכי אהובים באיזור תל אביב"
        Thread.sleep(5000);
        prodPageRiner.getText();                        // Prints the number of stores there are
        prodPageRiner.setcclickOnShopsInTelAvivElement(); // Click on a store in Tel Aviv
        Thread.sleep(5000);

        base.seleniumClose(driver);                       // Closing the browser
    }

}
