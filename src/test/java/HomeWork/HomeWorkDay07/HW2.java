package HomeWork.HomeWorkDay07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW2 {

    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

//        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }

    @AfterClass
    public static void Exit() {

//        driver.quit();
    }

    @Test
    public void ttest() {

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

}
