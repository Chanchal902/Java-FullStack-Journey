package jdbc;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/s_details";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");
        try {
            //establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Congratulations! Connection established successfully!");

            //create PreparedStatement + set parameters placeholder
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student(s_id , name , roll , age) VALUES(? , ? ,? ,?)");

            //set parameter values
            pstmt.setInt(1, 5);
            pstmt.setString(2, "AYUSHI JHA");
            pstmt.setInt(3, 10);
            pstmt.setInt(4, 32);

            //execute INSERT
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("row inserted = " + rowsAffected);

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database Operations Failed!");
            e.printStackTrace();
        }
    }
}
