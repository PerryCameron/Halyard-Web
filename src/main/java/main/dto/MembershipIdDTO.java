package main.dto;

public class MembershipIdDTO {

	private Integer mid;

	private Integer fiscalYear;

	private Integer ms_id;

	private Integer membershipId;

	private Boolean renew;

	private String memType;

	private Boolean selected;

	private Boolean late_renew;

	public MembershipIdDTO() {
	}

	public MembershipIdDTO(Integer mid, Integer fiscalYear, Integer ms_id, Integer membershipId, Boolean renew, String memType, Boolean selected, Boolean late_renew) {
		this.mid = mid;
		this.fiscalYear = fiscalYear;
		this.ms_id = ms_id;
		this.membershipId = membershipId;
		this.renew = renew;
		this.memType = memType;
		this.selected = selected;
		this.late_renew = late_renew;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(Integer fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public Integer getMs_id() {
		return ms_id;
	}

	public void setMs_id(Integer ms_id) {
		this.ms_id = ms_id;
	}

	public Integer getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(Integer membershipId) {
		this.membershipId = membershipId;
	}

	public Boolean getRenew() {
		return renew;
	}

	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public String getMemType() {
		return memType;
	}

	public void setMemType(String memType) {
		this.memType = memType;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public Boolean getLate_renew() {
		return late_renew;
	}

	public void setLate_renew(Boolean late_renew) {
		this.late_renew = late_renew;
	}

	@Override
	public String toString() {
		return "MembershipIdDTO{" +
				"mid=" + mid +
				", fiscalYear=" + fiscalYear +
				", ms_id=" + ms_id +
				", membershipId=" + membershipId +
				", renew=" + renew +
				", memType='" + memType + '\'' +
				", selected=" + selected +
				", late_renew=" + late_renew +
				'}';
	}
}
