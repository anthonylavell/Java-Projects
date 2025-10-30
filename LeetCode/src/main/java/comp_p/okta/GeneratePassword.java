package comp_p.okta;

import java.util.Random;

public class GeneratePassword {

    public static String generatePassword(int len, boolean lowerC, boolean higherC, boolean numbers ){
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        while (password.length() < len){
            int choice = random.nextInt(3);
            if(lowerC && choice == 0){
                password.append(lowerCase());
            } else if(higherC && choice == 1){
                password.append(higherCase());
            } else if(numbers && choice == 2){
                password.append(numberCase());
            }
        }
        return password.toString();
    }

    private static char lowerCase(){
        return (char) ('a' + (int) (Math.random() * 26));
    }

    private static char higherCase(){
        return (char) ('A' + (int) (Math.random() * 26));
    }

    private static int numberCase(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(7, true, true, true ));
    }
}
