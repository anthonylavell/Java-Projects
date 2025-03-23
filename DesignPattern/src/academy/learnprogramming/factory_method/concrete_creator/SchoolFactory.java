//Concrete Creator creating Private or Public School objects
package academy.learnprogramming.factory_method.concrete_creator;

import academy.learnprogramming.factory_method.schools.PrivateSchool;
import academy.learnprogramming.factory_method.schools.PublicSchool;
import academy.learnprogramming.factory_method.schools.School;

public class SchoolFactory {
    public School getSchool(String schoolType) throws Exception{
        switch (schoolType.toUpperCase()){
            case "PRIVATE":
                return new PrivateSchool();
            case "PUBLIC":
                return new PublicSchool();
                default:
                    throw new Exception("Can not instantiated "+schoolType);
        }

    }
}
