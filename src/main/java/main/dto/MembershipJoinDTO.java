package main.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


public class MembershipJoinDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1950427818471598762L;
	
	int msid;
	int pid;
	private Date joinDate;
	String memType;
	String address;
	String city;
	String state;
	String zip;
	String l_name;
	String f_name;
	
	
	
	public MembershipJoinDTO() {
	}
	
	public MembershipJoinDTO(int msid, int pid, Date joinDate, String memType, String address, String city,
			String state, String zip, String l_name, String f_name) {
		super();
		this.msid = msid;
		this.pid = pid;
		this.joinDate = joinDate;
		this.memType = memType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.l_name = l_name;
		this.f_name = f_name;
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
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	
}
