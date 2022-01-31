
import java.sql.*;
public class sample {
    public static void main(String[] arg){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    System.out.println("successfully connected");
            Statement stmt=con.createStatement();
            String qr="update students set course_name='html' where student_id=1 ";
            stmt.executeUpdate(qr);
            System.out.println("record updated successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}