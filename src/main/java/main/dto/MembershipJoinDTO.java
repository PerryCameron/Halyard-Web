package main.dto;

import java.io.Serializable;
import java.util.Date;

public class MembershipJoinDTO implements Serializable {
	
	int msid;
	int pid;
	Date joinDate;
	String lastName;
	String firstName;
	String address;
	String city;
	String state;
	String zip;
	
}
