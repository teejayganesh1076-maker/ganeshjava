import java.sql.*;

public class Task2 {
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
            cs = con.prepareCall("{ call add_employee(?, ?, ?, ?) }");

            // 3. Set parameters
            cs.setInt(1, 201);              // employee id
            cs.setString(2, "Ali");         // employee name
            cs.setString(3, "HR");          // department
            cs.setDouble(4, 55000.0);       // salary

            // 4. Execute
            int rows = cs.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee record inserted successfully via stored procedure!");
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

