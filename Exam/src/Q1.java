/*
用Java语言编写程序，程序功能：从键盘输入一个正整数n（n≥3），
计算表达式 4×(1+13+15+…+12n−1) 的值并将其结果输出到控制台。
如果输入的n小于3，屏幕输出提示信息“输入的n值必须大于或者等于3！”。
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于3的正整数：");
        int n = sc.nextInt();
        double sum = 0;
        double result = 0;
        if(n>=3){
            for(int i= 1; i<=2*n-1; i++){
                sum +=1.0/i;
            }
            System.out.println("结果：" + 4*sum);
        }else System.out.println("输入的n值必须大于或者等于3！");
    }
}
