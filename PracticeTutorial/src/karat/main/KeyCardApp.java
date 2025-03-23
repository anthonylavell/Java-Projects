package karat.main;

import karat.KeyCard;

public class KeyCardApp {
    public static void main(String[] args) {
        String [] keyName = {"daniel","daniel","daniel","luis","luis","luis","luis"};
        String [] keyTime = {"10:00","10:40","11:01","09:00","11:00","13:00","15:00"};
        System.out.println(KeyCard.alertNames(keyName,keyTime));
    }
}
