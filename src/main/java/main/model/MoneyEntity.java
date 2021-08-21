package main.model;

import javax.persistence.*;


@Entity
@Table(name = "money", schema = "ECSC_SQL")
public class MoneyEntity {
    private int moneyId;
    private Integer fiscalYear;
    private Integer batch;
    private Integer officerCredit;
    private Integer extraKey;
    private Integer kayakShedKey;
    private Integer sailLoftKey;
    private Integer sailSchoolLoftKey;
    private Integer beach;
    private Integer wetSlip;
    private Integer kayakRack;
    private Integer kayakShed;
    private Integer sailLoft;
    private Integer sailSchoolLaserLoft;
    private Integer winterStorage;
    private Integer yscDonation;
    private Integer paid;
    private Integer total;
    private Integer credit;
    private Integer balance;
    private Integer dues;
    private Boolean commited;
    private Boolean closed;
    private Integer other;
    private Integer initiation;
    private Boolean supplemental;
    private MembershipEntity membershipByMsId;

    @Id
    @Column(name = "MONEY_ID")
    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    @Basic
    @Column(name = "FISCAL_YEAR")
    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "BATCH")
    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    @Basic
    @Column(name = "OFFICER_CREDIT")
    public Integer getOfficerCredit() {
        return officerCredit;
    }

    public void setOfficerCredit(Integer officerCredit) {
        this.officerCredit = officerCredit;
    }

    @Basic
    @Column(name = "EXTRA_KEY")
    public Integer getExtraKey() {
        return extraKey;
    }

    public void setExtraKey(Integer extraKey) {
        this.extraKey = extraKey;
    }

    @Basic
    @Column(name = "KAYAK_SHED_KEY")
    public Integer getKayakShedKey() {
        return kayakShedKey;
    }

    public void setKayakShedKey(Integer kayakShedKey) {
        this.kayakShedKey = kayakShedKey;
    }

    @Basic
    @Column(name = "SAIL_LOFT_KEY")
    public Integer getSailLoftKey() {
        return sailLoftKey;
    }

    public void setSailLoftKey(Integer sailLoftKey) {
        this.sailLoftKey = sailLoftKey;
    }

    @Basic
    @Column(name = "SAIL_SCHOOL_LOFT_KEY")
    public Integer getSailSchoolLoftKey() {
        return sailSchoolLoftKey;
    }

    public void setSailSchoolLoftKey(Integer sailSchoolLoftKey) {
        this.sailSchoolLoftKey = sailSchoolLoftKey;
    }

    @Basic
    @Column(name = "BEACH")
    public Integer getBeach() {
        return beach;
    }

    public void setBeach(Integer beach) {
        this.beach = beach;
    }

    @Basic
    @Column(name = "WET_SLIP")
    public Integer getWetSlip() {
        return wetSlip;
    }

    public void setWetSlip(Integer wetSlip) {
        this.wetSlip = wetSlip;
    }

    @Basic
    @Column(name = "KAYAK_RACK")
    public Integer getKayakRack() {
        return kayakRack;
    }

    public void setKayakRack(Integer kayakRack) {
        this.kayakRack = kayakRack;
    }

    @Basic
    @Column(name = "KAYAK_SHED")
    public Integer getKayakShed() {
        return kayakShed;
    }

    public void setKayakShed(Integer kayakShed) {
        this.kayakShed = kayakShed;
    }

    @Basic
    @Column(name = "SAIL_LOFT")
    public Integer getSailLoft() {
        return sailLoft;
    }

    public void setSailLoft(Integer sailLoft) {
        this.sailLoft = sailLoft;
    }

    @Basic
    @Column(name = "SAIL_SCHOOL_LASER_LOFT")
    public Integer getSailSchoolLaserLoft() {
        return sailSchoolLaserLoft;
    }

    public void setSailSchoolLaserLoft(Integer sailSchoolLaserLoft) {
        this.sailSchoolLaserLoft = sailSchoolLaserLoft;
    }

    @Basic
    @Column(name = "WINTER_STORAGE")
    public Integer getWinterStorage() {
        return winterStorage;
    }

    public void setWinterStorage(Integer winterStorage) {
        this.winterStorage = winterStorage;
    }

    @Basic
    @Column(name = "YSC_DONATION")
    public Integer getYscDonation() {
        return yscDonation;
    }

    public void setYscDonation(Integer yscDonation) {
        this.yscDonation = yscDonation;
    }

    @Basic
    @Column(name = "PAID")
    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    @Basic
    @Column(name = "TOTAL")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "CREDIT")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "BALANCE")
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "DUES")
    public Integer getDues() {
        return dues;
    }

    public void setDues(Integer dues) {
        this.dues = dues;
    }

    @Basic
    @Column(name = "COMMITED")
    public Boolean getCommited() {
        return commited;
    }

    public void setCommited(Boolean commited) {
        this.commited = commited;
    }

    @Basic
    @Column(name = "CLOSED")
    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @Basic
    @Column(name = "OTHER")
    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    @Basic
    @Column(name = "INITIATION")
    public Integer getInitiation() {
        return initiation;
    }

    public void setInitiation(Integer initiation) {
        this.initiation = initiation;
    }

    @Basic
    @Column(name = "SUPPLEMENTAL")
    public Boolean getSupplemental() {
        return supplemental;
    }

    public void setSupplemental(Boolean supplemental) {
        this.supplemental = supplemental;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoneyEntity that = (MoneyEntity) o;

        if (moneyId != that.moneyId) return false;
        if (fiscalYear != null ? !fiscalYear.equals(that.fiscalYear) : that.fiscalYear != null) return false;
        if (batch != null ? !batch.equals(that.batch) : that.batch != null) return false;
        if (officerCredit != null ? !officerCredit.equals(that.officerCredit) : that.officerCredit != null)
            return false;
        if (extraKey != null ? !extraKey.equals(that.extraKey) : that.extraKey != null) return false;
        if (kayakShedKey != null ? !kayakShedKey.equals(that.kayakShedKey) : that.kayakShedKey != null) return false;
        if (sailLoftKey != null ? !sailLoftKey.equals(that.sailLoftKey) : that.sailLoftKey != null) return false;
        if (sailSchoolLoftKey != null ? !sailSchoolLoftKey.equals(that.sailSchoolLoftKey) : that.sailSchoolLoftKey != null)
            return false;
        if (beach != null ? !beach.equals(that.beach) : that.beach != null) return false;
        if (wetSlip != null ? !wetSlip.equals(that.wetSlip) : that.wetSlip != null) return false;
        if (kayakRack != null ? !kayakRack.equals(that.kayakRack) : that.kayakRack != null) return false;
        if (kayakShed != null ? !kayakShed.equals(that.kayakShed) : that.kayakShed != null) return false;
        if (sailLoft != null ? !sailLoft.equals(that.sailLoft) : that.sailLoft != null) return false;
        if (sailSchoolLaserLoft != null ? !sailSchoolLaserLoft.equals(that.sailSchoolLaserLoft) : that.sailSchoolLaserLoft != null)
            return false;
        if (winterStorage != null ? !winterStorage.equals(that.winterStorage) : that.winterStorage != null)
            return false;
        if (yscDonation != null ? !yscDonation.equals(that.yscDonation) : that.yscDonation != null) return false;
        if (paid != null ? !paid.equals(that.paid) : that.paid != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (credit != null ? !credit.equals(that.credit) : that.credit != null) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;
        if (dues != null ? !dues.equals(that.dues) : that.dues != null) return false;
        if (commited != null ? !commited.equals(that.commited) : that.commited != null) return false;
        if (closed != null ? !closed.equals(that.closed) : that.closed != null) return false;
        if (other != null ? !other.equals(that.other) : that.other != null) return false;
        if (initiation != null ? !initiation.equals(that.initiation) : that.initiation != null) return false;
        if (supplemental != null ? !supplemental.equals(that.supplemental) : that.supplemental != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moneyId;
        result = 31 * result + (fiscalYear != null ? fiscalYear.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        result = 31 * result + (officerCredit != null ? officerCredit.hashCode() : 0);
        result = 31 * result + (extraKey != null ? extraKey.hashCode() : 0);
        result = 31 * result + (kayakShedKey != null ? kayakShedKey.hashCode() : 0);
        result = 31 * result + (sailLoftKey != null ? sailLoftKey.hashCode() : 0);
        result = 31 * result + (sailSchoolLoftKey != null ? sailSchoolLoftKey.hashCode() : 0);
        result = 31 * result + (beach != null ? beach.hashCode() : 0);
        result = 31 * result + (wetSlip != null ? wetSlip.hashCode() : 0);
        result = 31 * result + (kayakRack != null ? kayakRack.hashCode() : 0);
        result = 31 * result + (kayakShed != null ? kayakShed.hashCode() : 0);
        result = 31 * result + (sailLoft != null ? sailLoft.hashCode() : 0);
        result = 31 * result + (sailSchoolLaserLoft != null ? sailSchoolLaserLoft.hashCode() : 0);
        result = 31 * result + (winterStorage != null ? winterStorage.hashCode() : 0);
        result = 31 * result + (yscDonation != null ? yscDonation.hashCode() : 0);
        result = 31 * result + (paid != null ? paid.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (dues != null ? dues.hashCode() : 0);
        result = 31 * result + (commited != null ? commited.hashCode() : 0);
        result = 31 * result + (closed != null ? closed.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        result = 31 * result + (initiation != null ? initiation.hashCode() : 0);
        result = 31 * result + (supplemental != null ? supplemental.hashCode() : 0);
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
