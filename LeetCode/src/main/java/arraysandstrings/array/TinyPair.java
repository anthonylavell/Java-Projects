package arraysandstrings.array;

public class TinyPair {
    public static void main(String[] args) {
        int [] a = {16,1,4,2,14};
        int [] b = {7,11,2,0,15};
        int k = 743;
        String str = "";
        int temp = Integer.parseInt(str.concat(String.valueOf(a[0])).concat(String.valueOf(b[b.length-1])));
        System.out.println("String: " + str);
        System.out.println("temp: " + temp);
        pairs(a,b,k);
    }
    public static int pairs(int [] a, int [] b, int k){
        int total = 0;
        int bCounter = b.length-1;
        for(int i = 0; i < a.length; i++){
            int temp = Integer.parseInt("".concat(String.valueOf(a[i])).concat(String.valueOf(b[bCounter])));
            if(temp < k){
                total++;
            }
            bCounter--;

        }
        return total;
    }
}
