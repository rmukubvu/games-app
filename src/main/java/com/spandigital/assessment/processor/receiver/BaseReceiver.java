package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.model.InvalidCommandException;
import com.spandigital.assessment.model.ScoresInput;

import java.io.*;

public class BaseReceiver {

    public Iterable<String> processInput(String[] args) throws InvalidCommandException, FileNotFoundException {
        String key;
        if (args.length == 0) {
            key = ScoresInput.STDIN.value();
        } else if (args.length == 2) {
            key = ScoresInput.FILE.value();
        } else {
            throw new InvalidCommandException("Invalid input");
        }
        InputStream in = getStream(key, args);
        return new InputFactory(key).processInput(in);
    }

    private InputStream getStream(String key,String[] args) throws FileNotFoundException {
        if (key.equalsIgnoreCase(ScoresInput.STDIN.value())) {
            return System.in;
        }
        //filepath is at args[1] @ args[0] is -f
        return new FileInputStream(new File(args[1]));
    }

}
