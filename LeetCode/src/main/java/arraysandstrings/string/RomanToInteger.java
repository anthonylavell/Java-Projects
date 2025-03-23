package arraysandstrings.string;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s) {
        int previousAmount = 0;
        int total = 0;
        for(char ch : s.toCharArray()){
           int currentAmount = convertChar(ch);
            if(currentAmount > previousAmount){
                currentAmount = currentAmount - previousAmount;
                total-=previousAmount;
            }
            total+=currentAmount;
            previousAmount = currentAmount;
        }

        return total;
    }

    private static int convertChar(char ch){
        switch (ch){
            case 'I' :
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private static int convertTwoChar(String str){
        switch (str){
            case "IV" :
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }
}
