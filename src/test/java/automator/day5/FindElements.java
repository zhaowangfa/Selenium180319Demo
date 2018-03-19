package automator.day5;

import autoframework.driver.driver.SeleniumDrivers;
import autoframework.driver.elements.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by lenovo on 2016/11/8.
 */
public class FindElements {
    WebDriver driver;
    @Test
    public void testFindElement(){
        driver=SeleniumDrivers.openBrower("firefox");
        driver.get("https://www.baidu.com");
        WebElementUtils.findElement(By.id("kw555")).sendKeys("selenium");
        SeleniumDrivers.closed();
    }
    @Test
    public void testFindElements() {
        driver=SeleniumDrivers.openBrower("chrome");
        driver.get("https://www.baidu.com");
        List<WebElement> list=WebElementUtils.findElements(By.xpath("//*[@id=\"uuiui1\"]/a433221"));
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i).getText());
        }
        //SeleniumDrivers.closed();
    }
}
