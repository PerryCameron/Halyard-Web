package main.model;

import javax.persistence.*;

@Entity
@Table(name = "defined_fee", schema = "ECSC_SQL", catalog = "")
public class DefinedFeeEntity {
    private Integer fiscalYear;
    private Integer duesRegular;
    private Integer duesFamily;
    private Integer duesLakeAssociate;
    private Integer duesSocial;
    private Integer initiation;
    private Integer wetSlip;
    private Integer beach;
    private Integer winterStorage;
    private Integer mainGateKey;
    private Integer sailLoft;
    private Integer sailLoftKey;
    private Integer sailSchoolLaserLoft;
    private Integer sailSchoolLoftKey;
    private Integer kayakRack;
    private Integer kayakShed;
    private Integer kayakShedKey;
    private Integer workCredit;

    @Id
    @Column(name = "FISCAL_YEAR")
    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "DUES_REGULAR")
    public Integer getDuesRegular() {
        return duesRegular;
    }

    public void setDuesRegular(Integer duesRegular) {
        this.duesRegular = duesRegular;
    }

    @Basic
    @Column(name = "DUES_FAMILY")
    public Integer getDuesFamily() {
        return duesFamily;
    }

    public void setDuesFamily(Integer duesFamily) {
        this.duesFamily = duesFamily;
    }

    @Basic
    @Column(name = "DUES_LAKE_ASSOCIATE")
    public Integer getDuesLakeAssociate() {
        return duesLakeAssociate;
    }

    public void setDuesLakeAssociate(Integer duesLakeAssociate) {
        this.duesLakeAssociate = duesLakeAssociate;
    }

    @Basic
    @Column(name = "DUES_SOCIAL")
    public Integer getDuesSocial() {
        return duesSocial;
    }

    public void setDuesSocial(Integer duesSocial) {
        this.duesSocial = duesSocial;
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
    @Column(name = "WET_SLIP")
    public Integer getWetSlip() {
        return wetSlip;
    }

    public void setWetSlip(Integer wetSlip) {
        this.wetSlip = wetSlip;
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
    @Column(name = "WINTER_STORAGE")
    public Integer getWinterStorage() {
        return winterStorage;
    }

    public void setWinterStorage(Integer winterStorage) {
        this.winterStorage = winterStorage;
    }

    @Basic
    @Column(name = "MAIN_GATE_KEY")
    public Integer getMainGateKey() {
        return mainGateKey;
    }

    public void setMainGateKey(Integer mainGateKey) {
        this.mainGateKey = mainGateKey;
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
    @Column(name = "SAIL_LOFT_KEY")
    public Integer getSailLoftKey() {
        return sailLoftKey;
    }

    public void setSailLoftKey(Integer sailLoftKey) {
        this.sailLoftKey = sailLoftKey;
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
    @Column(name = "SAIL_SCHOOL_LOFT_KEY")
    public Integer getSailSchoolLoftKey() {
        return sailSchoolLoftKey;
    }

    public void setSailSchoolLoftKey(Integer sailSchoolLoftKey) {
        this.sailSchoolLoftKey = sailSchoolLoftKey;
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
    @Column(name = "KAYAK_SHED_KEY")
    public Integer getKayakShedKey() {
        return kayakShedKey;
    }

    public void setKayakShedKey(Integer kayakShedKey) {
        this.kayakShedKey = kayakShedKey;
    }

    @Basic
    @Column(name = "WORK_CREDIT")
    public Integer getWorkCredit() {
        return workCredit;
    }

    public void setWorkCredit(Integer workCredit) {
        this.workCredit = workCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefinedFeeEntity that = (DefinedFeeEntity) o;

        if (fiscalYear != that.fiscalYear) return false;
        if (duesRegular != null ? !duesRegular.equals(that.duesRegular) : that.duesRegular != null) return false;
        if (duesFamily != null ? !duesFamily.equals(that.duesFamily) : that.duesFamily != null) return false;
        if (duesLakeAssociate != null ? !duesLakeAssociate.equals(that.duesLakeAssociate) : that.duesLakeAssociate != null)
            return false;
        if (duesSocial != null ? !duesSocial.equals(that.duesSocial) : that.duesSocial != null) return false;
        if (initiation != null ? !initiation.equals(that.initiation) : that.initiation != null) return false;
        if (wetSlip != null ? !wetSlip.equals(that.wetSlip) : that.wetSlip != null) return false;
        if (beach != null ? !beach.equals(that.beach) : that.beach != null) return false;
        if (winterStorage != null ? !winterStorage.equals(that.winterStorage) : that.winterStorage != null)
            return false;
        if (mainGateKey != null ? !mainGateKey.equals(that.mainGateKey) : that.mainGateKey != null) return false;
        if (sailLoft != null ? !sailLoft.equals(that.sailLoft) : that.sailLoft != null) return false;
        if (sailLoftKey != null ? !sailLoftKey.equals(that.sailLoftKey) : that.sailLoftKey != null) return false;
        if (sailSchoolLaserLoft != null ? !sailSchoolLaserLoft.equals(that.sailSchoolLaserLoft) : that.sailSchoolLaserLoft != null)
            return false;
        if (sailSchoolLoftKey != null ? !sailSchoolLoftKey.equals(that.sailSchoolLoftKey) : that.sailSchoolLoftKey != null)
            return false;
        if (kayakRack != null ? !kayakRack.equals(that.kayakRack) : that.kayakRack != null) return false;
        if (kayakShed != null ? !kayakShed.equals(that.kayakShed) : that.kayakShed != null) return false;
        if (kayakShedKey != null ? !kayakShedKey.equals(that.kayakShedKey) : that.kayakShedKey != null) return false;
        if (workCredit != null ? !workCredit.equals(that.workCredit) : that.workCredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fiscalYear;
        result = 31 * result + (duesRegular != null ? duesRegular.hashCode() : 0);
        result = 31 * result + (duesFamily != null ? duesFamily.hashCode() : 0);
        result = 31 * result + (duesLakeAssociate != null ? duesLakeAssociate.hashCode() : 0);
        result = 31 * result + (duesSocial != null ? duesSocial.hashCode() : 0);
        result = 31 * result + (initiation != null ? initiation.hashCode() : 0);
        result = 31 * result + (wetSlip != null ? wetSlip.hashCode() : 0);
        result = 31 * result + (beach != null ? beach.hashCode() : 0);
        result = 31 * result + (winterStorage != null ? winterStorage.hashCode() : 0);
        result = 31 * result + (mainGateKey != null ? mainGateKey.hashCode() : 0);
        result = 31 * result + (sailLoft != null ? sailLoft.hashCode() : 0);
        result = 31 * result + (sailLoftKey != null ? sailLoftKey.hashCode() : 0);
        result = 31 * result + (sailSchoolLaserLoft != null ? sailSchoolLaserLoft.hashCode() : 0);
        result = 31 * result + (sailSchoolLoftKey != null ? sailSchoolLoftKey.hashCode() : 0);
        result = 31 * result + (kayakRack != null ? kayakRack.hashCode() : 0);
        result = 31 * result + (kayakShed != null ? kayakShed.hashCode() : 0);
        result = 31 * result + (kayakShedKey != null ? kayakShedKey.hashCode() : 0);
        result = 31 * result + (workCredit != null ? workCredit.hashCode() : 0);
        return result;
    }
}
