package br.com.pyetro;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();
        Stream<Person> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"));

        Predicate<Person> pred = person -> person.getNationality().equals("Brazil");
        Stream<Person> stream1 = list.stream().filter(pred);

        Predicate <Person> pred1 = new Predicate<Person>(){

            @Override
            public boolean test(Person person) {
                return person.getNationality().equals("Brazil");
            }
        };

        Stream<Person> stream2 = list.stream().filter(pred1);

        Stream<Person> stream3 = list.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getNationality().equals("Brazil");
            }
        });
    }
}
