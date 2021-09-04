package com.agro.analytics.java8.lambda.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseSolutionJava8 {
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
        printConditionally(people, p -> true);

        //step 3
        printConditionally(people, person -> person.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> list, Condition condition) {
        System.out.println("---printConditionally---");
        for (Person person : list) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}