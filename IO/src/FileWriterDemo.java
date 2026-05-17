import java.io.FileWriter;
public class FileWriterDemo {
    public static void main(String[] args)
    throws Exception{
        FileWriter fw = new FileWriter("b.txt");
        fw.write("This is a test for FileWriter"+"\n"+"My name is Arthur"+"\n");
        fw.write("Test for append"+"\n");
        fw.write("666");
        fw.close();
    }
}
