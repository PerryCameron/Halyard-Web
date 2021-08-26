package main.dto;

import main.model.PersonEntity;

import java.util.Date;
import java.util.List;


public class MembershipListDTO {

	private int ms_id;

	private int membership_id;

	private Date join_date;

	private String fname;

	private String lname;

	private String mem_type;

	private String address;

	private String city;

	private String state;

	private String zip;


	public MembershipListDTO() {
	}

	public MembershipListDTO(int ms_id, int membership_id, Date join_date, String fname, String lname, String mem_type, String address, String city, String state, String zip) {
		this.ms_id = ms_id;
		this.membership_id = membership_id;
		this.join_date = join_date;
		this.fname = fname;
		this.lname = lname;
		this.mem_type = mem_type;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	private String getPrimaryPerson(List<PersonEntity> people) {
		String primaryPerson = "";
		for(PersonEntity p: people) {
			if(p.getMemberType() == 1) primaryPerson = p.getfName() + " " + p.getlName();
		}
		return primaryPerson;
	}


	public int getMs_id() {
		return ms_id;
	}


	public void setMs_id(int ms_id) {
		this.ms_id = ms_id;
	}


	public Date getJoin_date() {
		return join_date;
	}


	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}


	public String getMem_type() {
		return mem_type;
	}


	public void setMem_type(String mem_type) {
		this.mem_type = mem_type;
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

	public int getMembership_id() {
		return membership_id;
	}

	public void setMembership_id(int membership_id) {
		this.membership_id = membership_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
}
