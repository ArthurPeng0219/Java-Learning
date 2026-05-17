import java.io.FileWriter;
//练习追加模式
public class Exercise03 {
    public static void main(String[] args)
    throws Exception{
        FileWriter fw = new FileWriter("d.txt",true);
        fw.write("Java");
        fw.write("\n");
        fw.write("Python");
        fw.close();

    }
}
