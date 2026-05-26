import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
首先，在本机MySql数据库服务器上创建数据库（名称：mystore）和表（名称：products）。建表SQL语句如下：
CREATE TABLE IF NOT EXISTS `products` (
 `id` int NOT NULL,
 `category` varchar(50) NOT NULL,
 `type` varchar(50) NOT NULL,
 `brand` varchar(20) DEFAULT NULL,
 `price` double DEFAULT NULL  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
然后，利用JDBC编程实现：
（1）向products表中插入4条记录，内容如下表所示。
id	category	type	brand	price
1001	手机	Mate 60	华为	6999.00
1002	手机	14pro	小米	5499.00
2001	笔记本电脑	ThinkBook 14 2023	ThinkPad	4599.00
2002	笔记本电脑	MateBook D 16	华为	4499
（2）使用SQL语句找出products表中价格（price）超过5000的商品，并在控制台输出这些商品的所有信息（一物一行，其他格式不限）。

 */
public class Q6 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mystore",
                "root",
                "arthur"
        );
        Statement statement = coon.createStatement();
        String sql = "INSERT INTO products VALUES(1001,'手机', 'Mate 60','华为', 6999)";
        String sql1 =  "INSERT INTO products VALUES(1002,'手机','14pro','小米',5499)";
        String sql2 = "INSERT INTO products VALUES(2001,'笔记本电脑','ThinkBook 14 2023','ThinkPad',4599)";
        String sql3 = "INSERT INTO products VALUES(2002,'笔记本电脑','MateBook D 16','华为',4499)";
        statement.executeUpdate(sql);
        statement.executeUpdate(sql1);
        statement.executeUpdate(sql2);
        statement.executeUpdate(sql3);
        String sql4 = "SELECT * FROM products WHERE price >= 5000";
        ResultSet rs = statement.executeQuery(sql4);  // 查询只能用这个！
        while (rs.next()){
            System.out.println(rs.getInt("id") + "\n");
            System.out.println(rs.getString("category")  + "\n");
            System.out.println(rs.getString("type") + "\n");
            System.out.println(rs.getString("brand") + "\n");
            System.out.println(rs.getDouble("price"));
        }
        coon.close();
        statement.close();
        System.out.println("数据更新成功！");
    }
}
