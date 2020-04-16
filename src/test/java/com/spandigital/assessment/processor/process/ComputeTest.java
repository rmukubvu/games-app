package com.spandigital.assessment.processor.process;

import org.junit.Test;

public class ComputeTest {

    @Test
    public void processScores_must_have_count_twice_number_of_lines() {
       /* List<String> lines = new ArrayList<>(4);
        lines.add("Lions 3, Snakes 3");
        lines.add("Tarantulas 1, FC Awesome 0");
        lines.add("Lions 1, FC Awesome 1");
        lines.add("Tarantulas 3, Snakes 1");
        ExtractScores computeResult = new Compute();
        Iterable<Team> result = computeResult.getScoresPerLine(lines);
        long actual = StreamSupport.stream(result.spliterator(), false).count();
        //two teams per line seperated by a comma
        long expected = lines.size() * 2;
        assertTrue("expected list of size 8 elements", actual == expected);
        */
    }
}
