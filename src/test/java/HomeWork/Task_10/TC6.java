package HomeWork.Task_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC6 {
//    TC - 06

// Invoke FireFox Driver
// Go to https://www.youtube.com/
// Maximize the window
// Verify the page title contains the word video.
// Minimize the window
// Verify the page title contains the word video.
// Make the page fullscreen
// Close the driver.

    public static void main(String[] args) {

        // Invoke FireFox Driver
        WebDriver driver = new FirefoxDriver();

        // Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        // Maximize the window
        driver.manage().window().maximize();


        String titleOfThePage = driver.getTitle();
        System.out.println("titleOfThePage = " + titleOfThePage);

        // Verify the page title contains the word video
        if (titleOfThePage.contains("video"))
            System.out.println("It contains the word 'video'");
        else System.out.println("It does not contain that one");


        // Minimize the window
        driver.manage().window().minimize();


        // Verify the page title contains the word video.
        titleOfThePage = driver.getTitle();
        System.out.println("titleOfThePage = " + titleOfThePage);

        if (titleOfThePage.contains("video")) {
            System.out.println("It contains the word 'video'");
        } else {
            System.out.println("It does not contain that one");
        }


        // Make the page fullscreen
        driver.manage().window().fullscreen();

        driver.quit();
    }


}

