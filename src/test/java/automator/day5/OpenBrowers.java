package automator.day5;

import autoframework.driver.driver.SeleniumDrivers;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/11/8.封装浏览器
 */
public class OpenBrowers {
    @Test
    public void testOpenBrowser() throws InterruptedException {
        SeleniumDrivers.openBrower("chrome");
        Thread.sleep(3000);
        SeleniumDrivers.closed();

        SeleniumDrivers.openBrower("firefox");
        Thread.sleep(3000);
        SeleniumDrivers.closed();

        SeleniumDrivers.openBrower("ie");
        Thread.sleep(3000);
        SeleniumDrivers.closed();

    }
}
