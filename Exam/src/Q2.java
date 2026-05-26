/*
用Java语言编写程序。程序功能：设计一个描述手机基本信息的类，具体要求如下：（20分，程序文件名：BXXXX.java）
（1）该类用来描述手机信息包括：编号（id）、品牌（brand）、型号（type）、价格（price），其中编号为4位数字采用int类型（1000～9999）、型号和品牌采用String类型、价格采用float类型。所有成员变量均为私有。
（2）设计一个无参数的构造方法，当调用它时，String型的成员变量初始化为空串，各数值型的成员变量初始化为-1。
（3）设计一个带4个参数的构造方法，当调用它时，用这4个参数初始化该对象的各成员变量。
（4）重写toString()方法，使其返回手机对象的基本信息。如有一部手机的编号：6601、品牌：华为、型号：mate60、价格：6988元，返回其基本信息的格式为：（6601_华为_mate60_6988.0）。
（5）在main方法中举例测试带4个参数的构造方法和重写后的toString()方法。
 */
public class Q2 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone(2024,"Xiaomi","17Ultra",6999);
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Phone {
    private int id;
    private String brand;
    private  String Type;
    private  float price;

    public Phone(){
        this.price = -1;
        this.id = -1;
        this.brand = "";
        this.Type = "";
    }
    public Phone(int id,String brand,String Type,float price){
        this.id = id;
        this.brand = brand;
        this.Type = Type;
        this.price = price;
    }
    @Override
    public String toString(){
        return "(" + id + "_" + brand + "_" + Type + "_" + price +")";
    }
}