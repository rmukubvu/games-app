package com.spandigital.assessment.helper;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ExtractTest {

    @Test
    public void stringFromAlphanumeric_must_return_string() {
        String alphanumeric = "A String 1234 Take45";
        String expected = "A String  Take";
        String actual = Extract.stringFromAlphanumeric(alphanumeric);
        String errorMessage = String.format("expected [%s] got [%s]", expected, actual);
        assertTrue(errorMessage, actual.compareToIgnoreCase(expected) == 0);
    }

    @Test
    public void numberFromAlphanumeric_must_return_valid_int() {
        String alphanumeric = "A String 1234 Take45";
        int expected = 123445;
        int actual = Extract.numberFromAlphanumeric(alphanumeric);
        String errorMessage = String.format("expected [%d] got [%d]", expected, actual);
        assertTrue(errorMessage, actual == expected);
    }
}
