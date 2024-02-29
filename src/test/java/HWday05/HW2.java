package HWday05;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HW2 {


//    Task 2:
//            * breakout task: (in a separate class)
//            * navigate to this url https://www.saucedemo.com/v1/inventory.html
//            * add the first item you find to your cart
//     * open your cart*
//            * assert that the item name is correct inside the cart
//     */

    static WebDriver driver;

    @Test
    public void Test1() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        //* navigate to this url https://www.saucedemo.com/v1/inventory.html
        driver.get("https://www.saucedemo.com/v1/inventory.html");


        //* add the first item you find to your cart
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory'][1]")).click();

        //     * open your cart*
        driver.findElement(By.xpath("//*[@fill='currentColor']")).click();

        // assert that the item name is correct inside the cart

        WebElement item = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/a/div"));
        Assert.assertNotNull("correct name", item);

        System.out.println("the correct name is : " + item.getText());

//                driver.quit();
    }


}
