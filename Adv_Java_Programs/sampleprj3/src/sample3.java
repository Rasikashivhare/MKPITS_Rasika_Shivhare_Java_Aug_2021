
import java.sql.*;
public class sample3 {
    public static void main(String[] arg){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    System.out.println("successfully connected");
            Statement stmt=con.createStatement();
            String qr="select * from students ";
            ResultSet rs= stmt.executeQuery(qr);
            while(rs.next()) {
                System.out.println("id " + rs.getInt(1) + " name " +
                        rs.getString(2) + "course " + rs.getString(3)) ;
            }
            con.close();
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}