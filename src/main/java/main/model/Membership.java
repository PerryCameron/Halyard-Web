package main.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "membership")
public class Membership {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ms_id")
	int msid;
	
	@Column(name="p_id")
	int pid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="join_date")
	private Date joinDate;
	
	@Column(name="mem_type")
	String memType;
	
	String address;
	
	String city;
	
	String state;
	
	String zip;

	//targetEntity=Person.class
	@OneToMany(targetEntity=Person.class, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Person> people;

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

//	public List<Person> getPeople() {
//		return people;
//	}
//
//	public void setPeople(List<Person> people) {
//		this.people = people;
//	}
	
}
