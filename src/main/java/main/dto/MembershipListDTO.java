package main.dto;

import java.util.Date;


public class MembershipListDTO {
	
	int ms_id;
	
	int p_id;
	
	private Date join_date;
	
	String mem_type;
	
	String address;
	
	String city;
	
	String state;
	
	String zip;
	
	String f_name;

	String l_name;

	public MembershipListDTO() {
	}

	public MembershipListDTO(int ms_id, int p_id, Date join_date, String mem_type, String address, String city,
			String state, String zip, String f_name, String l_name) {
		this.ms_id = ms_id;
		this.p_id = p_id;
		this.join_date = join_date;
		this.mem_type = mem_type;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.f_name = f_name;
		this.l_name = l_name;
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

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
}
