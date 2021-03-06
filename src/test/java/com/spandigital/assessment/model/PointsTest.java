package com.spandigital.assessment.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PointsTest {

    @Test
    public void getPoints_should_return_correct_points_for_draw() {
        int expectedDrawPoints = 1;
        int actual = Points.DRAW.value();
        assertEquals("draw should be 1 point", expectedDrawPoints, actual);
    }

    @Test
    public void getPoints_should_return_correct_points_for_win() {
        int expectedWinPoints = 3;
        int actual = Points.WIN.value();
        assertEquals("win should be 3 point", expectedWinPoints, actual);
    }

    @Test
    public void getPoints_should_return_correct_points_for_loss() {
        int expectedLossPoints = 0;
        int actual = Points.LOSS.value();
        assertEquals("loss should be 0 point", expectedLossPoints, actual);
    }
}