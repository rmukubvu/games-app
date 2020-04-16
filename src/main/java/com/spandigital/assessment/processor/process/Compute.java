package com.spandigital.assessment.processor.process;

import com.spandigital.assessment.contract.ExtractScores;
import com.spandigital.assessment.model.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Compute implements ExtractScores {


    @Override
    public Iterable<Team> getScoresPerLine(final Iterable<String> scores) {
        List<Team> teamList = new ArrayList<>();
        for (String score: scores
             ) {
            teamList.addAll(getTeamCollectionFromLine(score));
        }
        return teamList;
    }

    @Override
    public void sortLogTable(final Iterable<Team> teams) {

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
        return line.replaceAll("[A-Za-z]","").trim();
    }

    private int getScore(String line){
        String number = line.replaceAll("[^0-9]+", " ");
        return Integer.parseInt(number.replaceAll(" ", ""));
    }
}
