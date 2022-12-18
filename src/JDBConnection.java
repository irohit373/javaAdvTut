import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.*;

public class JDBConnection {
    static{
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println("Unable to load MySQL Driver");
    }
}
    public static void main(String[] args) throws Exception {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "usbw");
            System.out.println("succeed");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from userdata");

            while (rs.next()) {
                    System.out.println(rs.getString(4));
            }


            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally{
        }
    }    
}
