package br.com.pyetro;

import java.util.List;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        Stream<Person> stream = list.stream().distinct();
    }
}
