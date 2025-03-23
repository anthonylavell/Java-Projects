package arraysandstrings.string;

public class SubSet {
    public static void main(String[] args) {
        String fName = "michelle";
        String nickName = "MF_Miche_lle_";
        String tempStr = "";
        String str = "ABCABCAQTZB";
        for(int i = 0; i < nickName.length(); i++){
            if(nickName.charAt(i) == '_'){
                continue;
            }
            tempStr = tempStr+nickName.substring(i,i+1);
        }
        System.out.println(tempStr);

    }

}
