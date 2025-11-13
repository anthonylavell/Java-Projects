package hacker_rank;

public class MyRegex {
    public String pattern =
            "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)\\."
                    + "(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)$";

    public static void main(String[] args) {
        String ip = "000.12.234.23";
        System.out.println(validateIPAddress(ip));
        
        
    }

    public static boolean validateIPAddress(String iP){
        String[] parts = iP.split("\\.");
        if(parts.length != 4){
            return false;
        }
        for(String str : parts){
            if (str.isBlank()){
                return false;
            }
            String temp = "";
            for(char ch : str.toCharArray()){
                if(Character.isDigit(ch)){
                    temp+=ch;
                }else {
                    return false;
                }
            }
            int num = Integer.parseInt(temp);
            if (num < 0 || num >255){
                return false;
            }
        }
        return true;
    }
}
