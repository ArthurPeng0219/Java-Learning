import java.io.FileReader;
import java.io.FileWriter;

//读取文件，统计大写字母个数
public class Exercise06 {
    public static void main(String[] args)
    throws Exception{
        FileWriter fw = new FileWriter("data.txt");
        fw.write("HelloJAVA123");
        fw.close();
        FileReader fr = new FileReader("data.txt");
        int ch;
        int upperCount = 0;
        int digitCount = 0;
        while ((ch = fr.read()) != -1){
            if(Character.isUpperCase((char) ch))
                upperCount ++;
            else if (Character.isDigit((char) ch)) {
                digitCount ++;
            }

        }
        fr.close();
        System.out.println("大写字母个数：" + upperCount);
        System.out.println("数字：" + digitCount);

    }

}
