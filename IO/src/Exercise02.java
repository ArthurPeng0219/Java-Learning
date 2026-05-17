import java.io.FileWriter;
//练习换行
public class Exercise02 {
    public static void main(String[] args)
    throws Exception{
        FileWriter fw = new FileWriter("student.txt");
        fw.write("张三" + "\n" + "李四" + "\n" +"王五");
        fw.close();
    }
}
