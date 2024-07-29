// @author Fancysx

package DBConfig;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectDb {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        if (conn==null)
        {
            
            try {
               String jdbcDriver = "com.mysql.cj.jdbc.Driver";
               Class.forName(jdbcDriver);
               System.out.println("Class buat Connect Database berhasil dipanggil");
           } catch (ClassNotFoundException ex) {
               System.out.println("Class Error: " + ex.getMessage());
           }
            
            try
            {
                String dbUrl = "jdbc:mysql://localhost:3306/main_db_billingsys";
                String dbUser = "root";
                String dbPass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Koneksi ke db berhasil");
            } catch (Exception e) {
               Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE,null, e);
               System.out.println("Koneksi error: " + e.getMessage());
            }
        }
        return conn;
    }
}
