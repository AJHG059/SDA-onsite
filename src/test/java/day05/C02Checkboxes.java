package day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class C02Checkboxes {

    //Go to https://the-internet.herokuapp.com/checkboxes
//    Locate the elements of checkboxes.
//    Then click on checkbox 1 if box is not selected.
//    Then click on checkbox 2 if box is not selected.
//    Then verify that checkbox 1 is checked


    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-,maximized");

        driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @AfterClass
    public static void Exit() {

        driver.quit();
    }

    @Test
    public void CheckBoxTest() {

        List<WebElement> CheckBoxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

        //        Assert.assertTrue(CheckBoxes.get(1).isSelected());

        //Then click on checkbox 1 if box is not selected
        if (!CheckBoxes.get(0).isSelected()) {

            CheckBoxes.get(0).click();
            System.out.println("Chex Box 1 is selected");
        } else {

            System.out.println("Chex Box 1 is already selected ");
        }

        //    Then click on checkbox 1 if box is not selected
        if (!CheckBoxes.get(1).isSelected()) {

            CheckBoxes.get(1).click();
            System.out.println("Chex Box 2 is selected");
        } else {

            System.out.println("Chex Box 2 is already selected ");
        }

        //    Then verify that checkbox 1 and 2 is checked
        Assert.assertTrue(CheckBoxes.get(0).isSelected());
        Assert.assertTrue(CheckBoxes.get(1).isSelected());
    }
}
