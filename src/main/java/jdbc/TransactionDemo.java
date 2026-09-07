package jdbc;

import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/transaction_db";
        String user = "postgres";
        String password = System.getenv("DB_PASSWORD");
        //create connection
        try (Connection con = DriverManager.getConnection(url, user, password);) {

            System.out.println("Congratulations! Connection established successfully!");
            // create preparedStatement
            try (PreparedStatement pstmt = con.prepareStatement("UPDATE account SET balance = balance -500 WHERE id = ?");
                 PreparedStatement pp = con.prepareStatement("UPDATE account SET balance = balance + 500 WHERE id = ?");) {
                //turning off auto-commit mode
                con.setAutoCommit(false);
                //set parameter placeholder
                pstmt.setInt(1, 101);
                pstmt.executeUpdate();
                pp.setInt(1, 102);
                pp.executeUpdate();
                con.commit();
                System.out.println("Transaction successfull!");
            } catch (SQLException e) {
                System.out.println("1st Transaction operations failed!");
                e.printStackTrace();
                con.rollback();
            }
            //create preparedStatement
            try (PreparedStatement ps = con.prepareStatement("UPDATE account SET balance = balance - 16000 WHERE id = ?");
                 PreparedStatement pps = con.prepareStatement("UPDATE accounts SET balance = balance + 16000 WHERE id = ?");) {

                //set parameter placeholder
                ps.setInt(1, 103);
                ps.executeUpdate();
                System.out.println("withdrawal operation executed!");
                pps.setInt(1, 104);
                pps.executeUpdate();
                con.commit();
                System.out.println("Transaction successfull!");
            } catch (SQLException e) {
                System.out.println("2nd Transaction operation failed!");
                e.printStackTrace();
                con.rollback();
            }
        } catch (SQLException e) {
            System.out.println("Database operations Failed!");
            e.printStackTrace();
        }
    }
}
