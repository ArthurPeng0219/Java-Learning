//同时实现Flyable和Swimable
interface Swimable{
    void swim();
}

class Pet implements Flyable,Swimable{
    @Override
    public void fly(){
        System.out.println("This pet can fly!");
    }

    @Override
    public void swim() {
        System.out.println("This pet can swim！");
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.fly();
        pet.swim();
    }
}