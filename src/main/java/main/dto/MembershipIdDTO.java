package main.dto;

import main.model.PersonEntity;

import java.util.Date;
import java.util.List;


public class MembershipIdDTO {

	private int mid;

	private int fiscalYear;

	private int membershipId;

	private Boolean renew;

	private String memType;

	private Boolean selected;

	private int ms_id;

	private int p_id;

	private Date join_date;

	private String address;

	private String city;

	private String state;

	private String zip;

//	private String fName;
//
//	private String lName;

	public MembershipIdDTO() {
	}

	public MembershipIdDTO(int mid, int fiscalYear, int membershipId, Boolean renew, String memType, Boolean selected,
						   int ms_id, int p_id, Date join_date, String address, String city, String state, String zip) {
		this.mid = mid;
		this.fiscalYear = fiscalYear;
		this.membershipId = membershipId;
		this.renew = renew;
		this.memType = memType;
		this.selected = selected;
		this.ms_id = ms_id;
		this.p_id = p_id;
		this.join_date = join_date;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
//		this.fName = fName;
//		this.lName = lName;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(int fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public Boolean getRenew() {
		return renew;
	}

	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public String getMemType() {
		return memType;
	}

	public void setMemType(String memType) {
		this.memType = memType;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public int getMs_id() {
		return ms_id;
	}

	public void setMs_id(int ms_id) {
		this.ms_id = ms_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
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

//	public String getfName() {
//		return fName;
//	}
//
//	public void setfName(String fName) {
//		this.fName = fName;
//	}
//
//	public String getlName() {
//		return lName;
//	}
//
//	public void setlName(String lName) {
//		this.lName = lName;
//	}
}
