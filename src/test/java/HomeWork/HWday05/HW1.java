package HomeWork.HWday05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class HW1 {

//    Task 1:
//    Go to URL: https://demoqa.com/radio-button
//    Verify whether all 3 options given to the question can be selected.
//    When each option is selected, print the following texts on the console.

    static WebDriver driver;

    @Test
    public void HWTest() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

//        Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

//        Verify whether all 3 options given to the question can be selected

        List<WebElement> buttons = driver.findElements(By.xpath("//*[@type='radio']"));
        buttons.get(0).click();
        Assert.assertTrue(buttons.get(0).isSelected());
        buttons.get(1).click();
        Assert.assertTrue(buttons.get(1).isSelected());
        buttons.get(2).click();
        Assert.assertTrue(buttons.get(2).isSelected());


//        WebElement buttons = driver.findElement(By.xpath("//label[@for='noRadio']"));

//               WebElement button = driver.findElement(By.xpath("//label[@for='noRadio']"));
//        JavascriptException js = (JavascriptException)driver;

//        List<WebElement> buttons = driver.findElements(By.xpath("//*[@type='radio']"));
//
//        for (WebElement verify: buttons) {
//            verify.click();
//            Assert.assertTrue(verify.isSelected());
//            Thread.sleep(5000);
//
//        }


    }

}
