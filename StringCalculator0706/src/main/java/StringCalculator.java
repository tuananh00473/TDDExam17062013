/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/7/13
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static int add(String s) {
        return getSum(s);
    }

    public static int getSum(String s){
        int sum = 0;
        if(!s.isEmpty()){
            try{
                return toInt(s);
            }catch(Exception e){}
        }
        return sum;
    }

    public static int toInt(String s){
        return Integer.parseInt(s);
    }
}
