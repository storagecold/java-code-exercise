package com.agro.analytics.java8.lambda.unit1;

import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //step 1 - sort list by LatName


        //step 2 -  craete a method that prints all elements in the list.

        printALL(people);
        //step3 -  create a method that print all people those have last name begigning with c.

        lastNameEndingWithC(people);
    }

    static void printALL(List<Person> list) {
        for (Person person : list) {
            System.out.println(person);
        }
    }

    static void lastNameEndingWithC(List<Person> list) {
        System.out.println("---------------");
        for (Person person : list) {
            if (person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
    }
}
