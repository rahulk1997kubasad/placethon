package placethon.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecruiterDAO {
	public int regrecruiter(RecruiterPOJO recruiter) throws ClassNotFoundException, SQLException
	{
		int count=0;
		String sql1="select * from recruiter where recemail=?";
		Connection con=CreateConnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql1);
		stmt.setString(1, recruiter.getRecemail());
		ResultSet rst=stmt.executeQuery();
		if(rst.next())
		{
			count=-1;	
		}
		else
		{
			String sql="insert into recruiter(recemail,recfullname,reccompname,gender,recmobile,recpassword) values (?,?,?,?,?,?)";
			Connection con1=CreateConnection.getConnection();
			PreparedStatement prst=con1.prepareStatement(sql);
			prst.setString(1, recruiter.getRecemail());
			prst.setString(2, recruiter.getRecfullname());
			prst.setString(3, recruiter.getReccompname());
			prst.setString(4, recruiter.getGender());
			prst.setString(5, recruiter.getRecmobile());
			prst.setString(6, recruiter.getRecpassword());
			count=prst.executeUpdate();
		}
		return count;
	}
	public RecruiterPOJO logrecruiter(String reclogemail,String reclogpassword) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException
	{
		String sql="select * from recruiter where recemail=? and recpassword=? and recstatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst1=con.prepareStatement(sql);
		prst1.setString(1, reclogemail);
		prst1.setString(2, encrypt(reclogpassword));
		ResultSet rs1=prst1.executeQuery();
		RecruiterPOJO recruiter=null;
		if(rs1.next())
		{
			recruiter= new RecruiterPOJO();
			recruiter.setRecid(rs1.getInt("recid"));
			recruiter.setRecfullname(rs1.getString("recfullname"));
            recruiter.setRecemail(rs1.getString("recemail"));
            recruiter.setReccompname(rs1.getString("reccompname"));
            recruiter.setRecmobile(rs1.getString("recmobile"));		}
		return recruiter;
	}
	public int updaterec(RecruiterPOJO rec)throws ClassNotFoundException, SQLException
	{
		int count=0;
		
		return count;
	}
	public String encrypt(String reclogpassword) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(StandardCharsets.UTF_8.encode(reclogpassword));
		return String.format("%032x", new BigInteger(1, md5.digest()));
	}
}
