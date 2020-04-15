package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.contract.OnReceiveScores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardInput implements OnReceiveScores {
    @Override
    public Iterable<String> gatherData(String filePath) throws IOException {

        showExample();

        String input;
        List<String> scores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //quit loop if input is a q irrespective of the case
        while((input = scanner.next()).compareToIgnoreCase("q") != 0){
            System.out.print("Enter score line ( q or Q to quit ) : ");
            scores.add(input);
        }
        return scores;
    }

    private void showExample(){
        System.out.print("Input   format: TeamA Score , TeamB Score\n");
        System.out.print("Example format: Kaizer Chiefs  3 , Mamelodi Sundowns 5\n");
        System.out.print("Type q to quit\n");
    }
}
