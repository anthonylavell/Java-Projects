package practice.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeRegularExpression {
    private static String findStr="";
    private static String newStr;
    public static void main(String[] args) {
        String strReg = "(\\{)(.*\\}|\\})";
       // String str = "a{{n}t{h}o}n";
        String str ="a{n{t}h{}o{}n}";
       /*  Pattern bracketPat = Pattern.compile(strReg);
        Matcher matcher = bracketPat.matcher(str);
       int cout = 0;
        while (matcher.find()){
            System.out.println("Cout: "+(cout+1)+" "+matcher.start()+" "+matcher.end());
            str =str.replaceFirst("\\{","");
            str = str.replaceFirst("\\}","");
            str = str.trim();
            findStr="{}"+" "+findStr;
            matcher.reset(str);
        }*/
        findExpression(str,strReg);
        System.out.println("New Str: "+newStr);
        System.out.println("Find Str: "+findStr);


    }

    public static void findExpression(String str, String patternStr){
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            System.out.println("Start: "+matcher.start()+" End: "+matcher.end());
            str =str.replaceFirst("\\{","");
            str = str.replaceFirst("\\}","");
            str = str.trim();
            findStr="{}"+" "+findStr;
            newStr=str;
            findExpression(str, patternStr);
        }



    }
}
