package HomeWork.HW_DAY11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HW2 extends TestBase {

    //Day:11/HW:2
    //Create a File on Desktop
    //Verify that the file exists

    // there are 2 way to solve this task
    //1)
    @Test
    public void test() {

        ////////////1)
        //Create a File on Desktop
        //Verify that the file exists
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File file = new File(desktopPath, "abdulaziz");
        System.out.println(file);
        Assert.assertTrue(file.exists());

//-----------------------------------------------------------------------------------------
        ///(2)
        //Create a File on Desktop
        String Desktop = System.getProperty("user.dir");
        String sepertor = System.getProperty("file.separator");
        System.out.println("userDir = " + Desktop);
        System.out.println("separator = " + sepertor);
//------------------------------------------------------------------------
        //Verify that the file exists

        String pathOfFile = System.getProperty("user.home")
                + sepertor + "Desktop"
                + sepertor + "abdulaziz";
        System.out.println("pathOfFile = " + pathOfFile);

        boolean isExist = Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);
//------------------------------------------------------------------------------------

    }


}
