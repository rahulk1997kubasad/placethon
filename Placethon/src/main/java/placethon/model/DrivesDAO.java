package placethon.model;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class DrivesDAO 
{
	public int Adddrive(DrivesPOJO drive) throws ClassNotFoundException, SQLException
	{
		int count=0;
		String sql="insert into drives(drivedesc,drivelocation,drivestartdate,driveenddate,jobResponsibilities,criteria,CTC,experience,jobtype,driveprocess,companyname,recid) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con1=CreateConnection.getConnection();
		PreparedStatement prst=con1.prepareStatement(sql);
		prst.setString(1, drive.getDrivedesc());
		prst.setString(2, drive.getDrivelocation());
		prst.setDate(3,new Date(drive.getDrivestartdate().getTime()));
		prst.setDate(4, new Date(drive.getDriveenddate().getTime()));
		prst.setString(5, drive.getJobResponsibilities());
		prst.setString(6, drive.getCriteria());
		prst.setString(7, drive.getCTC());
		prst.setString(8, drive.getExperience());
		prst.setString(9, drive.getJobtype());
		prst.setString(10,drive.getDriveprocess());
		prst.setString(11, drive.getCompanyname());
		prst.setInt(12, drive.getRecid());
		count=prst.executeUpdate();
		return count;
	}
	public List<DrivesPOJO> Showalldrives() throws ClassNotFoundException, SQLException
	{
		String sql="select * from drives where drivestatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		ResultSet rs=prst.executeQuery();
		DrivesPOJO drives=null;
		List<DrivesPOJO> drives1=new ArrayList<DrivesPOJO>();
		while(rs.next())
		{
			drives= new DrivesPOJO();
			drives.setDriveid(rs.getInt("driveid"));
			drives.setDrivedesc(rs.getString("drivedesc"));
            drives.setDrivelocation(rs.getString("drivelocation"));
            drives.setCompanyname(rs.getString("companyname"));
            drives.setCTC(rs.getString("CTC"));
            drives1.add(drives);
		}
		return drives1;
	}
	//
	public DrivesPOJO Showsingledrive(int driveid) throws ClassNotFoundException, SQLException
	{
		String sql1="select * from drives where driveid=? and drivestatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql1);
		stmt.setInt(1, driveid);
		ResultSet rst=stmt.executeQuery();
		DrivesPOJO drives=null;
		if(rst.next())
		{	
			drives= new DrivesPOJO();
			drives.setDriveid(driveid);
			drives.setDrivedesc(rst.getString("drivedesc"));
			drives.setDrivelocation(rst.getString("drivelocation"));
			drives.setDrivestartdate(rst.getDate("drivestartdate"));
			drives.setDriveenddate(rst.getDate("driveenddate"));
			drives.setJobResponsibilities(rst.getString("jobResponsibilities"));
			drives.setCriteria(rst.getString("criteria"));
			drives.setCTC(rst.getString("CTC"));
			drives.setExperience(rst.getString("experience"));
			drives.setJobtype(rst.getString("jobtype"));
			drives.setDriveprocess(rst.getString("driveprocess"));
			drives.setCompanyname(rst.getString("companyname"));
			drives.setRecid(rst.getInt("recid"));
		}
		return drives;
	}
	//to show the drives that is applied by a particular student
	public List<DrivesPOJO> Showalldrivesofstudent(int stuid) throws ClassNotFoundException, SQLException
	{
		String sql="select * from drives as d join applieddrives as ad on ad.stuid=? and ad.driveid=d.driveid and drivestatus=1 and adrivestatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, stuid);
		ResultSet rs=prst.executeQuery();
		DrivesPOJO studentdrive=null;
		List<DrivesPOJO> studentdrives=new ArrayList<DrivesPOJO>();
		while(rs.next())
		{
			studentdrive= new DrivesPOJO();
			studentdrive.setDriveid(rs.getInt("driveid"));
			studentdrive.setDrivedesc(rs.getString("drivedesc"));
			studentdrive.setDrivelocation(rs.getString("drivelocation"));
			studentdrive.setCompanyname(rs.getString("companyname"));
			studentdrive.setCTC(rs.getString("CTC"));
            studentdrives.add(studentdrive);
		}
		return studentdrives;
	}
	public List<DrivesPOJO> ShowalldrivesofRecruiter(int recid) throws ClassNotFoundException, SQLException
	{
		String sql="select * from drives where recid=? and drivestatus=1";
		Connection con=CreateConnection.getConnection();
		PreparedStatement prst=con.prepareStatement(sql);
		prst.setInt(1, recid);
		ResultSet rs=prst.executeQuery();
		DrivesPOJO recdrive=null;
		List<DrivesPOJO> recruiterdrives=new ArrayList<DrivesPOJO>();
		while(rs.next())
		{
			recdrive= new DrivesPOJO();
			recdrive.setDriveid(rs.getInt("driveid"));
			recdrive.setDrivedesc(rs.getString("drivedesc"));
			recdrive.setDrivelocation(rs.getString("drivelocation"));
			recdrive.setCompanyname(rs.getString("companyname"));
			recdrive.setCTC(rs.getString("CTC"));
            recruiterdrives.add(recdrive);
		}
		return recruiterdrives;
	}
}
