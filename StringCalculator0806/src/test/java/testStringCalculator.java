import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/8/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class testStringCalculator {
    @Test
    public void testShouldReturn0WithEmptyString(){
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testShouldReturnNumber(){
        Assert.assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testShouldReturnSumOfNumber(){
        Assert.assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void testShouldReturnSumOfNumberWithRegex(){
        Assert.assertEquals(6, StringCalculator.add("1\n2,3"));
    }


}
