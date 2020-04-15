package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.contract.Reader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoresFile implements Reader {

    @Override
    public Iterable<String> read(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        List<String> scores = new ArrayList<>();
        while(scanner.hasNextLine()){
            scores.add(scanner.nextLine());
        }
        return scores;
    }
}
