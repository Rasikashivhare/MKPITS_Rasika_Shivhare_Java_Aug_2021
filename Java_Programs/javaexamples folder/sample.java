

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
            String qr="insert into students(student_name,course_name) values('maninder','java')";
            stmt.executeUpdate(qr);
            System.out.println("record saved successfully");

        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}