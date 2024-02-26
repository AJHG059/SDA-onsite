package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02Example {

//    http://the-internet.herokuapp.com/add_remove_elements/
//    Click on the "Add Element" button 100 times.
//    Write a function that takes a number, and clicks the "Delete" button.
//    Given number of times, and then validates that given number of buttons was deleted.
//
//1. Method: createButtons(100)
//2. Method: DeleteButtonsAndValidate()

        WebDriver driver;

    @Test
    public void CreateDeletetest(){

         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(20);
    }

    //1. Method: createButtons(100)
    public void  createButtons(int numberOfbuttons){

       WebElement button = driver.findElement(By.xpath("//button[text()='Add Element']"));
    for (int i = 0 ; i<numberOfbuttons; i++){

        button.click();
        }
    }

    }



