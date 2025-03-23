package ds.list.clients;

import ds.list.People;
import ds.list.SortPeople;

import java.util.ArrayList;
import java.util.List;

public class ListOfPeople {
    public static void main(String[] args) {

        People anthony = new People("Anthony",35);
        People alvin = new People("Alvin",33);
        People lora = new People("Lora",51);
        People tear = new People("TearWard",39);

        List<People> listOfPerson = new ArrayList<>();
        listOfPerson.add(tear);
        listOfPerson.add(alvin);
        listOfPerson.add(lora);
        listOfPerson.add(anthony);

       /*listOfPerson.sort(Comparator.comparing(person -> person.name()));
        for(People person : listOfPerson){
            System.out.println(person.name()+" is "+person.age()+" years old");
        }
        System.out.println("");*/

        /*listOfPerson.sort(Comparator.comparing(People :: age ));

        for(People person : listOfPerson){
            System.out.println(person.name()+" is "+person.age()+" years old");
        }

        System.out.println("\n");*/

      //List<People> reverseSortNameList = listOfPerson.stream().sorted(Comparator.comparing(People :: name).reversed()).collect(Collectors.toList());

       /* Collections.sort(listOfPerson,People.peopleNameComparator);*/

        /*for(People person : reverseSortNameList){
            System.out.println(person.name()+" is "+person.age()+" years old");
        }
        System.out.println("");
        List<People> reverseAgeSortAgeList = listOfPerson.stream().sorted(Comparator.comparingInt(People :: age).reversed()).collect(Collectors.toList());
        for(People person : reverseAgeSortAgeList){
            System.out.println(person.name()+" is "+person.age()+" years old");
        }*/

        displayList(listOfPerson);
        System.out.println();
        displayList(SortPeople.byName(listOfPerson));
        System.out.println();
        displayList(SortPeople.reverseByName(listOfPerson));
        System.out.println();
        displayList(SortPeople.byAge(listOfPerson));
        System.out.println();
        displayList(SortPeople.reverseByAge(listOfPerson));



    }

    public static void displayList(List<People> listOfPeople){
        for(People person : listOfPeople){
            System.out.println(person.name()+" is "+person.age()+" years old");
        }
    }
}
