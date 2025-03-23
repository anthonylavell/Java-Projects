package ds.list;

import ds.list.client_interface.Person;

import java.util.Comparator;

public class People implements Person {
    private String name;
    private int age;

    public People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Comparator<People> peopleNameComparator = new Comparator<People>() {

        public int compare(People s1, People s2) {
            String peopleName1 = s1.name();
            String peopleName2 = s2.name();

            //ascending order
           // return peopleName1.compareTo(peopleName2);

            //descending order
            return peopleName2.compareTo(peopleName1);
        }
    };

    @Override
    public String name() {
        return name;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String toString(){
      return name + age;
    }
}
