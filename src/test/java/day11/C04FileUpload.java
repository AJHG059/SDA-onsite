package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04FileUpload extends TestBase {

    //    Go to URL: https://the-internet.herokuapp.com/upload
//    Find the path of the file that you want to upload.
//    Click on Upload button.
//    Verify the upload message.
    @Test
    public void test() {

        By choseFile = By.id("file-upload");
        By uploadButton = By.id("file-submit");

        //this code cal the user file path
        String userDir = System.getProperty("user.dir");
        String sep = System.getProperty("file.separator");
        String fileName = "FileExist";
        String path = userDir + sep + fileName;

        //    Go to URL: https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");

        //    Find the path of the file that you want to upload.
        //we defin the web element in the line 15

        WebElement selectFile = driver.findElement(choseFile);
        //selectFile.click();
        selectFile.sendKeys(path);

        //    Click on Upload button.
        driver.findElement(uploadButton).click();

        //    Verify the upload message.
        WebElement verify = driver.findElement(By.tagName("h3"));
        Assert.assertTrue("the file is upload ", verify.isDisplayed());

    }

}
