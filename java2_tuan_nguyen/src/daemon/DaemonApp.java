package daemon;

public class DaemonApp {
    public static void main(String[] args) {
        System.out.println("===> Main theard running");
    // tao 1 thread
        Thread daemonThread=new DaemonThread();
        Thread noneDaemon=new DaemonThread();
//        Set laf daemon Thread;
        daemonThread.setDaemon(true);
        daemonThread.start();

//        tao 1 luong khac
        new NoneDaemon().start();
        try {
            Thread.sleep(5000);
        }
        catch ( InterruptedException e){
            e.printStackTrace();

        }
        System.out.println("Main Thread ending");
//        check coi luong con  chay khong
        System.out.println("check Daemon Thread:\t"+daemonThread.isAlive());
        System.out.println("Check none Thread:\t"+noneDaemon.isAlive());
//        daemon có độ yêu tieen thấp hơn các luồng khác để khi các luồng khác dừng thì daemon vẫn chạy để thu hồi tài nguyên

    }
}
