package comp_p.ge;

public class MapDigit {
    public static int mirror10(String n){
        n=n.trim();
        int num = 0;
        for (char ch:n.toCharArray()){
            int tmp = ch == '0' ? 0 : 10;
            num=num*10+(tmp-(ch-'0'));
        }
        return num;
    }
    static void main() {
       /* String n = "123"; //987
        String n2 = "9"; */ //1
        String n3 = "10"; //90
        String n4= "908"; //102
        //System.out.println(mirror10(n));
        //System.out.println(mirror10(n2));
        System.out.println(mirror10(n3));
        System.out.println(mirror10(n4));

    }
}
