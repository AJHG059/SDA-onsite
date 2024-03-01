package HomeWork.HomeWorkDay07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW1 {


    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterClass
    public static void Exit() {

//        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {

        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();

//----------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert1.accept();

//----------------------------------------------------------------------------------------------
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert2.sendKeys("abdulaziz jameel alghamdi");
        Thread.sleep(3000);
        alert2.accept();


        //        driver.findElement(By.id("//p[@id=result]"));
//        Assert.assertTrue(alert2.getText().contains("You entered: abdulaziz jameel alghamdi"));
    }
}
