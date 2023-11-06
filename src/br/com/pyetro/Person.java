package br.com.pyetro;

import java.util.List;
import java.util.Objects;

public class Person {

    private String id;
    private String name;
    private String nationality;
    private int age;
    public Person(){

    }
    public Person (String id,String name,String nationality,int age){
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    public Person (Person person){
        this(person.getId(),person.getName(),person.getNationality(), person.getAge());
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public List<Person> populaPerson(){
        Person person1 = new Person("p1","Matheus Henrique","Brazil",18);
        Person person2 = new Person("p2","Hernandez Roja","Mexico",21);
        Person person3 = new Person("p3","Mario Fernandes","Canada",22);
        Person person4 = new Person("p4","Neymar Junior","Brazil",22);
        return List.of(person1,person2,person3,person4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }
}
