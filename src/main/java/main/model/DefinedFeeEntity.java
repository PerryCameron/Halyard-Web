package main.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "defined_fee", schema = "ECSC_SQL", catalog = "")
public class DefinedFeeEntity {
    private Integer fiscalYear;
    private BigDecimal duesRegular;
    private BigDecimal duesFamily;
    private BigDecimal duesLakeAssociate;
    private BigDecimal duesSocial;
    private BigDecimal initiation;
    private BigDecimal wetSlip;
    private BigDecimal beach;
    private BigDecimal winterStorage;
    private BigDecimal mainGateKey;
    private BigDecimal sailLoft;
    private BigDecimal sailLoftKey;
    private BigDecimal sailSchoolLaserLoft;
    private BigDecimal sailSchoolLoftKey;
    private BigDecimal kayakRack;
    private BigDecimal kayakShed;
    private BigDecimal kayakShedKey;
    private BigDecimal workCredit;

    @Id
    @Column(name = "FISCAL_YEAR")
    public  Integer getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Integer fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    @Basic
    @Column(name = "DUES_REGULAR")
    public BigDecimal getDuesRegular() {
        return duesRegular;
    }

    public void setDuesRegular(BigDecimal duesRegular) {
        this.duesRegular = duesRegular;
    }

    @Basic
    @Column(name = "DUES_FAMILY")
    public BigDecimal getDuesFamily() {
        return duesFamily;
    }

    public void setDuesFamily(BigDecimal duesFamily) {
        this.duesFamily = duesFamily;
    }

    @Basic
    @Column(name = "DUES_LAKE_ASSOCIATE")
    public BigDecimal getDuesLakeAssociate() {
        return duesLakeAssociate;
    }

    public void setDuesLakeAssociate(BigDecimal duesLakeAssociate) {
        this.duesLakeAssociate = duesLakeAssociate;
    }

    @Basic
    @Column(name = "DUES_SOCIAL")
    public BigDecimal getDuesSocial() {
        return duesSocial;
    }

    public void setDuesSocial(BigDecimal duesSocial) {
        this.duesSocial = duesSocial;
    }

    @Basic
    @Column(name = "INITIATION")
    public BigDecimal getInitiation() {
        return initiation;
    }

    public void setInitiation(BigDecimal initiation) {
        this.initiation = initiation;
    }

    @Basic
    @Column(name = "WET_SLIP")
    public BigDecimal getWetSlip() {
        return wetSlip;
    }

    public void setWetSlip(BigDecimal wetSlip) {
        this.wetSlip = wetSlip;
    }

    @Basic
    @Column(name = "BEACH")
    public BigDecimal getBeach() {
        return beach;
    }

    public void setBeach(BigDecimal beach) {
        this.beach = beach;
    }

    @Basic
    @Column(name = "WINTER_STORAGE")
    public BigDecimal getWinterStorage() {
        return winterStorage;
    }

    public void setWinterStorage(BigDecimal winterStorage) {
        this.winterStorage = winterStorage;
    }

    @Basic
    @Column(name = "MAIN_GATE_KEY")
    public BigDecimal getMainGateKey() {
        return mainGateKey;
    }

    public void setMainGateKey(BigDecimal mainGateKey) {
        this.mainGateKey = mainGateKey;
    }

    @Basic
    @Column(name = "SAIL_LOFT")
    public BigDecimal getSailLoft() {
        return sailLoft;
    }

    public void setSailLoft(BigDecimal sailLoft) {
        this.sailLoft = sailLoft;
    }

    @Basic
    @Column(name = "SAIL_LOFT_KEY")
    public BigDecimal getSailLoftKey() {
        return sailLoftKey;
    }

    public void setSailLoftKey(BigDecimal sailLoftKey) {
        this.sailLoftKey = sailLoftKey;
    }

    @Basic
    @Column(name = "SAIL_SCHOOL_LASER_LOFT")
    public BigDecimal getSailSchoolLaserLoft() {
        return sailSchoolLaserLoft;
    }

    public void setSailSchoolLaserLoft(BigDecimal sailSchoolLaserLoft) {
        this.sailSchoolLaserLoft = sailSchoolLaserLoft;
    }

    @Basic
    @Column(name = "SAIL_SCHOOL_LOFT_KEY")
    public BigDecimal getSailSchoolLoftKey() {
        return sailSchoolLoftKey;
    }

    public void setSailSchoolLoftKey(BigDecimal sailSchoolLoftKey) {
        this.sailSchoolLoftKey = sailSchoolLoftKey;
    }

    @Basic
    @Column(name = "KAYAK_RACK")
    public BigDecimal getKayakRack() {
        return kayakRack;
    }

    public void setKayakRack(BigDecimal kayakRack) {
        this.kayakRack = kayakRack;
    }

    @Basic
    @Column(name = "KAYAK_SHED")
    public BigDecimal getKayakShed() {
        return kayakShed;
    }

    public void setKayakShed(BigDecimal kayakShed) {
        this.kayakShed = kayakShed;
    }

    @Basic
    @Column(name = "KAYAK_SHED_KEY")
    public BigDecimal getKayakShedKey() {
        return kayakShedKey;
    }

    public void setKayakShedKey(BigDecimal kayakShedKey) {
        this.kayakShedKey = kayakShedKey;
    }

    @Basic
    @Column(name = "WORK_CREDIT")
    public BigDecimal getWorkCredit() {
        return workCredit;
    }

    public void setWorkCredit(BigDecimal workCredit) {
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
