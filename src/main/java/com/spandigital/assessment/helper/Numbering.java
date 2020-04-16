package com.spandigital.assessment.helper;

import com.spandigital.assessment.model.Team;

import java.util.List;

public class Numbering {

    public static String format(List<Team> teams) {
        int at = 0;
        int points;
        int current = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < teams.size() ; i++ ) {
            Team team = teams.get(i);
            points = team.getPoints();
            if (current != points) {
                at++;
            }
            current = points;
            sb.append(String.format("%d. %s\n", at, team.toString()));

            if (at == i)
                at++;
        }
        return sb.toString();
    }
}
