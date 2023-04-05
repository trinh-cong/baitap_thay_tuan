package daemon;

public class NoneDaemon extends Thread {
    @Override
    public void run() {

            int i =0;
            while (i < 10) {
                System.out.println("None Deamon Thread"+i++);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        System.out.println("\n None Daemon Stopped");
        }
    }
