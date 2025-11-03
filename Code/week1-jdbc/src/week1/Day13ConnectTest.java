package week1;

import java.sql.*;

public class Day13ConnectTest {
    // ① 把密码改成你安装时设置的
    private static final String URL      = "jdbc:mysql://localhost:3306/studentdb?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static final String USER     = "root";
    private static final String PASSWORD = "Yzc368369";

    public static void main(String[] args) {
        // ② try-with-resources 自动关流
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st  = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT VERSION()")) {

            if (rs.next()) {
                System.out.println("MySQL 版本：" + rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
