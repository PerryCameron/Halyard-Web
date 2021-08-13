package main.dto;

import java.util.Date;
import java.util.List;

import main.model.Person;


public class MembershipDTO {
	
	int msid;
	
	int pid;
	
	private Date joinDate;
	
	String memType;
	
	String address;
	
	String city;
	
	String state;
	
	String zip;
	
	String primaryMember;
	
	private List<Person> people;
	
	public MembershipDTO(int msid, int pid, Date joinDate, String memType, String address, String city,
			String state, String zip, List<Person> people) {
		super();
		this.msid = msid;
		this.pid = pid;
		this.joinDate = joinDate;
		this.memType = memType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.people = people;
		this.primaryMember = setPrimaryMember();
	}

	public int getMsid() {
		return msid;
	}

	public void setMsid(int msid) {
		this.msid = msid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
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

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

	public String getPrimaryMember() {
		return primaryMember;
	}

	public String setPrimaryMember() {
		String primary = "";
		for(Person p: people) {
			if(p.getMemberType() == 1) primary = p.getFirstName() + " " + p.getLastName();
		}
		return primary;
	}
}
