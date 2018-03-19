package autoframework.driver.elements;

import autoframework.driver.driver.SeleniumDrivers;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by lenovo on 2016/11/8.
 */
public class WebElementUtils extends SeleniumDrivers{
    public static WebElement findElement(final By by){
        WebElement webElement=null;
        try {
            webElement=new WebDriverWait(driver,10).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"没找着");
            e.printStackTrace();
        }
        return webElement;
    }
    public static List<WebElement> findElements(final By by){
        List<WebElement> webElements=null;
        try {
            webElements=new WebDriverWait(driver,5).until(new ExpectedCondition<List<WebElement>>(){
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"定位超时");
            e.printStackTrace();
        }
        return webElements;
    }
}
