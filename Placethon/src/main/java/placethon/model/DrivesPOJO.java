package placethon.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DrivesPOJO {
	private int driveid;
	private String drivedesc;
	private String drivelocation;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date drivestartdate;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date driveenddate;
	private String jobResponsibilities;
	private String criteria;
	private String CTC;
	private String experience;
	private String jobtype;
	private String driveprocess;
	private String companyname;
	private int recid;
	private int drivestatus;
	public int getDriveid() {
		return driveid;
	}
	public void setDriveid(int driveid) {
		this.driveid = driveid;
	}
	public String getDrivedesc() {
		return drivedesc;
	}
	public void setDrivedesc(String drivedesc) {
		this.drivedesc = drivedesc;
	}
	public String getDrivelocation() {
		return drivelocation;
	}
	public void setDrivelocation(String drivelocation) {
		this.drivelocation = drivelocation;
	}
	public Date getDrivestartdate() {
		return drivestartdate;
	}
	public void setDrivestartdate(Date drivestartdate) {
		this.drivestartdate = drivestartdate;
	}
	public Date getDriveenddate() {
		return driveenddate;
	}
	public void setDriveenddate(Date driveenddate) {
		this.driveenddate = driveenddate;
	}
	public String getJobResponsibilities() {
		return jobResponsibilities;
	}
	public void setJobResponsibilities(String jobResponsibilities) {
		this.jobResponsibilities = jobResponsibilities;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String CTC) {
		this.CTC = CTC;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public String getDriveprocess() {
		return driveprocess;
	}
	public void setDriveprocess(String driveprocess) {
		this.driveprocess = driveprocess;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getRecid() {
		return recid;
	}
	public void setRecid(int recid) {
		this.recid = recid;
	}
	public int getDrivestatus() {
		return drivestatus;
	}
	public void setDrivestatus(int drivestatus) {
		this.drivestatus = drivestatus;
	}
}
