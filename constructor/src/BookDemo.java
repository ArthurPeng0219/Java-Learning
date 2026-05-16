public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(202401,"大数据技术",39);
        System.out.println(book1);
        System.out.println(book2);
    }
}
class Book{
    private int id;
    private String name;
    private float price;
    //无参构造
    public Book(){
        this.id = -1;
        this.name = "";
        this.price = -1;
    }
    //有参构造
    public Book(int id,String name,float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "(" + id + "_" + name + "_" + price + "_" + ")";
    }
}
