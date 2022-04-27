package placethon.model;
import java.sql.*;
public class CreateConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con= null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placethon","root","");
		return con;
	}
}
