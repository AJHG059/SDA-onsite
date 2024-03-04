package HWday09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class HW1 extends TestBase {

//    Go to URL: http://demo.guru99.com/test/drag_drop.html
//    Drag and drop the BANK button to the Account section in DEBIT SIDE
//    Drag and drop the SALES button to the Account section in CREDIT SIDE
//    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
//    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
//    Verify the visibility of Perfect text.

    @Test
    public void test() {

        By DEBIT = By.id("bank");
        By bink = By.xpath("//li[@class='block14 ui-draggable']");
        By sels = By.xpath("//li[@class='block15 ui-draggable']");
        By ceridedtaccount = By.xpath("//ol[@id='loan']");
        By fifh = By.xpath("//li[@id='fourth'][1]");
        By ammount = By.xpath("//ol[@id='amt8']");
        By fifhsecond = By.xpath("//li[@id='fourth'][2]");
        By AccountCREDITSIDE = By.xpath("//ol[@id='loan']");


        //    Go to URL: http://demo.guru99.com/test/drag_drop.html
        driver.get("http://demo.guru99.com/test/drag_drop.html");


        WebElement binkButton = driver.findElement(bink);
        WebElement debitButton = driver.findElement(DEBIT);
        WebElement salesbutton = driver.findElement(sels);
        WebElement cREDITacouuntbutton = driver.findElement(ceridedtaccount);
        WebElement fifhbutton = driver.findElement(fifh);
        WebElement ammountbutoon = driver.findElement(ammount);
        WebElement fifhsecondbutton = driver.findElement(fifhsecond);
        WebElement AccountCREDITSIDEbutton = driver.findElement(AccountCREDITSIDE);

        ////    Drag and drop the BANK button to the Account section in DEBIT SIDE
        actions
                .dragAndDrop(binkButton, debitButton).perform();


        //    Drag and drop the SALES button to the Account section in CREDIT SIDE
        actions
                .dragAndDrop(salesbutton, cREDITacouuntbutton).perform();


        //    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
        actions
                .dragAndDrop(fifhbutton, ammountbutoon).perform();

        //    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
        actions
                .dragAndDrop(fifhsecondbutton, ammountbutoon).perform();


        //    Verify the visibility of Perfect text
        WebElement Perfect = driver.findElement(By.xpath("//a[.='Perfect!']"));
        Assert.assertTrue(Perfect.isDisplayed());
    }


}
