//Implements the School interface
package academy.learnprogramming.factory_method.schools;

public class PrivateSchool implements School {
    @Override
    public void attendance(){
        System.out.println("I attend private School");
    }
}
