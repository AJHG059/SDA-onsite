package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Selnium {

    /*
Invoke Chrome Driver
Navigate to Facebook homepage URL: https://www.facebook.com/
Verify expected URL equals to the actual URL.
Verify  pagesource of FaceBook contains "Facebook" .
     */
    public static void main(String[] args) {

//        Invoke Chrome Driver
        WebDriver driver = new ChromeDriver();


//        Navigate to Facebook homepage URL: https://www.facebook.com/
//        Verify expected URL equals to the actual URL.
        driver.get(" https://www.facebook.com/");
        String expectedUrl = " https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        // Verify  pagesource of FaceBook contains "Facebook" .
        String pageSource = driver.getPageSource();

        if (pageSource.contains("Facebook")) {
            System.out.println("Facebook is present in the page source.");
        } else {
            System.out.println("Facebook is not present in the page source.");
        }

        driver.quit();
    }
}
