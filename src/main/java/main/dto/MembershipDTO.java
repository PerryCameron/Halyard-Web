package main.dto;

import java.util.Date;
import java.util.List;

import main.model.Person;


public class MembershipDTO {
	
	int ms_id;
	
	int p_id;
	
	private Date join_date;
	
	String mem_type;
	
	String address;
	
	String city;
	
	String state;
	
	String zip;
	
	private List<Person> people;


	public MembershipDTO() {
	}


	public MembershipDTO(int ms_id, int p_id, Date join_date, String mem_type, String address, String city,
			String state, String zip, List<Person> people) {
		this.ms_id = ms_id;
		this.p_id = p_id;
		this.join_date = join_date;
		this.mem_type = mem_type;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.people = people;
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


	public List<Person> getPeople() {
		return people;
	}


	public void setPeople(List<Person> people) {
		this.people = people;
	}


	
}
