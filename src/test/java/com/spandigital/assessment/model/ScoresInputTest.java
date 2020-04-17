package com.spandigital.assessment.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class ScoresInputTest {

    @Test
    public void getInputType_should_return_correct_value_for_FILE() {
        assertSame("expected file", "file", ScoresInput.FILE.value());
    }

    @Test
    public void getInputType_should_return_correct_value_for_STDIN() {
        assertSame("expected stdin", "stdin", ScoresInput.STDIN.value());
    }
}
