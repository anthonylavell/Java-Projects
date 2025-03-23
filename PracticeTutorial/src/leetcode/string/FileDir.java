/*
A valid path is a string that starts with a slash "/" followed by a series of folder names separated by slashes. Example: "/ab/cd/ef"
There are two folder names that are not true folder names, but have special meaning. They are:
* Single dot is a null operation. "/ab/cd/./.ef" is the same as "/ab/cd/ef"
* Double dot means go up one directory. "/ab/cd/../ef" is the same as "/ab/ef"
* These two patterns must be by themselves. If they are part of any other combination of characters, there is no special treatment e.g. "/..." or "/.test"
Write a function that takes in a string path, resolves the "." and ".." logic described above, and returns the simplified path. Also come up with good edge cases and show that your code works for them.
"/ab/cd/.../.ef" is the same as "/ab/cd/.../.ef"
"/ab/cd/.ef" -> "/ab/cd/.ef"
 */
package leetcode.string;

import java.util.Stack;

public class FileDir {
    public static void main(String[] args) {
        String str = "/ab/cd/./ef";
        String str2 = "/ab/cd/../ef";
        String str3 = "/ab/cd/.../.ef";
        String str4 = "/ab/cd/.ef";
        System.out.println("Test one " + testCaseOne(str));
        System.out.println("Test two " + testCaseTwo(str2));
        System.out.println("Test three " + testCaseThree(str3));
        System.out.println("Test four " + testCaseFour(str4));
    }
    public static String dir(String str){
        Stack<String> stack = new Stack<>();
        String tempStr = "";
        for(int i = 0; i <= str.length(); i++){
            if(i!=str.length() && str.charAt(i) != '/'){
                tempStr+= str.charAt(i);
                continue;
            }else if(tempStr.equals(".") || tempStr.equals("..")){
                if(tempStr.equals("..")){
                    stack.pop();
                }
            }else {
                 if(i != str.length()){
                        tempStr+="/";
                    }
                    stack.add(tempStr);
            }
            tempStr = "";
        }
        while (!stack.isEmpty()){
            tempStr = stack.pop() + tempStr;
        }

        return tempStr;
    }
    private static boolean testCaseOne(String str){
        String result = "/ab/cd/ef";
        return result.equals(dir(str));
    }

    private static boolean testCaseTwo(String str){
        String result = "/ab/ef";
        return result.equals(dir(str));
    }

    private static boolean testCaseThree(String str){
        String result = "/ab/cd/.../.ef";
        return result.equals(dir(str));
    }

    private static boolean testCaseFour(String str){
        String result = "/ab/cd/.ef";
        return result.equals(dir(str));
    }
}
