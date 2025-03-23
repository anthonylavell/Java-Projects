package arraysandstrings.string.longest_string;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
       // String str = "pickoutthelongestsubstring";
        //String str2 = "ppppppppppppp";
        String str3 = "abcabcbb";
        //String str4 = " ";
        //String str5 = "molly";
        int start = 0;
        int total = 0;
        //int len = str4.length();
        //int len2 = "".length();
       /* System.out.println("Len: "+ "  ".length());
        System.out.println("TorF: "+ "  ".equals(""));
        System.out.println("String one total: "+lengthOfLongestSubstring(str));
        System.out.println("String two total: "+lengthOfLongestSubstring(str2));
        System.out.println("String three total: "+lengthOfLongestSubstring(str3));*/
        System.out.println("String three total: "+lengthOfLongestSubstring2(str3));
    }
    public static int lengthOfLongestSubstring(String str) {
        int total = 0;
        String tempStr = "";
        for(int i = 0; i <str.length(); i++){
            int chIndex = tempStr.indexOf(str.charAt(i));
            if(chIndex > -1){
                total = (total < tempStr.length()) ? tempStr.length() : total;
                tempStr = tempStr.substring(chIndex+1);
            }
            tempStr += str.charAt(i);
        }
        return  (total < tempStr.length()) ? tempStr.length() : total;
    }

    public static int lengthOfLongestSubstring2(String str) {
        int total = 0;
        int startIndex = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            int chIndex = str.substring(0,i).indexOf(ch,startIndex);
            if (chIndex > -1) {
                total = (total < (i-startIndex)) ? (i-startIndex) : total;
                startIndex = chIndex+1;
            }
        }
        int len = (str.length()-startIndex);
        return (total < len) ? len : total;

    }

}
