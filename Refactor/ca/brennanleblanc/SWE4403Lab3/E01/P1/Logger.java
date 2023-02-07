package ca.brennanleblanc.SWE4403Lab3.E01.P1;

public class Logger {
    private String fileName;
    
    public Logger(String fileName) {
        this.fileName = fileName;
    }
    
    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
