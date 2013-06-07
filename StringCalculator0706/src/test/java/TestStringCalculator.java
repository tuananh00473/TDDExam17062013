import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/7/13
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {
   @Test
    public void testShouldReturn0WithEmptyString(){
       assertEquals(0, StringCalculator.add(""));
   }
}
