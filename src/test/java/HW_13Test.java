import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HW_13Test {
    @Test
    public void testLeftPad(){
        Assert.assertEquals("", StringUtils.leftPad("", 0, "0"));
        Assert.assertEquals("test test", StringUtils.leftPad("test test", 0, "0"));
        Assert.assertEquals("www", StringUtils.leftPad("", 3, "w"));
        Assert.assertEquals("001", StringUtils.leftPad("1", 3, "0"));
        Assert.assertEquals("012", StringUtils.leftPad("12", 3, "0"));
        Assert.assertEquals("123", StringUtils.leftPad("123", 3, "0"));
        Assert.assertEquals("test", StringUtils.leftPad("test", 3, "0"));
        Assert.assertEquals("ttt1", StringUtils.leftPad("1", 4, "t"));
    }

    @Test
    public void testStripStart(){
        Assert.assertEquals("", StringUtils.stripStart("", StringUtils.SPACE + ","));
        Assert.assertEquals("", StringUtils.stripStart(", , ", StringUtils.SPACE + ","));
        Assert.assertEquals("books", StringUtils.stripStart(", , books", StringUtils.SPACE + ","));
        Assert.assertEquals("books", StringUtils.stripStart(",,,books", StringUtils.SPACE + ","));
        Assert.assertEquals("test , books", StringUtils.stripStart("test , books", StringUtils.SPACE + ","));
        Assert.assertEquals("test ,books", StringUtils.stripStart(",,,,test ,books", StringUtils.SPACE + ","));
    }

    @Test
    public void testIsEmpty(){
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertFalse(StringUtils.isEmpty("A"));
    }
}
