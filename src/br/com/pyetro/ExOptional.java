package br.com.pyetro;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExOptional {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        Optional<Person> optional = list.stream()
                .max(Comparator.comparing(Person::getAge));

        if (optional.isPresent()){
            System.out.println(optional.get());
        }

        optional.ifPresent(System.out::println);
    }
}
