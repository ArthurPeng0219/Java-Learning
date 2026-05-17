public class Product {
    private String name;
    private double price;
    private int stock;
    public Product(){
        this.name = " ";
        this.price = -1;
        this.stock = -1;
    }
    //构造方法
    public Product(String name,double price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return  this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    //设计折扣
    public void setDiscount(double discount){
        this.price *= discount;
    }
    @Override
    public String toString(){
        return "商品：" + name + " " + "价格为：" + price + " " + "库存为：" + stock;
    }
    public static void main(String[] args) {
        Product p1 = new Product("可乐",3.0,200);
        System.out.println(p1);
        p1.setName("雪碧");
        p1.setPrice(3.0);
        p1.setDiscount(0.9);
        System.out.println(p1);
        Product p2 = new Product();
        p2.setName("绿茶");
        p2.setPrice(3);
        p2.setStock(50);
        System.out.println(p2);
    }

}