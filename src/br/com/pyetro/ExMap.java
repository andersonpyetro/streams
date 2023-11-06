package br.com.pyetro;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExMap {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        Stream<Integer> stream = list.stream()
                .filter(person -> person.getNationality().equals("Brazil"))
                .map(Person::getAge);

        IntStream stream1 = list.stream()
                .filter(person ->person.getNationality().equals("Brazil"))
                .mapToInt(Person::getAge);
    }
}
