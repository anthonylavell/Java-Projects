package java_enum;

import java.util.HashSet;
import java.util.Set;

enum GamePlay
{
    ROCK,SCISSOR,PAPER;
}

public class LearnEnum {
    public static void main(String[] args) {
        GamePlay player1 = GamePlay.ROCK;
        GamePlay player2 = GamePlay.SCISSOR;
        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
        System.out.println(player1.compareTo(player2));
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
        return "";
    }

    private static Set<String>getAllSet(){
        Set<String>setOfPlayerChoice = new HashSet<>();
        setOfPlayerChoice.add("ROCK");
        setOfPlayerChoice.add("SCISSOR");
        setOfPlayerChoice.add("PAPER");
        return setOfPlayerChoice;
    }

}
