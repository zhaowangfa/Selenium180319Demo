package automator.day5;

import autoframework.driver.action.ScreenShot;
import autoframework.driver.driver.SeleniumDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by lenovo on 2016/11/12.
 */
public class ScreenShotTest {
    WebDriver driver;
    @Test
    public void screenShotTest() {
        driver= SeleniumDrivers.openBrower("chrome");
        driver.get("http://www.baidu.com");
        ScreenShot.screenShots();
        driver.quit();
    }
}
