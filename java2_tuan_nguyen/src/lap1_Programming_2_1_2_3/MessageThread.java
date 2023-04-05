package lap1_Programming_2_1_2_3;
class MessageThread extends Thread {
    private String message;
    private int timeout;
    private int priority;

    public MessageThread(String message, int timeout, int priority) {
        this.message = message;
        this.timeout = timeout;
        this.priority = priority;
        setPriority(priority);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(message);
                Thread.sleep(timeout);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Multithreading", 1000, Thread.MAX_PRIORITY);
        MessageThread thread2 = new MessageThread("Multitasking", 2000, Thread.NORM_PRIORITY);
        thread1.start();
        thread2.start();

    }
}