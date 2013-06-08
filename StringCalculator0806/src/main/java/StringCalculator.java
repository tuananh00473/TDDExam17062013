import java.util.ArrayList;
import java.util.List;

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
        }catch (Exception e){
            if(!s.isEmpty()){

                if(s.startsWith("//")){
                    if (s.contains("[")){

                    }else{
                        s = s.replace(s.substring(2,3), ",");
                        s = s.substring(4);
                    }
                }

                s = s.replace("\n", ",");

                String str[] = s.split(",");
                List<Integer> listNegative = new ArrayList<Integer>();
                for(int i=0; i<str.length; i++){
                    int value = toInt(str[i]);
                    if(value < 0){
                        listNegative.add(value);
                    } else if (value <= 1000){
                        sum += value;
                    }
                }
                if(listNegative.size() > 0){
                    String negativeMessage = "Negative Exception with";
                    for(int i=0; i<listNegative.size(); i++){
                        negativeMessage += " " +listNegative.get(i);
                    }
                    throw new RuntimeException(negativeMessage);
                }
            }
        }
        return sum;
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}
