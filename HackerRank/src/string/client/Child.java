package string.client;

public class Child {
    // Complete the commonChild function below.
   public static int commonChild(String s1, String s2) {
       String str = "";
        for(int count =0; count < s1.length(); count++){
            if(s2.indexOf(s1.charAt(count)) >=0){
                str = str+ s1.charAt(count);
                s2 = s2.substring(0,s2.indexOf(s1.charAt(count))) + s2.substring(s2.indexOf(s1.charAt(count))+1, s2.length());
            }
        }
        str = str.trim();
        //for()
       System.out.println(str);
        return 0;
    }
}
