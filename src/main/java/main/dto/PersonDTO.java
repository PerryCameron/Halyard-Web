package main.dto;

import java.util.Date;

public class PersonDTO {
		
		int pid;
		
		int msid;
		
		int memberType;
		
		String firstName;
		
		String lastName;
		
		Date birthday;
		
		String occupation;
		
		String buisness;
		
		boolean isActive;
		
		String nickName;
		
		public PersonDTO() {
		}
		
		public PersonDTO(int pid, int msid, int memberType, String firstName, String lastName, Date birthday,
				String occupation, String buisness, boolean isActive, String nickName) {
			super();
			this.pid = pid;
			this.msid = msid;
			this.memberType = memberType;
			this.firstName = firstName;
			this.lastName = lastName;
			this.birthday = birthday;
			this.occupation = occupation;
			this.buisness = buisness;
			this.isActive = isActive;
			this.nickName = nickName;
		}

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
}
