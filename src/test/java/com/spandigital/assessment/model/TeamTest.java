package com.spandigital.assessment.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeamTest {

    private Team team;

    @Before
    public void setup(){
        team = new Team("Tarantulas",0,6);
    }

    @Test
    public void toString_should_print_correct_format() {
        String expectedOutput = "Tarantulas, 6 pts";
        String message = String.format("expected %s",expectedOutput);
        assertEquals(message, 0, team.toString().compareToIgnoreCase(expectedOutput));
    }
}
