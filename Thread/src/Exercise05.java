//使用Runnable打印数字
class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("子线程：" + i);
        }
    }
}
public class Exercise05 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        for(int i = 1; i <= 10; i++){
            System.out.println(
                    "主线程：" +i
            );
        }
    }
}