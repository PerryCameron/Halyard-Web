package main.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "stats", schema = "ECSC_SQL", catalog = "")
public class StatsEntity {
    private int statId;
    private int fiscalYear;
    private Integer activeMemberships;
    private Integer nonRenew;
    private Integer returnMembers;
    private Integer newMembers;
    private Integer secondaryMembers;
    private Integer dependants;
    private Integer numberOfBoats;
    private Integer family;
    private Integer regular;
    private Integer social;
    private Integer lakeassociates;
    private Integer lifemembers;
    private Integer racefellows;
    private Integer student;
    private BigDecimal deposits;
    private BigDecimal iniation;

    @Id
    @Column(name = "STAT_ID")
    public int getStatId() {
        return statId;
    }

    public void setStatId(int statId) {
        this.statId = statId;
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
    @Column(name = "ACTIVE_MEMBERSHIPS")
    public Integer getActiveMemberships() {
        return activeMemberships;
    }

    public void setActiveMemberships(Integer activeMemberships) {
        this.activeMemberships = activeMemberships;
    }

    @Basic
    @Column(name = "NON_RENEW")
    public Integer getNonRenew() {
        return nonRenew;
    }

    public void setNonRenew(Integer nonRenew) {
        this.nonRenew = nonRenew;
    }

    @Basic
    @Column(name = "RETURN_MEMBERS")
    public Integer getReturnMembers() {
        return returnMembers;
    }

    public void setReturnMembers(Integer returnMembers) {
        this.returnMembers = returnMembers;
    }

    @Basic
    @Column(name = "NEW_MEMBERS")
    public Integer getNewMembers() {
        return newMembers;
    }

    public void setNewMembers(Integer newMembers) {
        this.newMembers = newMembers;
    }

    @Basic
    @Column(name = "SECONDARY_MEMBERS")
    public Integer getSecondaryMembers() {
        return secondaryMembers;
    }

    public void setSecondaryMembers(Integer secondaryMembers) {
        this.secondaryMembers = secondaryMembers;
    }

    @Basic
    @Column(name = "DEPENDANTS")
    public Integer getDependants() {
        return dependants;
    }

    public void setDependants(Integer dependants) {
        this.dependants = dependants;
    }

    @Basic
    @Column(name = "NUMBER_OF_BOATS")
    public Integer getNumberOfBoats() {
        return numberOfBoats;
    }

    public void setNumberOfBoats(Integer numberOfBoats) {
        this.numberOfBoats = numberOfBoats;
    }

    @Basic
    @Column(name = "FAMILY")
    public Integer getFamily() {
        return family;
    }

    public void setFamily(Integer family) {
        this.family = family;
    }

    @Basic
    @Column(name = "REGULAR")
    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    @Basic
    @Column(name = "SOCIAL")
    public Integer getSocial() {
        return social;
    }

    public void setSocial(Integer social) {
        this.social = social;
    }

    @Basic
    @Column(name = "LAKEASSOCIATES")
    public Integer getLakeassociates() {
        return lakeassociates;
    }

    public void setLakeassociates(Integer lakeassociates) {
        this.lakeassociates = lakeassociates;
    }

    @Basic
    @Column(name = "LIFEMEMBERS")
    public Integer getLifemembers() {
        return lifemembers;
    }

    public void setLifemembers(Integer lifemembers) {
        this.lifemembers = lifemembers;
    }

    @Basic
    @Column(name = "RACEFELLOWS")
    public Integer getRacefellows() {
        return racefellows;
    }

    public void setRacefellows(Integer racefellows) {
        this.racefellows = racefellows;
    }

    @Basic
    @Column(name = "STUDENT")
    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    @Basic
    @Column(name = "DEPOSITS")
    public BigDecimal getDeposits() {
        return deposits;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    @Basic
    @Column(name = "INIATION")
    public BigDecimal getIniation() {
        return iniation;
    }

    public void setIniation(BigDecimal iniation) {
        this.iniation = iniation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatsEntity that = (StatsEntity) o;

        if (statId != that.statId) return false;
        if (fiscalYear != that.fiscalYear) return false;
        if (activeMemberships != null ? !activeMemberships.equals(that.activeMemberships) : that.activeMemberships != null)
            return false;
        if (nonRenew != null ? !nonRenew.equals(that.nonRenew) : that.nonRenew != null) return false;
        if (returnMembers != null ? !returnMembers.equals(that.returnMembers) : that.returnMembers != null)
            return false;
        if (newMembers != null ? !newMembers.equals(that.newMembers) : that.newMembers != null) return false;
        if (secondaryMembers != null ? !secondaryMembers.equals(that.secondaryMembers) : that.secondaryMembers != null)
            return false;
        if (dependants != null ? !dependants.equals(that.dependants) : that.dependants != null) return false;
        if (numberOfBoats != null ? !numberOfBoats.equals(that.numberOfBoats) : that.numberOfBoats != null)
            return false;
        if (family != null ? !family.equals(that.family) : that.family != null) return false;
        if (regular != null ? !regular.equals(that.regular) : that.regular != null) return false;
        if (social != null ? !social.equals(that.social) : that.social != null) return false;
        if (lakeassociates != null ? !lakeassociates.equals(that.lakeassociates) : that.lakeassociates != null)
            return false;
        if (lifemembers != null ? !lifemembers.equals(that.lifemembers) : that.lifemembers != null) return false;
        if (racefellows != null ? !racefellows.equals(that.racefellows) : that.racefellows != null) return false;
        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        if (deposits != null ? !deposits.equals(that.deposits) : that.deposits != null) return false;
        if (iniation != null ? !iniation.equals(that.iniation) : that.iniation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = statId;
        result = 31 * result + fiscalYear;
        result = 31 * result + (activeMemberships != null ? activeMemberships.hashCode() : 0);
        result = 31 * result + (nonRenew != null ? nonRenew.hashCode() : 0);
        result = 31 * result + (returnMembers != null ? returnMembers.hashCode() : 0);
        result = 31 * result + (newMembers != null ? newMembers.hashCode() : 0);
        result = 31 * result + (secondaryMembers != null ? secondaryMembers.hashCode() : 0);
        result = 31 * result + (dependants != null ? dependants.hashCode() : 0);
        result = 31 * result + (numberOfBoats != null ? numberOfBoats.hashCode() : 0);
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (regular != null ? regular.hashCode() : 0);
        result = 31 * result + (social != null ? social.hashCode() : 0);
        result = 31 * result + (lakeassociates != null ? lakeassociates.hashCode() : 0);
        result = 31 * result + (lifemembers != null ? lifemembers.hashCode() : 0);
        result = 31 * result + (racefellows != null ? racefellows.hashCode() : 0);
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (deposits != null ? deposits.hashCode() : 0);
        result = 31 * result + (iniation != null ? iniation.hashCode() : 0);
        return result;
    }
}
