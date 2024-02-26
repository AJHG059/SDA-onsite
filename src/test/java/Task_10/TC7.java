package Task_10;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7 {

        // TC - 07

// Go to YouTube homepage
// Do the following tasks by creating 4 different test methods.
//*- Print "Test is running" before each test() method
//*- Print "Test finished" after each test() method
// Test if the currentURL contains "youtube"
// Test if the title does not contain "Video".
// Test if the URL contains "youtube".
// Test if the sourcePage contains "youtube".



    static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://youtube.com"); }


    @AfterClass
    public static void tearDown () {

        driver.close();
    }

    @Before
    public void beforeClass () {

        System.out.println("Test is running");
    }

    @After
    public void afterClass () {

        System.out.println("Test finished\n");
    }


    @Test
    public void test01URL () {

        //Test if the currentURL contains "youtube"
        boolean isContainURL = driver.getCurrentUrl().contains("youtube");
        Assert.assertTrue(isContainURL);
    }

    @Test
    public void test02Title () {

        //Test if the title does not contain "Video".
        boolean isTitle = driver.getTitle().contains("Video");
        Assert.assertFalse(isTitle);
    }

    @Test
    public void test03URL () {

        //Test if the URL contains "youtube".
        boolean isUrlContainsYoutube = driver.getCurrentUrl().contains("youtube");
        Assert.assertTrue(isUrlContainsYoutube);
    }

    @Test
    public void test04SourcePage() {

        // Test if the sourcePage contains "youtube".
        Boolean isSourcePageContainsYoutube = driver.getPageSource().contains("youtube");
        Assert.assertTrue(isSourcePageContainsYoutube);
    }
}
