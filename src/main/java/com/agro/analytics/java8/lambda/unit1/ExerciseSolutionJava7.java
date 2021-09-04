package com.agro.analytics.java8.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Condition {
    boolean test(Person p);
}

public class ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        printALL(people);
        lastNameEndingWithC(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });
    }

    static void printALL(List<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    static void lastNameEndingWithC(List<Person> list) {
        System.out.println("----last name start with C---");
        for (Person person : list) {
            if (person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
    }

    private static void printConditionally(List<Person> list, Condition condition){
        System.out.println("---printConditionally---");
        for (Person person : list) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}