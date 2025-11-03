package week1;

import java.sql.*;

public class JdbcUtils {
    private static final String URL      = "jdbc:mysql://localhost:3306/studentdb?serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static final String USER     = "root";
    private static final String PASSWORD = "Yzc368369";   // 改成你的密码

    /* 驱动只注册一次 */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* 获取连接 */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    /* 安静关闭：无论是否 null 都不抛异常 */
    public static void closeQuietly(Connection conn, Statement st, ResultSet rs) {
        try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
        try { if (st != null) st.close(); } catch (SQLException ignored) {}
        try { if (conn != null) conn.close(); } catch (SQLException ignored) {}
    }
}
