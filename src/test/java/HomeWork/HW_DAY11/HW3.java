package HomeWork.HW_DAY11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.JScriptUtilities;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HW3 extends TestBase {

//    Day:11/HW:3 ------> Will be done on weekend
//    Go to URL: https://opensource-demo.orangehrmlive.com/
//    Login page valid credentials.
//    Click PIM on the left side bar
//    Click Configuration and select Data Import
//    Download sample CSV file.
//    Verify if the file downloaded successfully.


    @Test
    public void test() throws InterruptedException {


//    Go to URL: https://opensource-demo.orangehrmlive.com/

        driver.get("https://opensource-demo.orangehrmlive.com/");

//    Login page valid credentials.

        //username : admin
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.click();
        username.sendKeys("admin");
        Thread.sleep(2000);

        //password : admin123
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("admin123");
        Thread.sleep(2000);

        //sudmit
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //    Click PIM on the left side bar
        WebElement pimButton = driver.findElement(By.xpath("//span[text()='PIM']"));
        pimButton.click();

//    Click Configuration and select Data Import
        WebElement configuration = driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item'][1]"));
        configuration.click();
        Thread.sleep(2000);

        //click in the date import
        WebElement importdata = driver.findElement(By.xpath("//a[text()='Data Import']"));
        JScriptUtilities.clickElementByJS(driver, importdata);

//    Download sample CSV file.
        WebElement download = driver.findElement(By.xpath("//*[@class='download-link']"));
        download.click();

//    Verify if the file downloaded successfully.
        Thread.sleep(2000);
        String s = "/Users/importData/Downloads";
        String separater = System.getProperty("file.separator");

        String pathOfFile = System.getProperty("user.home")
                + separater + "Downloads"
                + separater + "importData.csv";

        boolean isDownload = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isDownload);
        System.out.println("the file donwloadd = " + isDownload);

    }


}
