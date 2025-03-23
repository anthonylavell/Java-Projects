package array.main;

import array.Arr;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ArrMain {
    public static void main(String[] args) {
        Arr mainArr = new Arr();
        mainArr.addItem("Pretty");
        mainArr.addItem("Tony");
        //System.out.println(mainArr.size());
        //mainArr.displayArr();
        mainArr.addItemPos(1,"love");
        mainArr.displayArr();
        System.out.println(mainArr.size());
        mainArr.deleteItemPos(1);
        mainArr.displayArr();
        System.out.println(mainArr.size());

       /* mainArr.addItem("Anthony");
        System.out.println(mainArr.size());
        mainArr.displayArr();
        mainArr.deleteItem();
        System.out.println(mainArr.size());
        mainArr.displayArr();
        mainArr.addItem("Love");
        System.out.println(mainArr.size());
        mainArr.displayArr();*/

    }
}
