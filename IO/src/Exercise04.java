import java.io.FileReader;
//读取文件输出到控制台
public class Exercise04 {
    public static void main(String[] args)
            throws Exception {
        FileReader fr = new FileReader("a.txt");
        int c;
        while ((c = fr.read())!=-1 ){
            System.out.println((char) c);
            fr.close();
        }
    }
}
