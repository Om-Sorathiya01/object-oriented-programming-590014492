package lab6;

class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 finished");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 started");
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2 finished");
    }
}

public class multithred {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
        
        System.out.println("Main thread finished");
    }
}
