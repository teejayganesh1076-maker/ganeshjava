import java.sql.*;

public class Task4 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newDB";
    static final String USER = "root";
    static final String PASS = "2003";

    public static void main(String[] args) {
        Connection con = null;
        CallableStatement cs = null;

        try {
            // 1. Connect to database
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            // 2. Prepare call to stored procedure
            cs = con.prepareCall("{ call update_student_marks(?, ?) }");

            // 3. Set input parameters
            cs.setInt(1, 101);   // student ID
            cs.setInt(2, 95);    // new marks

            // 4. Execute
            int rows = cs.executeUpdate();

            if (rows > 0) {
                System.out.println("Marks updated successfully for student ID " + 101);
            } else {
                System.out.println("No student found with ID " + 101);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // 5. Close resources
            try {
                if (cs != null) cs.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

