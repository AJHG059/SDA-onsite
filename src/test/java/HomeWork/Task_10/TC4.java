package HomeWork.Task_10;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC4 {

    // TC - 04

// Go to the w3school URL : https://www.w3schools.com/
// Print the position and size of the page.
// Adjust the position and size of the page as desired.
// Test that the page is in the position and size you want. // Close the page.

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.w3schools.com/");

        System.out.println("position = " + driver.manage().window().getPosition());

        System.out.println("Size = " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(80, 30));

        driver.manage().window().setSize(new Dimension(800, 400));

        int x = driver.manage().window().getPosition().getX();
        int y = driver.manage().window().getPosition().getY();


        int width = driver.manage().window().getSize().width;
        int hight = driver.manage().window().getSize().height;

        if (x == 80 && y == 30 && width == 800 && hight == 400) {

            System.out.println("passed");
        } else {
            System.out.println("Faild");
        }
        driver.quit();

    }

}
