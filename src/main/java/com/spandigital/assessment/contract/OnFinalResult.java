package com.spandigital.assessment.contract;

import com.spandigital.assessment.model.Team;

public interface OnFinalResult {
    Iterable<Team> calculateScore(String scoreLine);
    void sortLogTable();
}
