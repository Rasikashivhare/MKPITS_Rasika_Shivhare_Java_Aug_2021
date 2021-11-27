
import java.sql.*;
public class simple {
    public static void main(String[] arg){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    System.out.println("successfully connected");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}