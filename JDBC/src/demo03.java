import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo3 {
    public static void main(String[] args) throws Exception{
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //连接数据库
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/school",
                "root",
                "arthur"
        );
        //创建SQL执行对象
        Statement stmt = conn.createStatement();
        //SQL语句
        String sql = "INSERT INTO student VALUES(1,'TOM',18)";

        //执行SQL
        stmt.executeUpdate(sql);
        System.out.println("插入成功");
        stmt.close();
        conn.close();
    }
}
