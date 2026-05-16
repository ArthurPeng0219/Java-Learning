public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("张三", 18);
        System.out.println(s1);
        System.out.println(s2);
    }
}

class Student {
    private String name;
    private int age;
    //无参构造
    public Student() {
        this.name = "";
        this.age = 0;
    }
    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "(" + name + "," + age + ")";
    }
}