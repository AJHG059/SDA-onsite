package HomeWork.HW_DAY11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class HW1 extends TestBase {

//    Task1: Go to URL : https://facebook.com
//    getCookies,
//    addCookies,
//    deleteCookieNamed,
//    deleteAllCookies


    @Test
    public void test() {

        //Task1: Go to URL : https://facebook.com
        driver.get("https://facebook.com");
//    getCookies,
        System.out.println("-----------------getCookies------------");
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie w : cookies) {
            System.out.println("this is all cookies --->  " + w);
        }
        System.out.println("------------------------------------------------");

//----------------------------------------------------------------------------------------
//    addCookies,
        System.out.println("------------addCookies--------");

        Cookie addCookies = new Cookie("AJHG", "ABDULAZIZ");
        driver.manage().addCookie(addCookies);
        driver.manage().getCookies().forEach(t -> System.out.println("this add cookies ----> = " + t));

        System.out.println("------------------------------------------------");

//-----------------------------------------------------------------------------------------------------
//    deleteCookieNamed,
        System.out.println("----------deleteCookieNamed-------------");
        driver.manage().deleteCookie(addCookies);
        driver.manage().deleteCookieNamed("AJHG");
        driver.manage().getCookies().forEach(System.out::println);

        System.out.println("------------------------------------------------");

//---------------------------------------------------------------------------------------
//    deleteAllCookies
        System.out.println("------------deleteAllCookies-----------");
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("'empty all the cookies ben delete ' ");

    }


}
