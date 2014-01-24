
package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    
    
    public Connection getConnection() throws InstantiationException, IllegalAccessException, SQLException{
        Connection con = null;
                Statement stmt = null; 
                ResultSet rs = null;

                String conUrl = "jdbc:mysql://localhost/";
                String driverName = "com.mysql.jdbc.Driver";
                String databaseName = "modelowaniewycieczek";
                String usrName = "ela";
                String usrPass = "ela";
                try {
                        // Loading Driver
                        Class.forName(driverName). newInstance();
                } catch (ClassNotFoundException e) {
                        System.out.println(e.toString());
                }
                try {
                        // Getting Connection
                        con = DriverManager.getConnection(conUrl + databaseName, usrName,
                                        usrPass);
                        
                        stmt = con.createStatement();
                        stmt.execute("set names 'utf8'");
                        String query = "SELECT * FROM  miejscenoclegowe";

                      rs= stmt.executeQuery(query);
                          System.out.println("zapytanie wykonane");
                   while (rs.next()) {
                    
                System.out.println(rs.getString(1));
                 System.out.println(rs.getString(2));
                  System.out.println(rs.getString(3));
                   System.out.println(rs.getString(4));
            }

                } catch (Exception e) {
                        System.out.println(e.toString());
                } finally {

                }
                return con;
    }
        public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException {
                
        }
}