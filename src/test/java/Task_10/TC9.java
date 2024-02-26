package Task_10;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9 {


                        // TC - 09

    // Go to w3school homepage
        // Do the following tasks by creating 3 different test methods.
            //*- Print "STARTED" before all test() methods run
                //*- Print "FINISHED" after all test() methods run.
                    //*- Before all test() methods run, print "Test has started"
                        //*- Print "method name + running" in all test methods
                            //*- After all test() methods run, print "Test finished"
                                // Test if the title contains "w3school" when the page window is minimize
                                    // Test if the title does not contain "boss" when the page window is fullscreen



    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {

        driver.close();
    }

    @Before
    public void beforeClass () {

        System.out.println("STARTED");
        System.out.println("Test has started");
    }

    @After
    public void afterClass () {

        System.out.println("FINISHED");
        System.out.println("Test finished");
    }


    @Test
    public void test01() {

        driver.manage().window().minimize();

        boolean isTitleContain = driver.getTitle().contains("W3Schools");
        Assert.assertTrue(isTitleContain);
        System.out.println("Test01 is running");
    }

    @Test
    public void test02() {

        driver.manage().window().fullscreen();

        boolean isTitleContain = driver.getTitle().contains("boss");
        Assert.assertFalse(isTitleContain);
        System.out.println("Test02 is running");
    }

}
