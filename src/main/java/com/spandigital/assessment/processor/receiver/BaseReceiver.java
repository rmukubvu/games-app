package com.spandigital.assessment.processor.receiver;

public class BaseReceiver {
    
    private static final String FILE = "file";
    private static final String STDIN = "stdin";

    public void processInput(String[] args){
        //determine if file path was provided
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
    }
}
