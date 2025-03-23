package math;

public class FizzBuzz {
    public static void main(String[] args) {

    }
    public static void fizzBuzz(int num){
        for(int i = 1; i <= num; i++){
            String str = "";
            if(i >= 3 && i % 3 == 0){
                str+="Fizz";
            }

            if(i >= 5 && i % 5 == 0){
                str+="Buzz";
            }
            if(str.isEmpty()){
                str+=i;
            }
            System.out.println(str);

        }

    }
}
