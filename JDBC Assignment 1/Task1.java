import java.sql.*;

public class Task1 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newDB";
    static final String USER = "root";
    static final String PASS = "2003";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";

            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Mohammed");
            pstmt.setInt(3, 85);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record inserted successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
