package main.model;

import javax.persistence.*;

@Entity
@Table(name = "awards", schema = "ECSC_SQL")
public class AwardsEntity {
    private int awardId;
    private String awardYear;
    private String awardType;

    @Id
    @Column(name = "AWARD_ID")
    public int getAwardId() {
        return awardId;
    }

    public void setAwardId(int awardId) {
        this.awardId = awardId;
    }

    @Basic
    @Column(name = "AWARD_YEAR")
    public String getAwardYear() {
        return awardYear;
    }

    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    @Basic
    @Column(name = "AWARD_TYPE")
    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AwardsEntity that = (AwardsEntity) o;

        if (awardId != that.awardId) return false;
        if (awardYear != null ? !awardYear.equals(that.awardYear) : that.awardYear != null) return false;
        if (awardType != null ? !awardType.equals(that.awardType) : that.awardType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = awardId;
        result = 31 * result + (awardYear != null ? awardYear.hashCode() : 0);
        result = 31 * result + (awardType != null ? awardType.hashCode() : 0);
        return result;
    }
}
