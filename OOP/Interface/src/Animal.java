//定义Animal接口，用Dog实现接口
interface Animal {
    void eat();
}
class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("The dog is eating!");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
    }
}

