package com.agro.analytics.java8.lambda.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @BeforeEach
    void mySetup() {
        System.out.println(" start of mysetup");
    }


    @BeforeEach
    void setUp() {
        System.out.println(" start of test");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" end of mytearDown");
    }

    @AfterEach
    void mytearDown() {
        System.out.println(" end of test");
    }

    @Test
    void addTwoNumbers() {
        System.out.println("in test addTwoNumbers ");
        int someOfTwoNumbers = Calculator.addTwoNumbers(1, 2);
        assertEquals(3, Calculator.addTwoNumbers(1, 2));
        assertEquals(4, Calculator.addTwoNumbers(2, 2));
        assertEquals(30, Calculator.addTwoNumbers(10, 20));
        assertEquals(17, Calculator.addTwoNumbers(8, 9));
        assertEquals(-50, Calculator.addTwoNumbers(-25, -25));
    }

    @Test
    void subtractTwoNumbers() {
        System.out.println("in test subtractTwoNumbers ");
        assertEquals(0, Calculator.subtractTwoNumbers(-25, -25));
        assertEquals(3, Calculator.subtractTwoNumbers(5, 2));
    }
}