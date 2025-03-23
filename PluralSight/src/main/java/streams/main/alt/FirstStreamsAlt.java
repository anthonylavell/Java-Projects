package streams.main.alt;

import streams.model.Person;
import streams.util.People;

import java.util.List;

public class FirstStreamsAlt {
    public static void main(String[] args) {
        List<Person> people = (List<Person>) People.getListOfPeople(10);

        long totalCountOfPeople = people.stream()
                .count();
        System.out.println("Total Count Of People: " + totalCountOfPeople);

        long countEmptyNames = people.stream()
                .map(person -> person.getName())
                .filter(name -> name.isEmpty())
                .count();
        System.out.println("EmptyNames Count: " + countEmptyNames);

        long countNonEmptyNames = people.stream()
                .map(person -> person.getName())
                .filter(name -> !name.isEmpty())
                .count();

        System.out.println("NonEmptyNames Count: " + countNonEmptyNames);
    }
}
