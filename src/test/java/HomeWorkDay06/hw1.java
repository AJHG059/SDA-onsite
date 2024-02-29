package HomeWorkDay06;

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

public class hw1 {

//    Hw:1
//   1- Go to URL: https://the-internet.herokuapp.com/dropdown
//   2- Select Option 1 using index .
//   3- Select Option 2 by value.
//   4- Select Option 1 value by visible text.
//   5- Print all dropdown value.
//   6- Verify the dropdown has Option 2 text.
//   7- Print first selected option.
//   8- Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

    static WebDriver driver;

    @BeforeClass
    public static void sutp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @AfterClass
    public static void Exit() {
        //driver.quit();
    }

    @Test
    public void Test1() {

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement);

        // 2- Select Option 1 using index
        dropdown.selectByIndex(1);
        Assert.assertEquals("Option 1", dropdown.getFirstSelectedOption().getText());

        // 3- Select Option 2 by value
        dropdown.selectByValue("2");
        Assert.assertEquals("Option 2", dropdown.getFirstSelectedOption().getText());

        // 4- Select Option 1 value by visible text
        dropdown.selectByVisibleText("Option 1");
        Assert.assertEquals("Option 1", dropdown.getFirstSelectedOption().getText());

        // 5- Print all dropdown values
        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // 6- Verify the dropdown has Option 2 text /#/
        boolean hasOption2 = options.stream().anyMatch(option -> option.getText().equals("Option 2"));
        Assert.assertTrue(hasOption2);

        // 7- Print first selected option
        System.out.println("First selected option: " + dropdown.getFirstSelectedOption().getText());

        // 8- Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown
        System.out.println(dropdown.getOptions().size());
    }


}




