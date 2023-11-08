package org.example.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunMain {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("James", Gender.MALE),
                new Person("Jane", Gender.FEMALE),
                new Person("Jen", Gender.FEMALE),
                new Person("John", Gender.MALE)
        );

        System.out.println("<<<Imperative>>>");
        List<Person> females = new ArrayList<Person>();
        for (Person female: people
             ) {
            if (female.gender.equals(Gender.FEMALE)){
                females.add(female);
            }
        }

        for (Person woman:
             females) {
            System.out.println(woman);
        }

        System.out.println("<<<Declarative>>>");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,
        FEMALE
    }

}
