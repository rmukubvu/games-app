package com.spandigital.assessment.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class ScoresInputTest {

    @Test
    public void getInputType_should_return_correct_value_for_FILE() {
        assertTrue("expected file",ScoresInput.FILE.value() == "file");
    }

    @Test
    public void getInputType_should_return_correct_value_for_STDIN() {
        assertTrue("expected stdin",ScoresInput.STDIN.value() == "stdin");
    }
}
