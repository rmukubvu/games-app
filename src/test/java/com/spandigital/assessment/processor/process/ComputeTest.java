package com.spandigital.assessment.processor.process;

import com.spandigital.assessment.store.InMemory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ComputeTest {

    @Test
    public void processScores_must_have_result() {
        List<String> lines = new ArrayList<>(4);
        lines.add("Lions 3, Snakes 3");
        lines.add("Tarantulas 1, FC Awesome 0");
        lines.add("Lions 1, FC Awesome 1");
        lines.add("Tarantulas 3, Snakes 1");
        Compute computeResult = new Compute(new InMemory<>());
        String result = computeResult.printLogTable(lines);
        assertFalse("expected data to be returned", result.isEmpty());
    }

}
