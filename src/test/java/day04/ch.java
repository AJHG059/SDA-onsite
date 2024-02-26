package day04;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class ch {

   static WebDriver driver;

   String exptudUrl= "http://automationexercise.com";
   @BeforeClass
   public static void befoor(){

       driver = new ChromeDriver();
       driver.get("https://www.google.com");
       Assert.assertNotNull(driver);
   }

    @AfterClass
    public static void exit(){

       driver.quit();

    }


    @Test
   public void test(){



    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("http://automationexercise.com");
   String url = driver.getCurrentUrl();
   Assert.assertEquals(exptudUrl,url);

    driver.manage().window().maximize();

//        Assert.assertTrue(true);

       WebElement button = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
       button.click();

       
        //input[@data-qa='login-email']

        By username = RelativeLocator.with(By.xpath("//input[@data-qa='login-email']"));
       driver.findElement(username).sendKeys("sda@test.com");


//input[@data-qa='login-password']
        By password = RelativeLocator.with(By.xpath("//input[@data-qa='login-password']"));
        driver.findElement(password).sendKeys("sdainclasstask");

//        Assert.assertFalse(username == password);

        WebElement login = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        login.click();



    }

}
