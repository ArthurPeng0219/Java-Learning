public class ExerciseExam02 {
    public static void main(String[] args) {
        MyRunnable03 mr01 = new MyRunnable03();
        MyRunnable04 mr02 = new MyRunnable04();
        Thread t1 = new Thread(mr01);
        Thread t2 = new Thread(mr02);
        t1.start();
        t2.start();
    }
}
class MyRunnable03 implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println("数字线程：" + i);
            try {
            Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable04 implements Runnable{
    @Override
    public void run(){
        for(char c = 'A'; c <= 'J'; c++){
            System.out.println("字母线程：" + c);
            try{
                Thread.sleep(800);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}