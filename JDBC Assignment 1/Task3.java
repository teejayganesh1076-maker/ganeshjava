import java.sql.*;

public class Task3 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newDB";
    static final String USER = "root";
    static final String PASS = "2003";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            String sql = "UPDATE employee SET salary = ? WHERE department = ?";

            pstmt = con.prepareStatement(sql);

            pstmt.setDouble(1, 75000);       // new salary
            pstmt.setString(2, "IT");        // department name

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Salary updated successfully for department IT!");
            } else {
                System.out.println("No employees found in department IT.");
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
