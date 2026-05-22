import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo02 {

    public static void main(String[] args)
            throws Exception {

        // 1. 加载驱动
        Class.forName(
                "com.mysql.cj.jdbc.Driver"
        );

        // 2. 连接数据库
        Connection conn =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test",
                        "root",
                        "arthur"
                );

        // 3. 创建SQL执行对象
        Statement stmt =
                conn.createStatement();

        // 4. SQL语句
        String sql =
                "INSERT INTO student VALUES(7,'Mike',18)";

        // 执行SQL
        stmt.executeUpdate(sql);

        System.out.println("插入成功");

        // 5. 关闭资源
        stmt.close();
        conn.close();
    }
}