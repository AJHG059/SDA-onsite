package Task_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {


    // TC - 01

// Invoke Chrome Browser
// Navigate to URL: https://www.w3schools.com/
// Navigate to URL: https://stackoverflow.com/
// Come back to the w3schools using the back command.
// Again go back to the stackoverflow website using forward command
// Refresh the Browser using refresh command.
// Close the Browser.


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https:www.w3schools.com/");

        driver.navigate().to("https://stackoverflow.com/");

        driver.navigate().back();

        driver.navigate().forward();

        driver.quit();


    }



}
