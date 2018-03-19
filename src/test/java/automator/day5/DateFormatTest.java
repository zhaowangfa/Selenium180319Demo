package automator.day5;

import autoframework.driver.tools.DateFormat;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/11/10.
 */
public class DateFormatTest {
    @Test
    public void DateTime(){
        DateFormat.format("ZH_DATE_FORMAT");
    }
    @Test
    public void CuoTime(){
        DateFormat.time();
    }
}
