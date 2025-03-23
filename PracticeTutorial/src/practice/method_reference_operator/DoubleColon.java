package practice.method_reference_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleColon {
    public static void main(String[] args) {
        String [] arrayOfStr = {"ward","ten","tan"};
        List<Integer> listOfNum = new ArrayList<>(Arrays.asList(51,41,105));
       //Stream.of(arrayOfStr).forEach(DoubleColon :: reverse);
        Arrays.stream(arrayOfStr).forEach(DoubleColon::reverse);
      listOfNum.forEach(new DoubleColon()::reverse);
    }

    public static void reverse(String str){
        System.out.println(new StringBuilder(str).reverse().toString());
    }

    public void reverse(Integer num){
        Integer reverseN =0;
       while(num >0){
            reverseN*=10;
            reverseN =  reverseN+(num%10);
            num/=10;
       }
        System.out.println(reverseN);

    }

}
