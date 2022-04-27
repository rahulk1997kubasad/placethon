package placethon.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApplieddriveDAO {
	public int Addapplieddrive(ApplieddrivePOJO adrive) throws ClassNotFoundException, SQLException
	{
		int count=0;
		String sql1="select * from applieddrives where driveid=? and stuid=?";
		Connection con=CreateConnection.getConnection();
		PreparedStatement stmt=con.prepareStatement(sql1);
		stmt.setInt(1, adrive.getDriveid());
		stmt.setInt(2, adrive.getStuid());
		ResultSet rst=stmt.executeQuery();
		if(rst.next())
		{
			count=-1;	
		}
		else
		{
			String sql="insert into applieddrives(driveid,recid,stuid) values (?,?,?)";
			Connection con1=CreateConnection.getConnection();
			PreparedStatement prst=con1.prepareStatement(sql);
			prst.setInt(1, adrive.getDriveid());
			prst.setInt(2, adrive.getRecid());
			prst.setInt(3, adrive.getStuid());
			count=prst.executeUpdate();
		}
		return count;
	}
}
