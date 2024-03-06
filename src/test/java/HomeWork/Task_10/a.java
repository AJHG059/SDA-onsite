package HomeWork.Task_10;

import utilities.TestBase;

import java.io.File;

public class a extends TestBase {
    public static void main(String[] args) {


        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File file = new File(desktopPath, "abdulaziz");
        System.out.println(file);
    }
}