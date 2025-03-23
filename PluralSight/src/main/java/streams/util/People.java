package streams.util;

import streams.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class People {

    public static void main(String[] args) {
        List<Person> people =  getListOfPeople(5);
        System.out.println("hello");
    }
    public static List<Person> getListOfPeople(int numberOfPeople){
        List<Person> tempPeople = getPeople();
        List<Person> people = tempPeople.stream()
                .limit(numberOfPeople)
                .collect(Collectors.toList());
        return people;
    }

    public static List<Person> getListOfPeople(int start, int numberOfPeople){
        List<Person> tempPeople = getPeople();
        List<Person> people = tempPeople.stream()
                .skip(start)
                .limit(numberOfPeople)
                .collect(Collectors.toList());
        return people;
    }

    public static Person[] getArrayOfPeople(int numberOfPeople){
        List<Person> tempPeople = getPeople();
       Person[] people = tempPeople.stream()
                .limit(numberOfPeople)
                .toArray(Person[]::new);
       return people;
    }

    private static List<Person> getPeople(){
        Person p01 = new Person("Paul",25);
        Person p02 = new Person("Sarah",27);
        Person p03 = new Person("James",31);
        Person p04 = new Person("Julie",25);
        Person p05 = new Person("Charles",22);
        Person p06 = new Person("Charlotte",31);
        Person p07 = new Person("Ann",27);
        Person p08 = new Person("Boris",29);
        Person p09 = new Person("Emily",34);
        Person p10 = new Person("",34);
        return List.of(p01,p02,p03,p04,p05,p06,p07,p08,p09,p10);
    }

}
