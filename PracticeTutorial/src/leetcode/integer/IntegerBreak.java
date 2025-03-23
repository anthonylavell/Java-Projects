package leetcode.integer;

public class IntegerBreak {
    public static void main(String[] args) {
        int sum = intBreak(3);
        System.out.println(" sum = " + sum);
    }
    private static int intBreak(int n){
        if(n<4){
            return ((n-1)< 0)? 0 :n-1;
        }
        int total = 0;
        int counter = 2;
        int exp = 0;
        int reminder =0;
        int takeOff = 0;
        while (counter < 10){
            if(reminder==0){
                reminder = n%counter;
            }
            exp = (n/counter) - takeOff;
            int tempNum = (reminder==0)?(int) Math.pow(counter,exp):
                    (int) Math.pow(counter,exp)*reminder;
            if(exp >= 1) {
                if ((tempNum >= total) || (tempNum < total && reminder == 1)) {
                    if(tempNum > total){
                        total = tempNum;
                    }
                    if (reminder == 0) {
                        reminder = counter;
                        takeOff = +2;
                    } else {
                        takeOff++;
                    }
                    reminder = reminder + counter;
                    continue;
                }
            }
                counter++;
                reminder =0;
                takeOff=0;

        }

        return total;
    }
}
