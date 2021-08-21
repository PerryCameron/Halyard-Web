package main.model;

import javax.persistence.*;

@Entity
@Table(name = "waitlist", schema = "ECSC_SQL")
public class WaitlistEntity {
    private int msId;
    private Boolean slipwait;
    private Boolean kayakrackwait;
    private Boolean shedwait;
    private Boolean wantsublease;
    private Boolean wantrelease;
    private Boolean wantslipchange;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "MS_ID")
    public int getMsId() {
        return msId;
    }

    public void setMsId(int msId) {
        this.msId = msId;
    }

    @Basic
    @Column(name = "SLIPWAIT")
    public Boolean getSlipwait() {
        return slipwait;
    }

    public void setSlipwait(Boolean slipwait) {
        this.slipwait = slipwait;
    }

    @Basic
    @Column(name = "KAYAKRACKWAIT")
    public Boolean getKayakrackwait() {
        return kayakrackwait;
    }

    public void setKayakrackwait(Boolean kayakrackwait) {
        this.kayakrackwait = kayakrackwait;
    }

    @Basic
    @Column(name = "SHEDWAIT")
    public Boolean getShedwait() {
        return shedwait;
    }

    public void setShedwait(Boolean shedwait) {
        this.shedwait = shedwait;
    }

    @Basic
    @Column(name = "WANTSUBLEASE")
    public Boolean getWantsublease() {
        return wantsublease;
    }

    public void setWantsublease(Boolean wantsublease) {
        this.wantsublease = wantsublease;
    }

    @Basic
    @Column(name = "WANTRELEASE")
    public Boolean getWantrelease() {
        return wantrelease;
    }

    public void setWantrelease(Boolean wantrelease) {
        this.wantrelease = wantrelease;
    }

    @Basic
    @Column(name = "WANTSLIPCHANGE")
    public Boolean getWantslipchange() {
        return wantslipchange;
    }

    public void setWantslipchange(Boolean wantslipchange) {
        this.wantslipchange = wantslipchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WaitlistEntity that = (WaitlistEntity) o;

        if (msId != that.msId) return false;
        if (slipwait != null ? !slipwait.equals(that.slipwait) : that.slipwait != null) return false;
        if (kayakrackwait != null ? !kayakrackwait.equals(that.kayakrackwait) : that.kayakrackwait != null)
            return false;
        if (shedwait != null ? !shedwait.equals(that.shedwait) : that.shedwait != null) return false;
        if (wantsublease != null ? !wantsublease.equals(that.wantsublease) : that.wantsublease != null) return false;
        if (wantrelease != null ? !wantrelease.equals(that.wantrelease) : that.wantrelease != null) return false;
        if (wantslipchange != null ? !wantslipchange.equals(that.wantslipchange) : that.wantslipchange != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = msId;
        result = 31 * result + (slipwait != null ? slipwait.hashCode() : 0);
        result = 31 * result + (kayakrackwait != null ? kayakrackwait.hashCode() : 0);
        result = 31 * result + (shedwait != null ? shedwait.hashCode() : 0);
        result = 31 * result + (wantsublease != null ? wantsublease.hashCode() : 0);
        result = 31 * result + (wantrelease != null ? wantrelease.hashCode() : 0);
        result = 31 * result + (wantslipchange != null ? wantslipchange.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "MS_ID", referencedColumnName = "MS_ID", nullable = false)
    public MembershipEntity getMembershipByMsId() {
        return membershipByMsId;
    }

    public void setMembershipByMsId(MembershipEntity membershipByMsId) {
        this.membershipByMsId = membershipByMsId;
    }
}
