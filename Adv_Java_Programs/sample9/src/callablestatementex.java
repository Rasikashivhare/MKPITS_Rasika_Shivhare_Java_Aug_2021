
import java.sql.*;
public class callablestatementex {
    static final String QUERY = "{call getEmpName (?, ?)}";
    //here getEmpName is stored procedure created in mysql
    public static void main(String[] arg) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/14_nov","root","");
// System.out.println("successfully connected");
            CallableStatement stmt=con.prepareCall(QUERY);
//binding parameters
            stmt.setInt(1,8);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.execute();
            String ename=stmt.getString(2);
            System.out.println("empname name for empno 2 is " + ename);
        }catch (Exception ee) {
        }
    }
}