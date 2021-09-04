package com.agro.analytics.java8.lambda.unit2;

import com.agro.analytics.java8.lambda.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //step 1
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        // Collections.sort(people, Comparator.comparing(Person::getLastName));

        //step 2 print all person
        performConditionally(people, p -> true, p -> System.out.println(p));

        //step 3
        performConditionally(people, person -> person.getLastName().startsWith("C"));
    }

    private static void performConditionally(List<Person> list, Predicate<Person> predicate) {
        System.out.println("---printConditionally---");
        for (Person person : list) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }
}