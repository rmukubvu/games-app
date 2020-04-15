package com.spandigital.assessment.contract;

import com.spandigital.assessment.model.Team;

public interface OnComputeResult {
    Iterable<Team> processScores(Iterable<String> scores);
}
