package grinder.arrays;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        int reminder = 0;
        StringBuilder num = new StringBuilder();
        while ((aIndex > -1 || bIndex > -1) || reminder >0){
            int aNum = aIndex < 0 ? 0 : (int)(a.charAt(aIndex--)-'0');
            int bNum = bIndex < 0 ? 0 : (int)(b.charAt(bIndex--)-'0');
            int total = (aNum + bNum + reminder);
            reminder = total > 1 ? 1 : 0;
            char ch = (char) ((total%2) + '0');
            num.insert(0, (ch));
        }
        return num.toString();
    }

    public static void main(String[] args) {
       String a = "1010";
       String b ="1011";
        System.out.println(addBinary(a,b));
    }
}
