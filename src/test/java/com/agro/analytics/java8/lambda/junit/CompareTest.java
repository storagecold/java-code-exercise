package com.agro.analytics.java8.lambda.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareTest {

    @Test
    void compareTwoNumbers() {

        assertFalse(Compare.compareTwoNumbers(1, 2));
        assertTrue(Compare.compareTwoNumbers(1, 1));

    }
}