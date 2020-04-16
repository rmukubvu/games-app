package com.spandigital.assessment.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {

    public static int numberFromAlphanumeric(String line){
        return Integer.parseInt(getValue(line,"[0-9]").trim());
    }

    public static String stringFromAlphanumeric(String line){
        return getValue(line,"[^0-9]").trim();
    }

    private static String getValue(String input,String regex){
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        while(m.find()){
            sb.append(m.group());
        }
        return sb.toString();
    }
}
