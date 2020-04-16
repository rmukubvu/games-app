package com.spandigital.assessment.contract;

import com.spandigital.assessment.model.Team;

public interface ExtractScores {
    Iterable<Team> getScoresPerLine(Iterable<String> scores);
    void sortLogTable(Iterable<Team> teams);
}
