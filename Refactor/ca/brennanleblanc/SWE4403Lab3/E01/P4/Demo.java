package ca.brennanleblanc.SWE4403Lab3.E01.P4;

public class Demo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadFile1());
        Thread thread2 = new Thread(new ThreadFile1());
        thread1.start();
        thread2.start();
    }

    static class ThreadFile1 implements Runnable {
        @Override
        public void run() {
            Logger logger = Logger.getInstance("file1.txt");
            logger.write("");
        }
    }
}
