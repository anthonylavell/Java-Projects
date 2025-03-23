package com.modernjava.geico;
////Nankani, Chandan (internal): //Find the length of the longest substring without repeating characters.
//            //(1) Input String : pickoutthelongestsubstring
//            //    The longest substring : ubstring
//            //    The longest Substring Length: 8
//            //    (2) Input String : ppppppppppppp
//            //    The longest substring : p
//            //    The longest Substring Length: 1
//// abcbf
public class Test {
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        String str2 = "ppppppppppppp";
        String str3 = "molly";
        System.out.println("String one total: "+repeatStr(str));
        System.out.println("String two total: "+repeatStr(str2));
        System.out.println("String three total: "+repeatStr(str3));
    }

    public static int repeatStr(String str) {
        int total = 0;
        String tempStr = "";
        for(int i = 0; i <str.length(); i++){
            int chIndex = tempStr.indexOf(str.charAt(i));
            if(chIndex > -1){
                total = (total < tempStr.length() ? tempStr.length() : total);
                tempStr = tempStr.substring(chIndex+1);
            }
            tempStr += str.charAt(i);
        }
        return (tempStr.length() > total) ? tempStr.length() : total;

    }
}
