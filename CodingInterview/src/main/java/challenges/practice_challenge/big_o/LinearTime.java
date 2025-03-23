package challenges.practice_challenge.big_o;

import java.util.Arrays;
// Big O(N)
public class LinearTime {
    public static void main(String[] args) {
        String [] str = {"anthony","nemo"};
         long start = System.currentTimeMillis();
        LinearTime.findNemo(str);
        long end = System.currentTimeMillis();
        System.out.println((end-start));
    }
    public static void findNemo(String [] str){
        String[] arrStr = new String[100];
        Arrays.fill(arrStr,"nemo");
        for (String i : arrStr){
            if(i == "nemo") {
                System.out.println("Find nemo");

            }
        }

    }

}
