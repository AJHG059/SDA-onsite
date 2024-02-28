package HomeWork.day3;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC5 {

//    Go to URL: https://www.linkedin.com/
//    Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.


       static WebDriver driver;
    @BeforeClass
        public static void sutp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

}

    @Test
    public void testSignIn() {
        // Navigate to LinkedIn
        driver.get("https://www.linkedin.com/");

        // Locate elements using absolute XPath
        WebElement emailOrPhoneabsolute = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input"));
        WebElement passwordabsolute = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[2]/div/div/input"));
        WebElement signInButtonabsolute = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/button"));

        // Locate elements using relative XPath
        WebElement emailOrPhonerelative = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        WebElement passwordrelative = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        WebElement signInButtonrelative = driver.findElement(By.xpath("//button[@type='submit']"));


        // using relative XPath
        emailOrPhonerelative.sendKeys("abdulaziz.jameel.alghamdi@gmail.com");
        passwordrelative.sendKeys("123456789");
        signInButtonrelative.click();


        // Or using absolute XPath
        emailOrPhoneabsolute.sendKeys("abdulaziz.jameel.alghamdi@gmail.com");
        passwordabsolute.sendKeys("123456789");
        signInButtonabsolute.click();
    }

}
