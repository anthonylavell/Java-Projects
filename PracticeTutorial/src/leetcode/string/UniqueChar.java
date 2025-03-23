package leetcode.string;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqueChar(str));
    }

    public static int firstUniqueChar(String s) {
        int index = Integer.MAX_VALUE;
        for(char ch = 'a'; ch <= 'z'; ch++){
            int tempIndex = s.indexOf(ch);
            if(tempIndex != -1 && s.lastIndexOf(ch) == tempIndex){
                index = Math.min(tempIndex,index);
            }
        }
        return (index == Integer.MAX_VALUE)?-1 : index;
    }
}
