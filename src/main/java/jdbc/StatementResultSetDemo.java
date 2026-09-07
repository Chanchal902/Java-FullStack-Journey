package jdbc;

import java.sql.*;

public class StatementResultSetDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/s_details";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");
        try {
            // establish a connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Congratulations! Connection established Successfully!");

            //create statement
            Statement stmt = con.createStatement();
            //execute statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("name:" + name + " , " + " age: " + age);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Database Operation Failed!");
            e.printStackTrace();
        }
    }

}