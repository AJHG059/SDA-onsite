package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class task extends TestBase {

//    Create tests that depend on each other
//    Create beforeClass and set up settings.
//    By creating interdependent tests;
//    First go to Facebook.
//    Then go to Google depending on Facebook,
//    Then go to Amazon depending on Google
//
//
//    Close the driver.

   static WebDriver driver;
    @BeforeClass
    public static void sutp(){

        driver = new ChromeDriver();
    }
    @Test()
    public void test01(){

         driver.get("https://www.Facebook.com");
        System.out.println("test01");
//    By creating interdependent tests;
//    First go to Facebook.
//    Then go to Google depending on Facebook,
//    Then go to Amazon depending on Google
    }
    @Test(description = "test01")
    public void test02(){
        driver.get("https://www.google.com");
        System.out.println("test02" + " = Google depending on Facebook");
    }
    @Test(description = "test02")
    public void test03(){

        driver.get("https://www.Amazon.com");
        System.out.println("test03" +" = Amazon depending on Google");
    }

    @AfterClass
    public static void Exit(){
        driver.quit();
    }
}
