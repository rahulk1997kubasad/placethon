package placethon.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
   public AdminPOJO AdminLogin(AdminPOJO admin) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException
   {
	   String sql="select * from admin where Adminemail = ? and Adminpassword = ?";   
	   Connection con=CreateConnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1, admin.getAdminemail());
		stmt.setString(2, encrypt(admin.getAdminpassword()));
		ResultSet rs= stmt.executeQuery();
		AdminPOJO admin1= null;
		if(rs.next()){
			admin1=new AdminPOJO();
			admin1.setAdminid(rs.getInt("Adminid"));
			admin1.setAdminemail(rs.getString("Adminemail"));
		}
		return admin1;
   	}
   	public String encrypt(String reclogpassword) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(StandardCharsets.UTF_8.encode(reclogpassword));
		return String.format("%032x", new BigInteger(1, md5.digest()));
	}
}
