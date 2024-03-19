package chaling;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class day08CH {


    static WebDriver driver;

    @BeforeClass
    public static void swtup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div[3]/div/div/div/iframe"));
        driver.switchTo().frame(frame);

    }

    @AfterClass
    public static void Exit() {

        driver.quit();
    }

    @Test
    public void fNameandLname() throws InterruptedException {
        //frame xpath and swith to frame


        //first name filed
        WebElement fistname = driver.findElement(By.xpath("//input[@complink='Name_First']"));
        fistname.click();
        fistname.sendKeys("Abdulaziz");
        Assert.assertTrue(fistname.isDisplayed());

        //last name fild
        WebElement lastname = driver.findElement(By.xpath("//input[@complink='Name_Last']"));
        lastname.click();
        lastname.sendKeys("Alghamdi");
        Assert.assertTrue(lastname.isDisplayed());
    }

    @Test
    public void rideoButton() throws InterruptedException {

        //first Rideo button ----- locate and click and Aseert
        WebElement fistrideo = driver.findElement(By.xpath("//*[@for='Radio_1']"));
        fistrideo.click();
        Assert.assertTrue(fistrideo.isDisplayed());
        Thread.sleep(2000);

        //second Rideo button ----- locate and click and Aseert
        WebElement secondrido = driver.findElement(By.xpath("//*[@for='Radio_2']"));
        secondrido.click();
        Assert.assertTrue(secondrido.isDisplayed());
        Thread.sleep(2000);

        //third Rideo button ----- locate and click and Aseert
        WebElement thridRido = driver.findElement(By.xpath("//*[@for='Radio_3']"));
        thridRido.click();
        Assert.assertTrue(thridRido.isDisplayed());
    }

    @Test
    public void Dropdown() {

        WebElement dropdowen = driver.findElement(By.id("Dropdown-arialabel"));


        Select select = new Select(dropdowen);
        select.selectByValue("First Choice");
        select.selectByValue("Second Choice");
        select.selectByValue("Third Choice");

    }

    @Test
    public void SingleLine() {

        WebElement singlLine = driver.findElement(By.xpath("//input[@id='SingleLine-arialabel']"));
        singlLine.click();
        Assert.assertFalse("i can input massage", singlLine.isEnabled());
    }

    @Test
    public void Checkbox() {

        List<WebElement> CheckBoxe1 = driver.findElements(By.xpath("//*[@for='Checkbox_1']"));

        if (!CheckBoxe1.get(0).isSelected()) {

            CheckBoxe1.get(0).click();
            System.out.println("Chex Box 1 is selected");
        } else {

            System.out.println("Chex Box 1 is already selected ");
        }
//------------------------------------------------------------------------------------------------------
        List<WebElement> CheckBoxes2 = driver.findElements(By.xpath("//*[@for='Checkbox_2']"));

        if (!CheckBoxes2.get(0).isSelected()) {

            CheckBoxes2.get(0).click();
            System.out.println("Chex Box 2 is selected");
        } else {

            System.out.println("Chex Box 2 is already selected ");
        }
//------------------------------------------------------------------------------------------------------
        List<WebElement> CheckBoxes3 = driver.findElements(By.xpath("//*[@for='Checkbox_3']"));
        if (!CheckBoxes3.get(0).isSelected()) {

            CheckBoxes3.get(0).click();
            System.out.println("Chex Box 3 is selected");
        } else {

            System.out.println("Chex Box 3 is already selected ");
        }
    }

    @Test
    public void Rating() {

        WebElement rating = driver.findElement(By.xpath("//*[@aria-label='3 Star']"));
        rating.click();

    }

    @Test
    public void sudmit() {

        WebElement submitButton = driver.findElement(By.xpath("//button[@elname='submit']"));
        submitButton.click();
        Assert.assertTrue(submitButton.isSelected());
    }
}
