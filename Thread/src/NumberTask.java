//两个线程共享同一个Runnable对象
public class NumberTask implements Runnable {
    @Override
    public void run(){
        for(int i = 1 ; i <=10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        Runnable mr = new NumberTask();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.start();
        t2.start();
    }
}
