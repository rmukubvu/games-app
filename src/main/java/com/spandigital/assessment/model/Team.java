package com.spandigital.assessment.model;

public class Team {
    private String name;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("%s, %d pts", name, points);
    }
}