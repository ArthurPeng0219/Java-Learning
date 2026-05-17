public class Test{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for(int i = 1; i<=5; i++){
            System.out.println(
                    "主线程" + i);
        }
    }

}
