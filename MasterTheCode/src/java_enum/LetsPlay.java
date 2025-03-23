package java_enum;

import java.util.HashSet;
import java.util.Set;

public class LetsPlay {
    public static void main(String[] args) {
       String player1 = "ROC";
       String player2 = "PAPER";
        System.out.println(play(player1,player2));
        System.out.println(playEnum(player1,player2));
    }

    public static String play(String player1, String player2){
        if(!getAllSet().contains(player1) || !getAllSet().contains(player2)){
            return "Please chose correct options";
        }
        if(player1.equals(player2)){
            return "TIE";
        }

        if(player1.equals("ROCK") && player2.equals("SCISSOR")){
            return "PLAYER1";
        }else if(player1.equals("SCISSOR") && player2.equals("PAPER")){
            return "PLAYER1";
        }else if(player1.equals("PAPER") && player2.equals("ROCK")){
            return "PLAYER1";
        }

        return "PLAYER2";
    }

    public static String playEnum(String player1, String player2){
        if(!isElementInEnum(player1) || !isElementInEnum(player2)){
            return "Please chose correct options";
        }
        if(player1.equals(player2)){
            return "TIE";
        }

        if(player1.equals("ROCK") && player2.equals("SCISSOR")){
            return "PLAYER1";
        }else if(player1.equals("SCISSOR") && player2.equals("PAPER")){
            return "PLAYER1";
        }else if(player1.equals("PAPER") && player2.equals("ROCK")){
            return "PLAYER1";
        }

        return "PLAYER2";
    }

    private static boolean isElementInEnum(String val){
        boolean isContain = false;
        try {
            if(GamePlay.valueOf(val).ordinal()>-1){
                isContain = true;
            }
        }catch (Exception e){
            return isContain;
        }
         return isContain;
    }

    private static Set<String> getAllSet(){
        Set<String>setOfPlayerChoice = new HashSet<>();
        setOfPlayerChoice.add("ROCK");
        setOfPlayerChoice.add("SCISSOR");
        setOfPlayerChoice.add("PAPER");
        return setOfPlayerChoice;
    }
}
