import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*
利用ArrayList或LinkedList或HashSet编程实现：已知集合A={"物联网系","智科系","计算机系","软件系"}，要求如下：（10分，程序文件名：EXXXX.java）
（1）初始化集合A；
（2）请将"基础系"添加到集合A的第三个位置（"计算机系"之前）；
（3）请将集合A中的"基础系"修改为"办公室"；
（4） 将修改后的结果输出到文本文件E:\testfile.txt，每个元素占一行。
 */
public class Q5 {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("物联网系");
        List.add("智科系");
        List.add("计算机系");
        List.add("软件系");
        List.add(2,"基础系");
        List.set(2,"办公室");

        try {
            FileWriter fw = new FileWriter("textfile.txt",true);
            for (int i = 0; i < List.size(); i++ ){
                fw.write(List.get(i) + "\n");
            }
            fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
