package HomeWork.Task_10;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8 {
    //    // TC - 08

    // Go to google homepage
    // Do the following tasks by creating 3 different test methods.
    //*- Print "Tests are starting to run" before each test() method
    //*- Print "Tests have finished running" after each test() method
    // Test if the title is the same when the page window is maximize and minimize
    // Test if the title does not contain "Video" when the page window is fullscreen
    // Test if the URL contains "google"


    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @AfterClass
    public static void tearDown() {

        driver.close();
    }

    @Before
    public void beforeClass() {

        System.out.println("Tests are starting to run");
    }

    @After
    public void afterClass() {

        System.out.println("Tests have finished running\n");
    }


    @Test
    public void test01() {

        // Test if the title is the same when the page window is maximize and minimize
        driver.manage().window().maximize();

        String titleMax = driver.getTitle();
        driver.manage().window().minimize();
        String titleMin = driver.getTitle();
        Assert.assertEquals(titleMax, titleMin);
    }

    @Test
    public void test02() {

        // Test if the title does not contain "Video" when the page window is fullscreen
        driver.manage().window().fullscreen();
        boolean isTitleContain = driver.getTitle().contains("Video");
        Assert.assertFalse(isTitleContain);
    }

    @Test
    public void test03() {

        /// Test if the URL contains "google".
        boolean isUrlContain = driver.getCurrentUrl().contains("google");
        Assert.assertTrue(isUrlContain);
    }
}
