package automator.day5;

import autoframework.driver.driver.SeleniumDrivers;
import autoframework.driver.tools.MyAssert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/11/13.
 */
public class MyAssertTest {
    @Test
    public void testAssert(){
        WebDriver driver;
        driver= SeleniumDrivers.openBrower("chrome");
        driver.get("https://www.baidu.com");
        MyAssert.assertStartWith("百度一下你就知道","百度一下");
        driver.quit();
    }
}
