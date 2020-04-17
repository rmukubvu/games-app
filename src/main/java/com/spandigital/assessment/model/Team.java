package com.spandigital.assessment.model;

public class Team {
    private String name;
    private Integer score;
    private Integer points;

    public Integer getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Team() {
        this.name = "";
        this.score = 0;
        this.points = 0;
    }

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Team(String name, int score , int points) {
        this.name = name;
        this.score = score;
        this.points = points;
    }


    @Override
    public String toString() {
        return String.format("%s, %d pts", name, points);
    }
}
