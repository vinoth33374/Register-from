import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String url="jdbc:mysql://localhost:3306/userdb";
	private String uname="root";
	private String password="1234";
	private String drive="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String driver) {
		try {
			Class.forName(driver); 
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	public Connection getConnecion() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,uname,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert (Member m) 
	{
		loadDriver(drive);
		Connection con=getConnecion();
		String result="Data Entered Successfully";
		String sql="insert into member values (?,?,?,?)";
		PreparedStatement ps;
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1, m.getUname());
		ps.setString(2, m.getPassword());
		ps.setString(3, m.getEmail());
		ps.setString(4, m.getContact());
		ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			result="Data Not Entered";
		}
		return result; 
	}
}
