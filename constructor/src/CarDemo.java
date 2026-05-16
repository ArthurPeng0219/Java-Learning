public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Xiaomi Su7");
        Car car3 = new Car("Xiaomi SU7",228000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
 class Car{
    private String brand;
    private float price;
    //无参构造
    public Car(){
        this.brand = "";
        this.price =-1;
    }
    //一个参数构造
    public Car(String brand){
        this.brand=brand;
    }
    //两个参数构造
    public Car(String brand,float price){
        this.brand = brand;
        this.price = price;
    }
    @Override
     public String toString(){
        return "品牌：" + brand + " " + "价格：" + price;
    }
}