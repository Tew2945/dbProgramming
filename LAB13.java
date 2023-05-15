
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB13 {
    
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "Ttewtewtew99.";

         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "UPDATE student SET email=? "
                    + "WHERE studentID=?";
            PreparedStatement preparedstament = connection.prepareStatement(sql);
            preparedstament.setString(1, "NNNN@gmail.com");
            preparedstament.setString(2, "111111");
            preparedstament.executeUpdate();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
