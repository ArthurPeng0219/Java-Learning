import java.io.FileWriter;

public class Test {

    public static void main(String[] args)
            throws Exception {

        FileWriter fw =
                new FileWriter("a.txt");

        fw.write("Hello Java");

        fw.close();
    }
}