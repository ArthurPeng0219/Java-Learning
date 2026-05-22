import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo01 {

    public static void main(String[] args)
            throws Exception {

        // 1. 注册驱动
        Class.forName(
                "com.mysql.cj.jdbc.Driver"
        );

        // 2. 获取连接
        Connection conn =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test",
                        "root",
                        "arthur"
                );

        // 3. 创建Statement对象
        Statement stmt =
                conn.createStatement();

        // 4. 执行SQL
        String sql =
                "INSERT INTO student VALUES(6,'Luna',19)";

        stmt.executeUpdate(sql);

        System.out.println("插入成功");

        // 5. 关闭资源
        stmt.close();
        conn.close();
    }
}