package main.model;

import javax.persistence.*;

@Entity
@Table(name = "membership_id", schema = "ECSC_SQL", catalog = "")
public class MembershipIdEntity {
    private int mid;
    private int fiscalYear;
    private Integer membershipId;
    private Boolean renew;
    private String memType;
    private Boolean selected;
    private Boolean lateRenew;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "MID")
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "FISCAL_YEAR")
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "MEMBERSHIP_ID")
    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }

    @Basic
    @Column(name = "RENEW")
    public Boolean getRenew() {
        return renew;
    }

    public void setRenew(Boolean renew) {
        this.renew = renew;
    }

    @Basic
    @Column(name = "MEM_TYPE")
    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    @Basic
    @Column(name = "SELECTED")
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Basic
    @Column(name = "LATE_RENEW")
    public Boolean getLateRenew() {
        return lateRenew;
    }

    public void setLateRenew(Boolean lateRenew) {
        this.lateRenew = lateRenew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembershipIdEntity that = (MembershipIdEntity) o;

        if (mid != that.mid) return false;
        if (fiscalYear != that.fiscalYear) return false;
        if (membershipId != null ? !membershipId.equals(that.membershipId) : that.membershipId != null) return false;
        if (renew != null ? !renew.equals(that.renew) : that.renew != null) return false;
        if (memType != null ? !memType.equals(that.memType) : that.memType != null) return false;
        if (selected != null ? !selected.equals(that.selected) : that.selected != null) return false;
        if (lateRenew != null ? !lateRenew.equals(that.lateRenew) : that.lateRenew != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + fiscalYear;
        result = 31 * result + (membershipId != null ? membershipId.hashCode() : 0);
        result = 31 * result + (renew != null ? renew.hashCode() : 0);
        result = 31 * result + (memType != null ? memType.hashCode() : 0);
        result = 31 * result + (selected != null ? selected.hashCode() : 0);
        result = 31 * result + (lateRenew != null ? lateRenew.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "MS_ID", referencedColumnName = "MS_ID", nullable = false)
    public MembershipEntity getMembershipByMsId() {
        return membershipByMsId;
    }

    public void setMembershipByMsId(MembershipEntity membershipByMsId) {
        this.membershipByMsId = membershipByMsId;
    }
}
