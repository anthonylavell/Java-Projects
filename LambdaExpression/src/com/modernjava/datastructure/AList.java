package com.modernjava.datastructure;

import java.util.LinkedList;

public class AList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(6);
        /*System.out.println("----Lambda Express ForEach Loop-----");
        linkedList.forEach((i -> System.out.print(i + " ") ));
        System.out.println("----\nRegular For Loop-------");
        for(int i = 0; i < linkedList.size(); i++){
            System.out.print(linkedList.get(i) + " ");
        }*/
        //System.out.println("--\nForEach Loop-------");
        for(int i : linkedList){
            System.out.print(i + " ");
        }
        System.out.println("");
        linkedList.add(1,4);
        for(int i : linkedList){
            System.out.print(i + " ");
        }

    }
}
