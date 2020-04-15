package com.spandigital.assessment.helper;

import java.util.Hashtable;
import java.util.Map;

public class Commands {

    private static Hashtable<String, String> commandsMap = new Hashtable<String, String>();

    static {
        commandsMap.put("help", "type -f [path of file]");
        commandsMap.put("file", "-f <path of the file>");
    }

    public static String getCommand(String key) {
        if (commandsMap.containsKey(key)) {
            return commandsMap.get(key);
        }
        return showAll();
    }
    
    public static String showAll(){
        StringBuilder builder = new StringBuilder();
        builder.append("Usage:\n");
        builder.append("\tjava -jar games-app-1.0-SNAPSHOT.jar");
        builder.append("\n\tjava -jar games-app-1.0-SNAPSHOT.jar -f <path of file>");
        builder.append("\n\nCommands:\n");
        for (Map.Entry<String,String> entry : commandsMap.entrySet()
             ) {
            builder.append(String.format("\t%s \t %s\n",entry.getKey(),entry.getValue()));
        }
        return builder.toString();
    }
}
