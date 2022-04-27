package placethon.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class StudentDAO {
	public int regstudent(StudentPOJO student) throws ClassNotFoundException, SQLException
	{
		int count=0;
		String sql1="select * from student where stuemail=?";
		Connection con=CreateConnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql1);
		stmt.setString(1, student.getStuemail());
		ResultSet rst=stmt.executeQuery();
		if(rst.next())
		{
			count=-1;
		}
		else
		{
			String sql="insert into student(stufullname,stuemail,stumobile,stugender,stupassword) values (?,?,?,?,?)";
			Connection con1=CreateConnection.getConnection();
			PreparedStatement prst=con1.prepareStatement(sql);
			prst.setString(1,student.getStufullname());
			prst.setString(2, student.getStuemail());
			prst.setString(3, student.getStumobile());
			prst.setString(4, student.getStugender());
			prst.setString(5, student.getStupassword());
			count=prst.executeUpdate();
		}
		return count;
	}
	public StudentPOJO logstudent(String stulogemail,String stulogpassword) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException
	{
		
		String sql="select * from student where stuemail=? and stupassword=? and stustatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setString(1, stulogemail);
		prst.setString(2,encrypt(stulogpassword));
		ResultSet rs=prst.executeQuery();
		StudentPOJO student=null;
		if(rs.next())
		{
			student= new StudentPOJO();
			student.setStuid(rs.getInt("stuid"));
			student.setStufullname(rs.getString("stufullname"));
            student.setStuemail(rs.getString("stuemail"));
            student.setStumobile(rs.getString("stumobile"));
            student.setStugender(rs.getString("stugender"));
            student.setLinkforresume(rs.getString("linkforresume"));	
		}
		return student;
	}
	public int showprofileofstudent(StudentPOJO student) throws ClassNotFoundException, SQLException
	{
		int count=0;
		String sql="update student set stufullname=?, stuemail=?, stumobile=? , linkforresume=? where stuid=?";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setString(1,student.getStufullname());
		prst.setString(2,student.getStuemail());
		prst.setString(3,student.getStumobile());
		prst.setString(4, student.getLinkforresume());
		prst.setInt(5, student.getStuid());
		
		count=prst.executeUpdate();
		return count;
	}
	public List<StudentPOJO> liststuofpartidrive(int driveid) throws ClassNotFoundException ,SQLException
	{
		String sql="select * from student as s join applieddrives as ad where ad.stuid=s.stuid and ad.driveid=?";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, driveid);
		ResultSet rs=prst.executeQuery();
		StudentPOJO students=null;
		List<StudentPOJO> studentdetails=new ArrayList<StudentPOJO>();
		while(rs.next())
		{
			students=new StudentPOJO();
			students.setStuemail(rs.getString("stuemail"));
			students.setStufullname(rs.getString("stufullname"));
			students.setStumobile(rs.getString("stumobile"));
			students.setLinkforresume(rs.getString("linkforresume"));
			studentdetails.add(students);
		}
		return studentdetails;
	}
	public List<StudentPOJO> Editstubyadmin() throws ClassNotFoundException, SQLException
	{
		String sql="select * from student";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		StudentPOJO students=null;
		List<StudentPOJO> studentdetails=new ArrayList<StudentPOJO>();
		while(rs.next())
		{
			students=new StudentPOJO();
			students.setStuid(rs.getInt("stuid"));
			students.setStuemail(rs.getString("stuemail"));
			students.setStufullname(rs.getString("stufullname"));
			students.setStumobile(rs.getString("stumobile"));
			students.setStustatus(rs.getInt("stustatus"));
			studentdetails.add(students);
		}
		return studentdetails;
	}
	public StudentPOJO showsinglestutoadmin(int stuid) throws ClassNotFoundException, SQLException, NoSuchAlgorithmException
	{
		
		String sql="select * from student where stuid=? and stustatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, stuid);
		ResultSet rs=prst.executeQuery();
		StudentPOJO student=null;
		if(rs.next())
		{
			student= new StudentPOJO();
			student.setStuid(rs.getInt("stuid"));
			student.setStufullname(rs.getString("stufullname"));
            student.setStuemail(rs.getString("stuemail"));
            student.setStumobile(rs.getString("stumobile"));
            student.setStugender(rs.getString("stugender"));
            student.setLinkforresume(rs.getString("linkforresume"));
		}
		return student;
	}
	public String encrypt(String stulogpassword) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(StandardCharsets.UTF_8.encode(stulogpassword));
		return String.format("%032x", new BigInteger(1, md5.digest()));
	}
}
