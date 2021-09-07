package main.dto;

import java.util.Date;
import java.util.List;

import main.model.PersonEntity;


public class MembershipDTO {
	
	private Integer ms_id;
	
	private Integer p_id;
	
	private Date join_date;
	
	private String mem_type;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	//private List<PersonEntity> people;

	private String primaryPerson;


	public MembershipDTO() {
	}


	public MembershipDTO(Integer ms_id, Integer p_id, Date join_date, String mem_type, String address, String city,
		//	String state, String zip, List<PersonEntity> people) {
		String state, String zip) {
		this.ms_id = ms_id;
		this.p_id = p_id;
		this.join_date = join_date;
		this.mem_type = mem_type;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		//this.people = people;
//		this.primaryPerson = getPrimaryPerson(people);
	}


	private String getPrimaryPerson(List<PersonEntity> people) {
		String primaryPerson = "";
		for(PersonEntity p: people) {
			if(p.getMemberType() == 1) primaryPerson = p.getfName() + " " + p.getlName();
		}
		return primaryPerson;
	}


	public Integer getMs_id() {
		return ms_id;
	}


	public void setMs_id(Integer ms_id) {
		this.ms_id = ms_id;
	}


	public Integer getP_id() {
		return p_id;
	}


	public void setP_id(Integer p_id) {
		this.p_id = p_id;
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


//	public List<PersonEntity> getPeople() {
//		return people;
//	}
//
//
//	public void setPeople(List<PersonEntity> people) {
//		this.people = people;
//	}


	public String getPrimaryPerson() {
		return primaryPerson;
	}


	public void setPrimaryPerson(String primaryPerson) {
		this.primaryPerson = primaryPerson;
	}
	
}
