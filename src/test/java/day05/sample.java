package day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sample {
    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        Assert.assertNotNull("Browser is opened",driver);

        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        Assert.assertEquals("Page is visible successfully","https://webdriveruniversity.com/To-Do-List/index.html",
                driver.getCurrentUrl());
    }
}
