package automator.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lenovo on 2016/10/11.
 */
public class Assertdemo {
    @Test
    public void assertNull(){
        String a=null;
        Assert.assertNull(a);
    }
    @Test
    public void assertNotNull(){
        String a="  ";
        Assert.assertNotNull(a);
    }
    @Test
    public void assertEqual(){
        String a="abc",b="abc";
        Assert.assertEquals(a, b, "a is equal with b?");
    }
    @Test
    public void assertNotEqual(){
        String a="abc",b="abcd";
        Assert.assertNotEquals(a,b,"a is equal with b?");
    }
}
