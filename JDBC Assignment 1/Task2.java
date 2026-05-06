import java.sql.*;

public class Task2 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newDB";
    static final String USER = "root";
    static final String PASS = "2003";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "UPDATE student SET marks = ? WHERE id = ?";

            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 95);   // new marks
            pstmt.setInt(2, 101);  // student ID

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Marks updated successfully for student ID " + 101);
            } else {
                System.out.println("No student found with ID " + 101);
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

