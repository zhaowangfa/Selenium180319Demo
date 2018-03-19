package automator.day5;

import autoframework.driver.logger.LoggerControler;
import org.testng.annotations.Test;

import static autoframework.driver.logger.LoggerControler.getLogger;

/**
 * Created by lenovo on 2016/11/9.
 */
public class LoggerTest {
   final static LoggerControler log= getLogger(LoggerTest.class);
    @Test
    public void testLog(){
        log.info("this is info log");
        log.warning("this is warn log");
        log.severe("this is error log");
    }
}
