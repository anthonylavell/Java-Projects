package practice.java8map;

import java.util.stream.Stream;

public class JavaMap {
    public static void main(String[] args) {
        Integer [] arrayOfNums = {2,4,6};
        Stream.of(arrayOfNums).map(num -> num*2).forEach(System.out :: println);
        Stream.of(arrayOfNums).map(JavaMap :: multiplyByThree).forEach(System.out :: println);
    }

    public static Integer multiplyByThree(Integer num){
        return num *3;
    }
}
