public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财","黄色");
        System.out.println(dog);
    }
}
class Dog{
    private String name;
    private String color;
    Dog(String name,String color){
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString(){
        return "(" + name + "," + color +")";
    }
}
