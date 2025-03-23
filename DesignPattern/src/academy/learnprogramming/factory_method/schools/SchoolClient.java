package academy.learnprogramming.factory_method.schools;

import academy.learnprogramming.factory_method.concrete_creator.SchoolFactory;

public class SchoolClient {
    public static void main(String [] args) throws Exception{
        SchoolFactory schoolFactory = new SchoolFactory();
        School school = schoolFactory.getSchool("public");
        school.attendance();
        schoolFactory.getSchool("private").attendance();
    }
}
