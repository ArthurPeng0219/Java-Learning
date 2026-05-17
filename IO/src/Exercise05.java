import java.io.FileReader;
import java.io.FileWriter;
//读取文件，统计文件中字符的个数
public class Exercise05 {
    public static void main(String[] args)
    throws Exception{
        FileWriter fw = new FileWriter("article.txt");
        fw.write("This is a text for FileWriter");
        fw.close();
        FileReader fr = new FileReader("article.txt");
        int c;
        int count =0;
        while ((c = fr.read()) != -1){
            count++;
        }
        fr.close();
        System.out.println("字符个数：" + count);
    }
}
