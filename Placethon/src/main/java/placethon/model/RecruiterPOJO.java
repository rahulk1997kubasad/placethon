package placethon.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class RecruiterPOJO {
	private int recid;
	private String recemail;
	private String recfullname;
	private String reccompname;
	private String gender;
	private String recmobile;
	private String recpassword;
	private int recstatus;
	public int getRecid() {
		return recid;
	}
	public void setRecid(int recid) {
		this.recid = recid;
	}
	public String getRecemail() {
		return recemail;
	}
	public void setRecemail(String recemail) {
		this.recemail = recemail;
	}
	public String getRecfullname() {
		return recfullname;
	}
	public void setRecfullname(String recfullname) {
		this.recfullname = recfullname;
	}
	public String getReccompname() {
		return reccompname;
	}
	public void setReccompname(String reccompname) {
		this.reccompname = reccompname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRecmobile() {
		return recmobile;
	}
	public void setRecmobile(String recmobile) {
		this.recmobile = recmobile;
	}
	public String getRecpassword() {
		return recpassword;
	}
	public void setRecpassword(String recpassword) throws NoSuchAlgorithmException {
		this.recpassword = encrypt(recpassword);
	}
	public String encrypt(String recpassword) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(StandardCharsets.UTF_8.encode(recpassword));
		return String.format("%032x", new BigInteger(1, md5.digest()));
	}
	public int getRecstatus() {
		return recstatus;
	}
	public void setRecstatus(int recstatus) {
		this.recstatus = recstatus;
	}
}
