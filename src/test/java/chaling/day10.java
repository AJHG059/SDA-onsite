package chaling;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.JScriptUtilities;
import utilities.TestBase;

public class day10 extends TestBase {


    @Test
    public void test() {

        driver.get("https://www.youtube.com");
        WebElement button = driver.findElement(By.xpath("//input[@id='search']"));
        JScriptUtilities.clickElementByJS(driver, button);
        button.sendKeys("Hans Zimmer - Mountains (Interstellar Soundtrack)");
        WebElement button1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        button1.click();
        WebElement vi = driver.findElement(By.xpath("//*[contains(text() , 'Hans Zimmer - Mountains (Interstellar Soundtrack)')]"));
//    vi.click();
        JScriptUtilities.clickElementByJS(driver, vi);
        Assert.assertTrue(vi.isEnabled());
    }


}
