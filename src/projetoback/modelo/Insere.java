package projetoback.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Insere {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        Connection con2 = null;
        try {
           Class.forName("com.mysql.jdbc.Driver");

            String url1 = "jdbc:mysql://localhost:3306/backbit";
            String user = "root";
            String password = "";

            con = DriverManager.getConnection(url1, user, password);
            if (con != null) {
                System.out.println("Connected to the database test1");
            }

           
            String url2 = "jdbc:mysql://localhost:3306/aavikme?user=root&password=aa";
            con2 = DriverManager.getConnection(url2);
            if (con2 != null) {
                System.out.println("Connected to the database test2");
            }

            String url3 = "jdbc:mysql://localhost:3306/aavikme";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "aa");

   } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
   } catch (ClassNotFoundException e) {
   } finally {
           
        }
    }
}