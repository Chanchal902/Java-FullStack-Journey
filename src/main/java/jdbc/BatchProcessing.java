package jdbc;

import java.sql.*;

public class BatchProcessing {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/batch_processing";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection established successfully!");
            //create statement
            try (Statement stmt = con.createStatement();) {
                // turning off AutoCommit
                con.setAutoCommit(false);
                //using addBatch()
                stmt.addBatch("INSERT INTO users(id , name , age , gender) VALUES (101 , 'Radha' , 23 ,'female')");
                stmt.addBatch("INSERT INTO users(id , name , age , gender) VALUES(102 , 'Mohan' , 32 , 'male')");
                stmt.executeBatch();
                con.commit();
                System.out.println("Batch executed successfully!");
            } catch (SQLException e) {
                try {
                    con.rollback();
                    System.out.println("Transaction rolled back!");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Operation Failed!");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Database operations Failed!");
            e.printStackTrace();
        }
    }
}
