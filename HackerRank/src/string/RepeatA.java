package string;

public class RepeatA {

    public static long repeatedString(String s, long n) {
        if(s.length() == 1 && s.indexOf('a') >=0){
            return n;
        }
        long repeatedStr = findA(s);
        long remainder = n % s.length();
        repeatedStr = (n / s.length())*repeatedStr;

        if(remainder > 0) {
            repeatedStr+=findA(s.substring(0,(int)remainder));

        }
        return repeatedStr;
    }

    private static long findA(String str){
        long repeatedStr = 0;
        while (str.indexOf('a') >=0){
            repeatedStr++;
            str =str.substring(str.indexOf('a')+1);
        }
        return repeatedStr;
    }

    public static long repeatedStr(String s, long n) {
        /*if(s.length() == 1 && s.indexOf('a') >=0){
            return n;
        }*/
        long remainder = n%s.length();
        long total =  countCharsWithA(s);
        total = (n / s.length()) * total;
        if(remainder > 0){
            total += countCharsWithA(s.substring(0,(int)remainder));
        }
        return n-total;
    }

    private static long countCharsWithA(String s){
        int total = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                continue;
            }
            total++;
        }
        return total;
    }
}
