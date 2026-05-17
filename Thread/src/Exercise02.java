//子线程打印A，主线程打印B，观察输出顺序
public class Exercise02 extends Thread{
    @Override
    public void run(){
        System.out.println("子线程：" + "A");
    }

    public static void main(String[] args) {
        Exercise02 t1 = new Exercise02();
        t1.start();
        System.out.println("主线程：" + "B");

    }
}
