package lap1_Programming_2_1_2;

public class MyThread implements Runnable{
    String threadName;
    Thread t;
    int count;
    MyThread(String name, int num) {
        threadName = name;
        count = num;
        t = new Thread(this, threadName);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for(int i = count; i >= 1; i--) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " exiting.");
    }
}

class Main {
    public static void main(String args[]) {
        MyThread t1 = new MyThread("First", 5);
        MyThread t2 = new MyThread("Second", 5);
        MyThread t3 = new MyThread("third", 5);

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting:");
    }
}


