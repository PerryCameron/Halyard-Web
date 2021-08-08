package main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="p_id")
	int pid;
	
//	@ManyToOne
//	@JoinColumn(name = "p_id", referencedColumnName = "p_id",insertable=false, updatable=false)
//	private Membership membership;
	
	@Column(name="ms_id")
	int msid;
	
	@Column(name="member_type")
	int memberType;
	
	@Column(name="f_name")
	String firstName;
	
	@Column(name="l_name")
	String lastName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date birthday;
	
	String occupation;
	
	String buisness;
	
	@Column(name="is_active")
	boolean isActive;
	
	@Column(name="nick_name")
	String nickName;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getMsid() {
		return msid;
	}

	public void setMsid(int msid) {
		this.msid = msid;
	}

	public int getMemberType() {
		return memberType;
	}

	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getBuisness() {
		return buisness;
	}

	public void setBuisness(String buisness) {
		this.buisness = buisness;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

//	public Membership getMembership() {
//		return membership;
//	}
//
//	public void setMembership(Membership membership) {
//		this.membership = membership;
//	}
//	
	
}
