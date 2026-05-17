import java.io.FileWriter;
//向文件中写入文本
public class Exercise01 {
    public static void main(String[] args)
    throws  Exception{
        FileWriter fw = new FileWriter("c.txt");
        fw.write("This is Exercise01 for FileWriter.");
        fw.close();
    }
}
