
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB12 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "Ttewtewtew99.";

         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student(studentID,firstName,lastName,email,deptID)"
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedstament = connection.prepareStatement(sql);
            preparedstament.setString(1, "111111");
            preparedstament.setString(2, "aaaa");
            preparedstament.setString(3, "bbbb");
            preparedstament.setString(4, "aaaa@kmutt.ac.th");
            preparedstament.setString(5, "IT");
            preparedstament.executeUpdate();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
