package HomeWork;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HwTemu {


//    1.Go to https://www.temu.com/.
//            2.Type "iphone" in the search bar and click ENTER.
//3.Print the result number.
//            4.Click on the first product that appears.
//5.Add to cart.
//6.Click on the cart icon.
//7.Print the product price
//8.Complete your shopping..
//            9.Turn off the driver.


    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }

    @Test
    public void test() {
        //  1: Go to temu.com
        driver.get("https://www.temu.com/");

        //  2: Type "iphone" in the search bar and click ENTER
        WebElement Input = driver.findElement(By.xpath("//input[@id='searchInput']"));
        Input.sendKeys("iphone");
        Input.submit();

        //  3: Print the result number
        WebElement resultNumber = driver.findElement(By.xpath("//div[@class='_1TKvD9PP']"));
        System.out.println("Result number: " + resultNumber.getText());

        //  4: Click on the first product that appears
        WebElement firstProduct = driver.findElement(By.xpath("//h2[@class='_2XmIMTf3']"));
        firstProduct.click();

        //  5: Add to cart
        WebElement addToCartButton = driver.findElement(By.xpath(".add-to-cart-button"));
        addToCartButton.click();

        //  6: Click on the cart icon
        WebElement cartIcon = driver.findElement(By.cssSelector(".cart-icon"));
        cartIcon.click();

        //  7: Print the product price
        WebElement productPrice = driver.findElement(By.cssSelector(".product-price"));
        System.out.println("Product price: " + productPrice.getText());


    }

    @AfterClass
    public static void exit() {

        driver.quit();
    }
}
