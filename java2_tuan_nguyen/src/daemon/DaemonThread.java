package daemon;

import java.text.DecimalFormat;

public class DaemonThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            System.out.println("Daemon Thread" + count++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
