package br.com.pyetro;

import java.util.List;
import java.util.stream.Stream;

public class ForEachh {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        list.stream().forEach(person -> System.out.println(person.getName()));

        System.out.println("*****");
        System.out.println("*****");

        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .forEach(p -> System.out.println(p.getName()));

        System.out.println("*****");
        System.out.println("*****");

        Stream<Person> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"));

        stream.forEach(p -> System.out.println(p.getName()) );

        System.out.println("*****");
        System.out.println("*****");

        list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .map(Person::getAge)
                .forEach(p ->System.out.println(p));
    }
}
