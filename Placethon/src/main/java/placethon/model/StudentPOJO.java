package placethon.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StudentPOJO {
	private int stuid;
	private String stufullname;
	private String stuemail;
	private String stumobile;
	private String linkforresume;
	private String stugender;
	private String stupassword;
	private int stustatus;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getLinkforresume() {
		return linkforresume;
	}
	public void setLinkforresume(String linkforresume) {
		this.linkforresume = linkforresume;
	}
	public String getStufullname() {
		return stufullname;
	}
	public void setStufullname(String stufullname) {
		this.stufullname = stufullname;
	}
	public String getStuemail() {
		return stuemail;
	}
	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}
	public String getStumobile() {
		return stumobile;
	}
	public void setStumobile(String stumobile) {
		this.stumobile = stumobile;
	}
	public String getStugender() {
		return stugender;
	}
	public void setStugender(String stugender) {
		this.stugender = stugender;
	}
	public String getStupassword() {
		return stupassword;
	}
	public void setStupassword(String stupassword) throws NoSuchAlgorithmException {
		this.stupassword = encrypt(stupassword);
	}
	public String encrypt(String stupassword) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(StandardCharsets.UTF_8.encode(stupassword));
		return String.format("%032x", new BigInteger(1, md5.digest()));
	}
	public int getStustatus() {
		return stustatus;
	}
	public void setStustatus(int stustatus) {
		this.stustatus = stustatus;
	}
}
