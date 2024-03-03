package utilities;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// we cant use object in(abstract class) we can inhertins in test base
public abstract class TestBase {

    // we use protected class for use it only in child class
    protected static WebDriver driver;


    @BeforeClass
    public static void set() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void Exit() {
        //driver.quit();
    }

}
