package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        int [] intArr = {1,2,3,4,5};
        List<int []> list = new ArrayList<>();
        list.add(intArr);
       list.forEach(num->
           System.out.println(Arrays.toString(num)) );
    }
}
