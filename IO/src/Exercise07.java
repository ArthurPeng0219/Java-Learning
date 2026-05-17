import java.io.FileReader;
import java.io.FileWriter;

//统计小写字母、大写字母、空格、数字、单词个数
public class Exercise07 {
    public static void main(String[] args)
            throws Exception{
        FileWriter fw = new FileWriter("article2.txt");
        fw.write("Hello Java 2026 Welcome To CQUST");
        fw.close();
        FileReader fr = new FileReader("article2.txt");
        int ch;
        int lowerCount = 0;
        int spaceCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int wordCount =0;
        char prev= ' ';
        int index = 0;
        while ((ch = fr.read()) != -1){

            if(Character.isLowerCase((char) ch))
                lowerCount ++;
            if(Character.isSpaceChar((char) ch))
                spaceCount ++;
            if(Character.isUpperCase((char) ch))
                upperCount ++;
            if (Character.isDigit((char) ch))
                digitCount ++;
            char current = (char) ch;
            if (Character.isLetter(current) && ( index==0 || !Character.isLetter(prev)))
                wordCount ++;
            prev = current;
            index ++;
        }
        fr.close();
        System.out.println("小写字母的个数：" + lowerCount);
        System.out.println("大写字母的个数：" + upperCount);
        System.out.println("空格的个数：" + spaceCount);
        System.out.println("数字的个数："+ digitCount);
        System.out.println("单词的个数：" + wordCount);


    }
}