import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnectivity {
        Connection con;
public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryManagementSystem","System","gill");
        //System.out.println("Connection Successful");
         return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Database Connection Unsuccessful!","Error",JOptionPane.ERROR_MESSAGE);
            return null;
        }
}
}
