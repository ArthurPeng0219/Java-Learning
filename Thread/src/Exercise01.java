//创建一个线程打印1-10
public class Exercise01 extends Thread{
   @Override
    public void run(){
       for(int i = 1; i <= 10; i++){
           System.out.println(i);
       }
   }

    public static void main(String[] args) {
        Exercise01 t1 = new Exercise01();
        t1.start();
    }
}
