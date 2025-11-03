package week1;

import java.sql.*;

public class Day14JdbcUtilsTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement  st   = null;
        ResultSet  rs   = null;

        try {
            conn = JdbcUtils.getConnection();
            st   = conn.createStatement();
            rs   = st.executeQuery("SELECT COUNT(*) FROM tb_student");

            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("tb_student 表当前共有 " + count + " 条记录");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeQuietly(conn, st, rs); // 一键关闭
        }
    }
}
