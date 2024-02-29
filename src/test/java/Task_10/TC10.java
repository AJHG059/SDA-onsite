package Task_10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10 {


    // TC - 10

// Go to Automation Exercises homepage
    // Find the locators of the relevant areas and click on them
    // https://automationexercise.com/
    // Task 01 --> " Home "
    // Task 02 --> " Products "
    // Task 03 --> " Cart "
    // Task 04 --> " Signup / Login "
    // Task 05 --> " Test Cases "
    // Task 06 --> " API Testing "
    // Task 07 --> " Video Tutorials "
    // Task 08 --> " Contact us "

    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }


    @Test
    public void findHome() {

        WebElement homeButton = driver.findElement(By.tagName("a"));
        homeButton.click();

        WebElement homeButton2 = driver.findElement(By.linkText("Home"));
        homeButton2.click();

        WebElement homeButton3 = driver.findElement
                (By.xpath("//*[@class='fa fa-home']"));

        homeButton3.click();
        driver.close();
    }

    @Test
    public void findProducts() {
        WebElement productButton = driver.findElement
                (By.xpath("//i[@class='material-icons card_travel']"));

        productButton.click();
        driver.close();
    }

    @Test
    public void findCart() {
        WebElement cartButton = driver.findElement(By.linkText("Cart"));
        cartButton.click();

        WebElement cartButton2 = driver.findElement
                (By.xpath("(//i[@class='fa fa-shopping-cart'])[1]"));
        cartButton2.click();
        driver.close();
    }


    @Test
    public void findSignLogin() {
        WebElement signLoginButton = driver.findElement
                (By.linkText("Signup / Login"));

        signLoginButton.click();

        WebElement signButton = driver.findElement
                (By.xpath("//i[@class='fa fa-lock']"));

        signButton.click();
        driver.close();
    }

    @Test
    public void findTestCases() {
        WebElement testCasesButton = driver.findElement(By.linkText("Test Cases"));
        testCasesButton.click();

        WebElement testCaseButton2 = driver.findElement
                (By.xpath("(//i[@class='fa fa-list'])[1]"));
        testCaseButton2.click();
        driver.close();
    }

    @Test
    public void findApiTesting() {
        WebElement apiTestingButton = driver.findElement(By.linkText("API Testing"));
        apiTestingButton.click();

        WebElement apiTestingButton2 = driver.findElement
                (By.xpath("(//i[@class=\"fa fa-list\"])[2]"));
        apiTestingButton2.click();
        driver.close();
    }


    @Test
    public void findVideoTutorials() {
        WebElement videoTutorialsButton = driver.findElement
                (By.linkText("Video Tutorials"));
        videoTutorialsButton.click();

        WebElement videoTutorialsButton2 = driver.findElement
                (By.xpath("//i[@class=\"fa fa-youtube-play\"]"));
        videoTutorialsButton2.click();
        driver.close();
    }

    @Test
    public void findContactUs() {
        WebElement contactUsButton = driver.findElement(By.linkText("Contact us"));
        contactUsButton.click();

        WebElement contactUsButton2 = driver.findElement
                (By.xpath("//i[@class=\"fa fa-envelope\"]"));
        contactUsButton2.click();
        driver.close();
    }


}



