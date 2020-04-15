package com.spandigital.assessment.contract;

import java.io.IOException;

public interface OnReceiveScores {
    Iterable<String> gatherData(String filePath) throws IOException;
}
