package br.com.pyetro;

import java.util.*;
import java.util.stream.Collectors;


public class Collect {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        List<Person> listB = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toList());

        listB.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        Set<Person> set = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        ArrayList<Person> arrayList = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toCollection(ArrayList::new));

        arrayList.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        Map<Integer, Person> map = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .collect(Collectors.toMap(Person::getAge, Person::new));

        map.forEach((k,v) -> System.out.println(k + " / " + v));

        System.out.println("************");
        System.out.println("************");

        Map<Integer, List<Person>> groupByAge = list.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        groupByAge.forEach((k,v) -> System.out.println(k + " / " + v));
    }

}
