package HomeWork.Task_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

    // TC - 02

    // Go to www.yahoo.com
    // Maximize Window
    // Go to www.amazon.com
    // Maximize Window
    // Navigate Back
    // Navigate Forward
    // Refresh The Page

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Go to www.yahoo.com
        driver.get("https://de.yahoo.com/?p=us");

        Thread.sleep(3000);

        // Maximize Window
        driver.manage().window().maximize();

        Thread.sleep(3000);

        String title1 = driver.getTitle();

        if (title1.contains("yahoo")) {
            System.out.println("Pass");

        } else {
            System.out.println("Fail");
        }

        // Go to www.amazon.com
        driver.get("https://www.Amazon.com");

        Thread.sleep(2000);

        String title2 = driver.getTitle();

        if (title2.contains("Amazon")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        // Navigate Back
        driver.navigate().back();
        Thread.sleep(3000);

        // Navigate Forward
        driver.navigate().forward();
        Thread.sleep(3000);

        // Refresh The Page
        driver.navigate().refresh();

    }
}
