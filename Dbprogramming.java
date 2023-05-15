
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author user
 */
public class Dbprogramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username="root";
        String password="Ttewtewtew99.";
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con= DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement= con.createStatement();
            String sql = "select * from stundent";
            ResultSet results = statement.executeQuery(sql);
            
            while (results.next()){
                System.out.println(results.getString(1)+" "+results.getString(2)+" "+results.getString(3)+" "+results.getString(4));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
