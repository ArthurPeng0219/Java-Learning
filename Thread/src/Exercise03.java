//两个线程同时打印数字
public class Exercise03 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("子线程：" + i);
        }
    }

    public static void main(String[] args) {
        Exercise03 t1 = new Exercise03();
        t1.start();
        for (int i =0; i < 10; i++){
            System.out.println("主线程：" + i);
        }
    }
}
