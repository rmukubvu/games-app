package com.spandigital.assessment.processor.receiver;

import com.spandigital.assessment.model.InvalidCommandException;
import org.junit.Test;

import java.io.FileNotFoundException;


public class BaseReceiverTest {

    private BaseReceiver baseReceiver = new BaseReceiver();

    @Test(expected = InvalidCommandException.class )
    public void processInput_should_throw_invalid_input() throws InvalidCommandException , FileNotFoundException {
        String[] args = new String[]{"-f"};
        baseReceiver.processInput(args);
    }

}
