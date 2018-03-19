package automator.day1;

import org.testng.annotations.*;

/**
 * Created by lenovo on 2016/10/10.
 */
public class TestNGdemo {

    @BeforeTest
    public void beforetest(){ System.out.println("This is a befortest");}
    @BeforeMethod
    public void beforemethod1(){
        System.out.println("This is a beformethod1");
    }
    @AfterMethod
    public void afteremethod1(){
        System.out.println("This is a aftermethod1");
    }
    @Test
    public void testTest1(){
        System.out.println("This is a testng comment1");
    }
    @Test
    public void testTest2(){
        System.out.println("This is a testng comment2");
    }
    @AfterTest
    public void aftertest(){ System.out.println("This is a aftertest");}
}
