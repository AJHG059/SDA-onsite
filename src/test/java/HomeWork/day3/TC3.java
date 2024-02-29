package HomeWork.day3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC3 {

//    Task 3:
//    Go to https://id.heroku.com/login.
//    Enter an e-mail address.
//    Enter a password.
//    Click on the Login button.
//    There was a problem with your login.
//    If text is visible, print "Registration Failed".
//    If the text is not visible, print "Registered".
//    Close all pages.


    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://id.heroku.com/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }

    @AfterClass
    public static void Exit() {

        driver.quit();
    }

    @Test
    public void testLogin() {
        // Navigate to Heroku login page
        driver.get("https://id.heroku.com/login");

        // Enter email address
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys("abdulaziz.jameel.alghamdi@gmail.com");

        // Enter password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("Ajhg0505");

        // Click on the Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='commit']"));
        loginButton.click();

        // Check if "There was a problem with your login" text is visible
        WebElement errorMessage = driver.findElement(By.xpath("//div[@role='alert']"));
        String errorMessageText = errorMessage.getText();


        // Check if the error message is visible
        if (errorMessage.isDisplayed()) {
            // If text is visible, print "Registration Failed"
            System.out.println("Registration Failed");
        } else {
            // If the text is not visible, print "Registered"
            System.out.println("Registered");
        }
    }
}
