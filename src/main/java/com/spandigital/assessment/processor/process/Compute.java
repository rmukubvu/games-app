package com.spandigital.assessment.processor.process;

import com.spandigital.assessment.contract.Database;
import com.spandigital.assessment.helper.Extract;
import com.spandigital.assessment.helper.Numbering;
import com.spandigital.assessment.helper.RankSorting;
import com.spandigital.assessment.model.Points;
import com.spandigital.assessment.model.Team;

import java.util.*;

public class Compute {
    private Database<Team> db;
    public Compute(Database<Team> db){
        this.db = db;
    }

    public String printLogTable(final Iterable<String> scores) {
        List<Team> teams = new ArrayList<>();
        //get the points for each line
        for (String scoreLine : scores) {
            //get list of teams per line
            //2 per line
            teams.addAll(getTeamCollectionFromLine(scoreLine));
            calculatePointsForTeams(teams);
            //clear it
            teams.clear();
        }
        //once done do the sorting to display
        sort(teams);
        //format
        return format(teams);
    }

    private int getSavedPoints(String key){
        Team team = db.get(key);
        if ( team == null ) {
            return new Team().getPoints();
        }
        return team.getPoints();
    }

    private void sort(List<Team> teams) {
        teams.addAll((Collection<? extends Team>) db.getAll());
        RankSorting.sort(teams);
    }

    private String format(List<Team> teams){
        return Numbering.format(teams);
    }

    private Collection<? extends Team> getTeamCollectionFromLine(String line) {
        String[] split = line.split(",");
        List<Team> teamList = new ArrayList<>(2);
        for (String s : split
        ) {
            teamList.add(new Team(getTeamName(s), getScore(s)));
        }
        return teamList;
    }

    private String getTeamName(String line){
        return Extract.stringFromAlphanumeric(line);
    }

    private int getScore(String line){
        return Extract.numberFromAlphanumeric(line);
    }

    private void calculatePointsForTeams(List<Team> teams) {
        Team team1 = teams.get(0);
        Team team2 = teams.get(1);

        if (draw(team1, team2)) {
            updateScores(team1, Points.DRAW.value());
            updateScores(team2, Points.DRAW.value());
        } else if (team1Win(team1, team2)) {
            updateScores(team1, Points.WIN.value());
            updateScores(team2, Points.LOSS.value());
        } else {
            updateScores(team1, Points.LOSS.value());
            updateScores(team2, Points.WIN.value());
        }
    }

    private boolean draw(Team team1,Team team2){
        return team1.getScore() == team2.getScore();
    }

    private boolean team1Win(Team team1,Team team2){
        return team1.getScore() > team2.getScore();
    }

    private void updateScores(Team team,int point){
        int newPoints = getSavedPoints(team.getName()) + point;
        team.setPoints(newPoints);
        db.save(team.getName(),team);
    }
}
