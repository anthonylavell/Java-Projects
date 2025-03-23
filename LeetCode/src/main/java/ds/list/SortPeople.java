package ds.list;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortPeople {
    public static List<People> byName(List<People> sortPeople){

        return sortPeople.stream().sorted(Comparator.comparing(People::name)).collect(Collectors.toList());

    }

    public static List<People> reverseByName(List<People> sortPeople){

        return sortPeople.stream().sorted(Comparator.comparing(People::name).reversed()).collect(Collectors.toList());
    }

    public static List<People> byAge(List<People> sortPeople){

        return sortPeople.stream().sorted(Comparator.comparingInt(People::age)).collect(Collectors.toList());
    }

    public static List<People> reverseByAge(List<People> sortPeople){

        return sortPeople.stream().sorted(Comparator.comparingInt(People::age).reversed()).collect(Collectors.toList());
    }
}
