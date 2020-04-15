package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.contract.OnReceiveScores;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ScoreFile implements OnReceiveScores {
    @Override
    public Iterable<String> gatherData(String filePath) throws IOException {
        List<String> scores = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(filePath), Charset.defaultCharset())) {
            lines.forEachOrdered(line -> scores.add(line));
        }
        return scores;
    }
}
