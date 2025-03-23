package streams.main.alt;

import streams.model.City;
import streams.util.Cities;

import java.util.List;

public class PlayWithFlatMapAlt {
    public static void main(String[] args) {
        List<City> cities = Cities.getListOfCites();
        long count = cities.stream()
                .flatMap(city -> city.getPeople().stream())
                .count();
        System.out.println("Count = " + count);
    }
}
