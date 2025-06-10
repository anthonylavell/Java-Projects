package grinder.strings;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a,b));
    }

    public static int repeatedStringMatch(String a, String b) {
        int maxRep = 0;
        StringBuilder builder = new StringBuilder();
        while (builder.length() < b.length()) {
            builder.append(a);
            maxRep++;
        }
        if (builder.indexOf(b) > -1){
            return maxRep;
        }
        builder.append(a);
        maxRep++;

        return  builder.indexOf(b) > -1 ? maxRep : -1;
    }
}
