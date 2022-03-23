import java.sql.*;

public class JdbcTask1 {
  public static void main(String[] argv) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/org";
    String userName = "ShowBot";
    String password = "Rakesh@419";
    try{
        
        Connection conn = DriverManager.getConnection(url, userName, password);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from worker");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        conn.close();
    }catch(Exception e){
        System.out.println(e);
    }
    
  }
}