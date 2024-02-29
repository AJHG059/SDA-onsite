package chaling; // Defines the package name as 'chaling'.

import com.github.javafaker.Faker; // Imports the Faker library for generating fake data.
import org.junit.AfterClass; // Imports JUnit's AfterClass annotation for teardown methods.
import org.junit.Assert; // Imports JUnit's Assert class for assertions.
import org.junit.BeforeClass; // Imports JUnit's BeforeClass annotation for setup methods.
import org.junit.Test; // Imports JUnit's Test annotation to mark methods as test cases.
import org.openqa.selenium.By; // Imports Selenium's By class for locating elements.
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface for controlling the browser.
import org.openqa.selenium.WebElement; // Imports the WebElement interface for interacting with elements.
import org.openqa.selenium.chrome.ChromeDriver; // Imports the ChromeDriver class, a WebDriver implementation.

import java.time.Duration; // Imports the Duration class for specifying time durations.
import java.util.Locale; // Imports the Locale class, although it's not used in this script.

public class ch1 { // Declares a public class named 'ch1'.
    static WebDriver driver; // Declares a static WebDriver variable to share it across methods.

    @BeforeClass // Marks the setup method to run once before all test methods in the class.
    public static void setUp() {
        driver = new ChromeDriver(); // Instantiates the ChromeDriver, opening a Chrome browser.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Sets a default wait time for element searches.
        driver.manage().window().maximize(); // Maximizes the browser window.
        driver.get("https://thinking-tester-contact-list.herokuapp.com/"); // Opens the specified URL in the browser.
    }

    @AfterClass // Marks the teardown method to run once after all test methods in the class.
    public static void tearDown() {
        //driver.quit(); // Would close the browser window and end the WebDriver session.
    }

    @Test // Marks the following method as a test case.
    public void challenge() {
        // Interacting with the email field.
        WebElement email = driver.findElement(By.id("email")); // Finds the email input element by its ID.
        email.click(); // Clicks on the email input field to focus on it.
        email.sendKeys("ziad@gmail.com"); // Types the specified email address into the input field.

        // Interacting with the password field.
        WebElement pass = driver.findElement(By.id("password")); // Finds the password input element by its ID.
        pass.click(); // Clicks on the password input field to focus on it.
        pass.sendKeys("1234567"); // Types the specified password into the input field.
        driver.findElement(By.id("submit")).click(); // Finds the submit button by its ID and clicks it.

        // Adding a contact.
        WebElement addContact = driver.findElement(By.id("add-contact")); // Finds the 'Add Contact' button.
        Assert.assertTrue(addContact.isDisplayed()); // Asserts that the 'Add Contact' button is visible.
        addContact.click(); // Clicks the 'Add Contact' button.

        // Filling in the contact form with Faker-generated and hard-coded data.
        Faker faker = new Faker(); // Instantiates a Faker object to generate fake data.
        WebElement fname = driver.findElement(By.id("firstName")); // Finds the first name input field.
        String firstname = faker.name().firstName(); // Generates a fake first name.
        fname.sendKeys(firstname); // Enters the fake first name into the field.

        WebElement lname = driver.findElement(By.id("lastName")); // Finds the last name input field.
        String lastName = faker.name().lastName(); // Generates a fake last name.
        lname.sendKeys(lastName); // Enters the fake last name into the field.

        WebElement birth = driver.findElement(By.id("birthdate")); // Finds the birthdate input field.
        birth.sendKeys("2000-07-11"); // Enters a hard-coded birthdate into the field.

        // Repeating the process for other fields like email, phone, address, etc., with either Faker-generated or hard-coded values.

        // Submitting the form.
        driver.findElement(By.id("submit")).click(); // Finds and clicks the submit button to submit the form.

        // Verification.
        WebElement emailVerf = driver.findElement(By.xpath("(//*[contains(text(),'Contact Details')])")); // Finds a page element that confirms successful submission.
        Assert.assertTrue(emailVerf.isDisplayed()); // Asserts that the confirmation element is visible.
    }
}
