package recursive;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(multiply(5));
    }
    public static int multiply(int num){
        if(num == 2){
            return 2;
        }
        int tNum = multiply(num-1); // 2, 6, 24
       int tempNum= num * tNum;
       return tempNum;
    }

    /*
    num = 5 return 24 (5*24)
    num = 4 return 6 (4*6)
    num = 3 return 2 (3*2)

     */
}
