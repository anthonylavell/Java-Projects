package w3_resource.java.stream;

import java.util.List;

public class CountStringsStartWithLetter {
    final String str;
    public  int countStrStartWithLetter(List<String>listOfStr, char ch){
        str = "ant";
        int num = (int) listOfStr.stream().filter(str->str.charAt(0) == ch).count();
        return num;
    }
    public static void main(String[] args) {
        CountStringsStartWithLetter words = new CountStringsStartWithLetter();
        List<String>listOfStr = List.of("Ant","Lavell","Larry","Long");
        char ch = 'A';
        System.out.println(words.countStrStartWithLetter(listOfStr,ch));
    }

}
