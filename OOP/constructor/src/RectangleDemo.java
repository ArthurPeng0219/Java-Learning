public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("r2的面积：" + r2.getArea());
        System.out.println("r2的周长：" + r2.getPerimeter());
    }
}
class Rectangle{
    private double width;
    private double height;
    //无参构造
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    //有参构造
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    //面积
    public double getArea(){
        return height * width;
    }
    //周长
    public double getPerimeter(){
        return 2* (height + width);
    }
    @Override
    public String toString(){
        return "("
                + width +","
                + height + ")";
    }
}