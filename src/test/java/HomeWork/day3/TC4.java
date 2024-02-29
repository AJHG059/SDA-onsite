package HomeWork.day3;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC4 {

//    Task 4:
//    Navigate to https://testpages.herokuapp.com/styled/index.html
//    Click on Simple Calculator under Micro Apps.
//    Type any number in the first input.
//    Type any number in the second input.
//    Click on Calculate.
//    Get the result.
//    Print the result

    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
    }

    @AfterClass
    public static void Exit() {

        driver.quit();
    }

    @Test
    public void test01() {
        // Navigate to the test page
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on Simple Calculator under Micro Apps
        WebElement simpleCalculatorLink = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        simpleCalculatorLink.click();

        // Type any number in the first input
        WebElement firstInput = driver.findElement(By.xpath("//input[@id='number1']"));
        firstInput.sendKeys("7");

        // Type any number in the second input
        WebElement secondInput = driver.findElement(By.xpath("//input[@id='number2']"));
        secondInput.sendKeys("22");

        // Click on Calculate
        WebElement Button = driver.findElement(By.xpath("//input[@id='calculate']"));
        Button.click();

        // Get the result
        WebElement result = driver.findElement(By.xpath("//span[@id='answer']"));

        // Print the result
        String total = result.getText();
        System.out.println("Result: " + total);

        // Assert the result (you may need to parse and convert the result to a numeric value)
        Assert.assertEquals("29", total);
    }

}
