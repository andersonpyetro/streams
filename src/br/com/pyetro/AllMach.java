package br.com.pyetro;

import java.util.List;

public class AllMach {
    public static void main(String[] args) {
        List<Person> list = new Person().populaPerson();

        boolean result = list.stream()
                .allMatch(person -> person.getNationality().equals("Mexico"));
        System.out.println(result);

        //Conventional Method

        Boolean re = true;
        for(Person p : list){
            if(!p.getNationality().equals("Mexico")){
                re = false;
                break;
            }
        }
    }
}
