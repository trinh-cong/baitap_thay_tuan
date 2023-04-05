package lap1_Programming_2_1_1;
/*
 Create a Thread named MyThread (by extending from the class Thread or by implementing the interface Runnable) does these tasks:
- Display name of the current thread.
- Rename the created thread to myJavaThread and display this name.
- Overwrite the method run() by displaying the first 10 even numbers. Delay time between each display time is 1500 ms.


* */
public class MyThread1 extends Thread{
    public void run() {
        System.out.println("Current thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("myJavaThread");
        System.out.println("Thread renamed to: " + Thread.currentThread().getName());
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main1 {
    public static void main(String args[]) {
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}


