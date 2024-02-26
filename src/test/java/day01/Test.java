package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");
        driver.get("https://www.clarusway.com");
        driver.get("https://www.Amazon.com");

        driver.quit();
    }
}
