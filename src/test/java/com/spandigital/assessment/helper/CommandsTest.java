package com.spandigital.assessment.helper;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CommandsTest {

    @Test
    public void showAll_must_not_be_empty() {
        assertNotNull(Commands.showAll());
    }

}
