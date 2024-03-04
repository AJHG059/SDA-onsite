package HomeWork.HomeWork_day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class HW2 extends TestBase {

//    Go to URL: https://the-internet.herokuapp.com/windows
//    Verify the text: “Opening a new window”
//    Verify the title of the page is “The Internet”
//    Click on the “Click Here” button
//    Verify the new window title is “New Window”
//    Go back to the previous window and then verify the title: “The Internet”

    @Test
    public void test() {
        // Navigate to the URL
        driver.get("https://the-internet.herokuapp.com/windows");

        //    Verify the text: “Opening a new window”
        WebElement textElement = driver.findElement(By.tagName("h3"));
        Assert.assertEquals("Opening a new window", textElement.getText());

        // Verify the title of the page is "The Internet"
        Assert.assertEquals("The Internet", driver.getTitle());

        // Click on the "Click Here" button
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();

        // Wait for the new window/tab to open
        new WebDriverWait(driver, Duration.ofSeconds(12)).until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new window
        String originalWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!originalWindowHandle.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Verify the new window title is "New Window"
        assertEquals("New Window", driver.getTitle());

        // Close the new window and switch back to the original window
        driver.close();
        driver.switchTo().window(originalWindowHandle);

        // Verify the title of the original window is still "The Internet"
        assertEquals("The Internet", driver.getTitle());
    }


}
