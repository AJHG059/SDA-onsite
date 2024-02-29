package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Selnium01 {

    //Create main method
    public static void main(String[] args) {

        //Create chrome driver
        WebDriver driver = new ChromeDriver();


        //Open google home page: https://www.google.com
        driver.get("https://www.google.com");


        //Print Title on page
        String Title = driver.getTitle();
        System.out.println("the title is = " + Title);

        //Print Current URL on page
        String Url = driver.getCurrentUrl();
        System.out.println("the Url is = " + Url);


        //Close/Quit the browser

        driver.quit();
    }
}
