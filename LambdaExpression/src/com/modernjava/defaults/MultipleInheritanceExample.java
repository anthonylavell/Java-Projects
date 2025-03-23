package com.modernjava.defaults;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB,InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample =
                new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(4,8); // resolve to chile
        multipleInheritanceExample.sumB(2,4);
        multipleInheritanceExample.sumC(1,2);

    }

    // implemented class first
    // the sub interface that extends the interface
    public void sumA(int num1, int num2){
        System.out.println("MultipleInheritanceExample.sumA " + (num1 + num2));
    }
}
