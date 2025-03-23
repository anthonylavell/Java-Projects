//Implements the School interface
package academy.learnprogramming.factory_method.schools;

public class PublicSchool implements School {
    @Override
    public void attendance(){
        System.out.println("I attend Public School");
    }
}
