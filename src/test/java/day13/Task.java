package day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Task extends TestBase {

    Logger logger;

    @Test
    public void test() {

        PropertyConfigurator.configure("log4jProperties");
        logger = Logger.getLogger(Task.class);

//    Go to URL: https://healthunify.com/bmicalculator/
        driver.get("https://healthunify.com/bmicalculator/");


        //    Entring weight
        WebElement weight = driver.findElement(By.xpath("//input[@name='wg']"));
        weight.click();
        logger.info("Entring weight");
        weight.sendKeys("23");


        //    Selecting kilograms
        WebElement sel = driver.findElement(By.xpath("//select[@name='opt1']"));
        logger.info("select");
        Select select = new Select(sel);
        select.selectByValue("kilograms");


        //    Selecting height in feet
        WebElement sel2 = driver.findElement(By.xpath("//select[@name='opt2']"));
        sel2.click();
        logger.info("Selecting height in feet");
        Select select1 = new Select(sel2);
        select1.getOptions();
        select1.selectByIndex(2);


        //    Selecting height in inchs
        WebElement sel3 = driver.findElement(By.xpath("//select[@name='opt3']"));
        sel3.click();
        logger.info("Selecting height in inchs");
        Select select2 = new Select(sel3);
        select2.getOptions();
        select2.selectByIndex(3);

        //    Clicking on calculate
        WebElement calculat = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculat.click();
        logger.info("Clicking on calculate");

        //    Getting SIUnit value
        WebElement unit = driver.findElement(By.xpath("//input[@name='si']"));
        System.out.println("unit.getText() = " + unit.getAttribute("unit"));
        logger.info("Getting SIUnit value");

        //    Getting USUnit value
        WebElement us = driver.findElement(By.xpath("//input[@name='us']"));
        System.out.println("us.getText() = " + us);
        logger.info("Getting USUnit value");

        //    Getting UKUnit value
        WebElement uk = driver.findElement(By.xpath("//input[@name='uk']"));
        System.out.println("uk.getText() = " + uk.getAttribute("us"));
        logger.info("Getting UKUnit value");

        //    Getting overall description
        WebElement description = driver.findElement(By.name("description")); // This might need to be updated based on actual element
        System.out.println("description.getText() = " + description.getText());
        logger.info("Getting overall description");

    }


}
