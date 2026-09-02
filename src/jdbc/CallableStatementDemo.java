package jdbc;

import java.sql.*;

public class CallableStatementDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");
        try {
            //create connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Congratulations! Connection established successfully!");

            //call procedure
            String sql_string = "call structure(? , ? , ?)";

            //create statement
            CallableStatement cstmt = con.prepareCall(sql_string);

            // set parameter placeholder
            cstmt.setInt(1, 101);
            cstmt.setString(2, "Harshh");
            cstmt.setString(3, "Bhagalpur");
            cstmt.execute();
            cstmt.setInt(1, 102);
            cstmt.setString(2, "Chanchal Don");
            cstmt.setString(3, "Sabour");
            cstmt.execute();
            System.out.println("rows inserted successfully!");
            cstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Database operations Failed!");
            e.printStackTrace();
        }
    }
}
