package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03ActionsClass02 extends TestBase {

    String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

    @Test
    public void test() {

        driver.get(url);
        dragCapitolInConteryBox("Madrid", "spain");
    }

    public void dragCapitolInConteryBox(String capital, String contry) {

        By capital1 = By.xpath("//div[text()='" + capital + "'][2]");
        By contry1 = By.xpath("//div[text()='" + contry + "']");

        WebElement capitalBox = driver.findElement(capital1);
        WebElement contryBox = driver.findElement(contry1);

        actions.dragAndDrop(capitalBox, contryBox).perform();
    }
}
