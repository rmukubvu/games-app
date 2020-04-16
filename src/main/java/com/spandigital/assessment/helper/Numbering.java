package com.spandigital.assessment.helper;

import com.spandigital.assessment.model.Team;

import java.util.List;

public class Numbering {

    public static void show(List<Team> teams) {
        int at = 0;
        int points;
        int current = 0;
        for (int i = 0 ; i < teams.size() ; i++ ) {
            Team team = teams.get(i);
            points = team.getPoints();
            if (current != points) {
                at++;
            }
            current = points;
            System.out.printf("%d. %s\n", at, team.toString());
            if (at == i)
                at++;
        }
    }
}
