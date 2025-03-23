package arraysandstrings.string.client;

import arraysandstrings.string.Result;

public class STRClient {
    public static void main(String[] args) {
        //String str = "abcabc"; //3
        //String str = "xabcabcabc"; // 4
        //String str = "bacxfgebbacabc"; // 8
        //String str = "abcfbc"; // -1
        //String str = "abcdefg"; // -1
        //String str = "abcfgabc"; // 5
        //String str = "abcagabc"; // 5
        //String str = "abcabdabc"; // 6
        //String str = "bbbbxbbb"; // 5
       //int index = STR.findIndex(str);

        //System.out.println(Result.consecutive(250));
        int result = Result.consecutive(250);
        System.out.println(result);
        result = Result.consecutive2(250);
        System.out.println(result);
    }
}
