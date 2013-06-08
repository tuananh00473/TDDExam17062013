/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/8/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static int add(String s) {
        return getSum(s);
    }

    private static int getSum(String s) {
        int sum = 0;
        try{
            return toInt(s);
        }catch (Exception e){}
        return sum;
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
