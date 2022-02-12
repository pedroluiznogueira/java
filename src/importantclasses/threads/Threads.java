package importantclasses.threads;

public class Threads {

    // threads allows a program to operate more efficiently by doing multiple things at the same time
    // threads can be used to perform complicated tasks in the background without interrupting the main program
    // the class that extends Thread can't extend other classes, while the one that implements can
    // to avoid concurrency problems you can use isAlive() method of Thread class
    public static void main(String[] args) {
        // running threads with a class that extends
        FirstThread firstThread = new FirstThread();
        firstThread.start();
        System.out.println("This code is running outside of the FirstThread class, thread");

        // running threads with a class that implements
        SecondThread secondThread = new SecondThread();
        Thread thread = new Thread(secondThread);
        thread.start();
        System.out.println("This code is running outside of the SecondThread class, thread");

        // handling concurrency
        ThirdThread thirdThread = new ThirdThread();
        thirdThread.start();

        while(thirdThread.isAlive()) {
            System.out.println("Waiting...");
            System.out.println(thirdThread.amount);
        }

        if (!thirdThread.isAlive()) {
            System.out.println("finished");
            System.out.println(thirdThread.amount);
            thirdThread.amount++;
            System.out.println("This code is running outside of the ThirdThread class, thread");
            System.out.println(thirdThread.amount);
        }

    }

}

class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("This code is running in a FirstThread class, thread");
    }
}

class SecondThread implements Runnable {

    @Override
    public void run() {
        System.out.println("This code is running in a SecondThread class, thread");
    }
}

class ThirdThread extends Thread {
    public static int amount = 0;

    @Override
    public void run() {
        System.out.println("This code is running in a ThirdThread class, thread");
        amount++;
    }
}
