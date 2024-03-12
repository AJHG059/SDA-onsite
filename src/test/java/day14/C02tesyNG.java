package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02tesyNG {

    @Test(description = "this is test01")
    public void b(){
        System.out.println("Test01 has executed");
    }

    @Test(timeOut = 500 , description = "this is test02")
    public void a() throws InterruptedException {
        Thread.sleep(600);
        System.out.println("Test02 has executed");
    }
}