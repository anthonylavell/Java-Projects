package streams.util;

import streams.model.City;
import streams.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Cities {
    public static void main(String[] args) {
        List<City> cities = getListOfCites();
        System.out.println("hll");
    }

    public static List<City> getListOfCites() {
        City newYork = new City("New York", getPeopleInCity(0,3));
        City paris = new City("Paris", getPeopleInCity(3,3));
        City london = new City("London", getPeopleInCity(6,3));
        List<City> cities = List.of(newYork,paris,london);
        return cities;
    }

    private static List<Person>getPeopleInCity(int start, int numberOfPeople){
        List<Person> people = (List<Person>) People.getListOfPeople(start,numberOfPeople);
        return people;
    }
}
