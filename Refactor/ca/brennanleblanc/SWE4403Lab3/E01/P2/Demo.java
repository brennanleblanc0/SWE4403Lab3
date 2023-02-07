package ca.brennanleblanc.SWE4403Lab3.E01.P2;

public class Demo {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        Logger logger1 = Logger.getInstance(file1);
        Logger logger2 = Logger.getInstance(file1);

        System.out.print("You can create multiple loggers writing to the same log file concurrently: ");
        System.out.println(logger1 != logger2);

        String file2 = "file2.txt";
        Logger logger3 = Logger.getInstance(file2);

        System.out.print("You can create multiple loggers writing to different log files: ");
        System.out.println(logger1 != logger3);
    }
}
