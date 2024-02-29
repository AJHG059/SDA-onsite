package day02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BeforeClassAfterClassAnnotation {

    static WebDriver driver;

    @BeforeClass
    public static void beforeclass() {
        driver = new ChromeDriver();
        System.out.println("Before class method is executed...");
    }

    @AfterClass
    public static void afterclass() {
        driver.quit();
        System.out.println("After Classs method is executed...");
    }

    @Test
    public void test01() {

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

    }

    @Test
    public void test02() {

        driver.get("https://www.clarusway.com");
        driver.manage().window().maximize();

    }
}
