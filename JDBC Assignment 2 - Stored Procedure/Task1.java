import java.sql.*;

public class Task1 {
    static final String DB_URL = "jdbc:mysql://localhost:3306/newDB";
    static final String USER = "root";
    static final String PASS = "2003";

    public static void main(String[] args) {
        Connection con = null;
        CallableStatement cs = null;

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            cs = con.prepareCall("{ call insert_student(?, ?, ?) }");

            cs.setInt(1, 101);             // id
            cs.setString(2, "Mohammed");   // name
            cs.setInt(3, 85);              // marks

            int rows = cs.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record inserted successfully via stored procedure!");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

            try {
                if (cs != null) cs.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

