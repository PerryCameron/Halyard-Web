package main.model;

import javax.persistence.*;

@Entity
@Table(name = "slip", schema = "ECSC_SQL", catalog = "")
public class SlipEntity {
    private int slipId;
    private String slipNum;
    private Integer subleasedTo;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "SLIP_ID")
    public int getSlipId() {
        return slipId;
    }

    public void setSlipId(int slipId) {
        this.slipId = slipId;
    }

    @Basic
    @Column(name = "SLIP_NUM")
    public String getSlipNum() {
        return slipNum;
    }

    public void setSlipNum(String slipNum) {
        this.slipNum = slipNum;
    }

    @Basic
    @Column(name = "SUBLEASED_TO")
    public Integer getSubleasedTo() {
        return subleasedTo;
    }

    public void setSubleasedTo(Integer subleasedTo) {
        this.subleasedTo = subleasedTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SlipEntity that = (SlipEntity) o;

        if (slipId != that.slipId) return false;
        if (slipNum != null ? !slipNum.equals(that.slipNum) : that.slipNum != null) return false;
        if (subleasedTo != null ? !subleasedTo.equals(that.subleasedTo) : that.subleasedTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = slipId;
        result = 31 * result + (slipNum != null ? slipNum.hashCode() : 0);
        result = 31 * result + (subleasedTo != null ? subleasedTo.hashCode() : 0);
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
