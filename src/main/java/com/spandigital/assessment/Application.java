package com.spandigital.assessment;

import com.spandigital.assessment.helper.Commands;
import com.spandigital.assessment.model.InvalidCommandException;
import com.spandigital.assessment.processor.receiver.BaseReceiver;

import java.io.FileNotFoundException;


public class Application {

    public static void main(String[] args)  {

        try{
            BaseReceiver baseReceiver = new BaseReceiver();
            Iterable<String> result = baseReceiver.processInput(args);
        }catch (InvalidCommandException | FileNotFoundException ice){
            //display the commands
            Commands.showAll();
            //show the error
            System.out.print(ice.getMessage());
        }

    }
}
