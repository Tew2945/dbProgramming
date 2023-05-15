
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "Ttewtewtew99.";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "insert into stundent(studentID,firstName,lastName,email,deptID) values ('11111','aaaa','bbbbb','aaa@gmail.com','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
