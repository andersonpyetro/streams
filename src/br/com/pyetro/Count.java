package br.com.pyetro;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        long count = list.stream()
                .filter(person -> person.getName().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
