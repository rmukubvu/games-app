package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.contract.OnReceiveScores;

import java.io.IOException;
import java.util.Hashtable;

public class ProcessorFactory {

    private static Hashtable<String, OnReceiveScores> processorTable = new Hashtable<>();
    private static final String FILE = "file";
    private static final String STDIN = "stdin";

    static {
        processorTable.put(FILE,new ScoreFile());
        processorTable.put(STDIN,new StandardInput());
    }

    public Iterable<String> processInput(String[] args) throws IOException {
        String filePath = "";
        String key = STDIN;
        //check if args[0] is -f
        //check args[1] should be a file
        //on error display commands should bubble up to main
        if (args.length >= 1  ) {
            if (args[0].compareToIgnoreCase("-f") == 0){
                //get file name
                filePath = args[1];
                key = FILE;
            }
        }
        return processorTable.get(key).gatherData(filePath);
    }
}
