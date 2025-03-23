package array.main;

import array.RecurringCharacter;

public class RecurringCharacterMain {
    public static void main(String[] args) {
        int array[] = {2,5,1,2,3,5,1,2,4};
        System.out.println("Array = " + RecurringCharacter.first(array));
        int array2 [] = {2,1,1,2,3,5,1,2,4};
        System.out.println("Array2 = " + RecurringCharacter.first(array2));
        int array3 [] = {2,3,4,5};
        System.out.println("Array3 = "+ RecurringCharacter.first(array3));
    }
}
