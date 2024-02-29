package Task_10;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {

    // TC - 05

// Invoke Chrome Browser
// Open URL: https: https://www.w3schools.com/
// Maximize the window.
// Print the position and size of the page.
// Minimize the page.
// Wait 7 seconds in the icon state and maximize the page.
// Print the position and dimensions of the page in maximized state.
// Make the page fullscreen.
// Close the Browser.


    public static void main(String[] args) throws InterruptedException {

        // Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open URL: https: https://www.w3schools.com/
        driver.get("https://www.amazon.com");

        // Maximize the window.
        driver.manage().window().maximize();

        // Print the position and size of the page.
        System.out.println("Position=" + driver.manage().window().getPosition());
        System.out.println("Size= " + driver.manage().window().getSize());

        // Minimize the page.
        driver.manage().window().minimize();

        // Wait 7 seconds in the icon state and maximize the page.
        Thread.sleep(7000);

        // Print the position and dimensions of the page in maximized state.
        System.out.println("Size= " + driver.manage().window().getSize());
        System.out.println("Position= " + driver.manage().window().getPosition());


        // Make the page fullscreen.
        driver.manage().window().fullscreen();


        // Close the Browser.
        driver.quit();


    }

}
