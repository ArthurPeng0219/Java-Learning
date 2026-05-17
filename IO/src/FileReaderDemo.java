import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args)
    throws Exception{
        FileReader fr = new FileReader("a.txt");
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char) ch);
        }
        fr.close();
    }
}
