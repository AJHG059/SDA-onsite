package Task_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

    // TC – 03

    // Expected Title
    // Set Path of the Chrome driver
    // Launch Chrome browser
    // Open URL of Website
    // Maximize Window
    // Get Title of current Page
    // Validate/Compare Page Title
    // Close Browser

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        Thread.sleep(3000);

        // Expected Title
        String expectedTitle = "CHECK24";

        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        String titlePage = driver.getTitle();

        Thread.sleep(5000);

        if (titlePage.contains(expectedTitle)) {

            System.out.println("passd test");
        } else {
            System.out.println("faild test");
        }

        String PageSource = driver.getPageSource();

        driver.close();
        driver.quit();
        System.out.println("Page Source");
    }

}
