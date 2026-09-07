package jdbc;

import java.sql.*;   //import JDBC classes

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/dbs";
        String username = "postgres";
        String password = System.getenv("DB_PASSWORD");
        try {
            // establishing Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Congratulations! Connection established successfully!");
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}
