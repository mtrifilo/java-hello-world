package demotest;

public class MultiThread implements Runnable {
    public static void main(String[] args) {
        Thread Thread1 = new Thread();
        Thread1.start();

        Thread Thread2 = new Thread();
        Thread2.start();
    }

    @Override
    public void run() {
        // TODO
    }
}


