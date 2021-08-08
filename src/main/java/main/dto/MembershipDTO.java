package main.dto;

import java.util.Date;


public class MembershipDTO {
	
	int msid;
	
	String primaryMember;
	
	private Date joinDate;
	
	String memType;
	
	String address;
	
	String city;
	
	String state;
	
	String zip;
	


	public MembershipDTO(int msid, String primaryMember, Date joinDate, String memType, String address, String city, String state,
			String zip) {
		super();
		this.msid = msid;
		this.primaryMember = primaryMember;
		this.joinDate = joinDate;
		this.memType = memType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}



	public int getMsid() {
		return msid;
	}



	public void setMsid(int msid) {
		this.msid = msid;
	}



	public String getPrimaryMember() {
		return primaryMember;
	}



	public void setPrimaryMember(String primaryMember) {
		this.primaryMember = primaryMember;
	}



	public Date getJoinDate() {
		return joinDate;
	}



	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}



	public String getMemType() {
		return memType;
	}



	public void setMemType(String memType) {
		this.memType = memType;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}

	
}
