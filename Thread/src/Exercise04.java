//使用sleep()
public class Exercise04 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程：" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Exercise04 t1 = new Exercise04();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程：" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}





