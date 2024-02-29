package HomeWorkDay06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW2 {

//    Task:2
//    Launch the browser.
//            Open "https://demoqa.com/select-menu".
//    Select the Old Style Select Menu using the element id.
//    Print all the options of the dropdown.
//            Select 'Purple' using the index.
//    After that, select 'Magenta' using visible text.
//    Select an option using value.
//    Close the browser.

    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        driver.get("https://demoqa.com/select-menu");
    }


    @AfterClass
    public static void exit() {

        //driver.quit();
    }


    @Test
    public void test() {

        //Select the Old Style Select Menu using the element id.


        //Print all the options of the dropdown.
        // Select 'Purple' using the index.
        // After that, select 'Magenta' using visible text.
        // Select an option using value.


    }


}
