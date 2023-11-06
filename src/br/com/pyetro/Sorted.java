package br.com.pyetro;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        Stream<Person> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .sorted(Comparator.comparing(Person::getName));
        Stream<Person> stream1 = list.stream()
                .sorted(Comparator.comparing(Person::getAge));

        Stream<Person> stream2 = list.stream()
                .sorted((p1,p2) -> Integer.compare(p2.getAge(), p1.getAge()));


    }
}
