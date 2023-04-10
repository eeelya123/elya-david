package Selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Registration {

    public static WebDriver driver;


    @BeforeTest
    public static void main(String[] args) throws IllegalAccessException, InterruptedException {
        String url = "https://shop.demoqa.com/my-account/";
        System.out.println("Starting...");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);

    }
    @Test
    public void testNewUserRegistration() {
        // Navigate to registration page
        driver.get("https://shop.demoqa.com/my-account/");

        // Fill out registration form
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("newuser");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("newuser@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("password");

        WebElement confirmPasswordField = driver.findElement(By.id("password"));
        confirmPasswordField.sendKeys("password");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
/*
        // Assert that registration was successful
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        String expectedMessage = "Registration successful";
        String actualMessage = successMessage.getText();
        assert(actualMessage.equals(expectedMessage));
    */
    }

    @AfterTest
    public void tearDown() {
        // Quit WebDriver
        driver.quit();
    }
}