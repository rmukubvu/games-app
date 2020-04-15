package com.spandigital.assessment;

import com.spandigital.assessment.helper.Commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {
        //The input and output will be text. Either using stdin/stdout
        //or taking filenames on the command
        //line is fine
        //check if there is any argument on the cli
        if (args.length >= 1) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }else{
            //use stdin
            //format the message to info person how it should be structuredls
            /*Scanner scanner = new Scanner(System.in);
            String input;
            List<String> scores = new ArrayList<>();
            System.out.print("Enter score line ( q or Q to quit ) : ");
            //quit loop if input is a q irrespective of the case
            while((input = scanner.nextLine()).compareToIgnoreCase("q") != 0){
                System.out.print("Enter score line ( q or Q to quit ) : ");
                scores.add(input);
            }
            System.out.println(scores.size());
            */

            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.print("Please enter your name : ");
                String name;
                while((name = br.readLine()).compareToIgnoreCase("q") != 0) {
                    System.out.print("Please enter your name : ");
                }
            }
        }
    }
}
