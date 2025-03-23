package concrete;

import abstractclass.IStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
    public static List<IStudent> getAll(){
        IStudent student1 = new Student("Anthony Ward",36,"Computer Science",3.4,
                "Senior",true, new ArrayList<>(Arrays.asList("CPTR 4200")));

        IStudent student2 = new Student("Clara Sterling",66,"Music",3.9,
                "Sophomore", false,new ArrayList<>(Arrays.asList("Music 101",
                "Song Writer 102")));

        IStudent student3 = new Student("Jasmine Catledge",33,"Writer",3.5,
                "Junior",false,new ArrayList<>(Arrays.asList("Writing 101",
                "Song Writer 102", "Home Make 102")));

        IStudent student4 = new Student("Lasharea Brown",19,"Doctor",4.0,
                "Freshman", true,new ArrayList<>(Arrays.asList("Algebra 101",
                "Chemistry 102","Nurse 101")));

        List<IStudent> listOfStudents = new ArrayList<>(Arrays.asList(student1,student2
                ,student3,student4));
        return listOfStudents;
    }
}
