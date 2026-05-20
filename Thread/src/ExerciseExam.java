/*
用Java语言编写一个简单的多线程程序，程序功能：除了主线程外创建并启动2个线程，
其中一个线程向控制台输出大写字母序列（K、J、I、……、A），时间间隔0.3秒；
另一个线程向控制台输出小写字母序列（k、j、i、……、a），时间间隔0.6秒。
 */
public class ExerciseExam {
    public static void main(String[] args) {
        MyRunnable01 mr1 = new MyRunnable01();
        MyRunnable02 mr2 = new MyRunnable02();
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        t1.start();
        t2.start();

    }

}
 class MyRunnable01 implements Runnable{
    @Override
     public void run(){
        for(char c = 'K'; c >= 'A'; c--){
            System.out.println("大写字母线程：" + (char) c);
            try{
                Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
class MyRunnable02 implements Runnable{
    @Override
    public void run(){
        for(char c='k'; c >= 'a'; c--){
            System.out.println("小写字母线程：" + (char) c);
            try {
                Thread.sleep(600);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}