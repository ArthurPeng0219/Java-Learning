//用bird实现fly
interface Flyable{
    void fly();
}

class Bird implements Flyable{
    @Override
           public void fly(){
        System.out.println("The bird can fly");
    }

    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
    }

}