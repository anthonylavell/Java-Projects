package arraysandstrings.string;

public class StrSplit {
    public static void main(String[] args) {
        int [] numbers = {10,40,50,14,25};
        int target = 14;
        boolean isTotalDouble = false;
        int total = 0;
        for(int num : numbers){
            total = (num == target) ? total + 1 : total + num;
        }
    }
}