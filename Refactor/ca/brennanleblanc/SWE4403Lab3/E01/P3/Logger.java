package ca.brennanleblanc.SWE4403Lab3.E01.P3;

import java.util.HashMap;
import java.util.Map;

public final class Logger {
    private static Map<String, Logger> loggers = new HashMap<String,Logger>() {};
    private String fileName;

    private Logger(String fileName) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }

    public static Logger getInstance(String value) {
        if (!loggers.containsKey(value)) {
            loggers.put(value, new Logger(value));
        }
        return loggers.get(value);
    }
}
