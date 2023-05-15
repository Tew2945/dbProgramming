import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
public class LAB15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
        String username = "root";
        String password = "Ttewtewtew99.";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
            System.out.printf("%-12s\t", rsMetaData.getColumnName(i));
            System.out.println();
            while (resultSet.next()) {
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
            System.out.printf("%-12s\t", resultSet.getObject(i));
            System.out.println();
            }
            connection.close();
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
