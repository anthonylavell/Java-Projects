package w3_resource.java.stream;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char letter = s.chars().mapToObj(ch -> (char) ch)
                .filter(ch->s.indexOf(ch)==s.lastIndexOf(ch)).findFirst().orElse('1');
        return letter=='1'?-1:s.indexOf(letter);
    }
    public static void main(String[] args) {
        FirstUniqueChar fchar = new FirstUniqueChar();
        String s = "loveleetcode";
        System.out.println(fchar.firstUniqChar(s));
    }
}
