package main.model;

import javax.persistence.*;

@Entity
@Table(name = "officer", schema = "ECSC_SQL")
public class OfficerEntity {
    private int oId;
    private Integer boardYear;
    private String offType;
    private Integer offYear;

    @Id
    @Column(name = "O_ID")
    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    @Basic
    @Column(name = "BOARD_YEAR")
    public Integer getBoardYear() {
        return boardYear;
    }

    public void setBoardYear(Integer boardYear) {
        this.boardYear = boardYear;
    }

    @Basic
    @Column(name = "OFF_TYPE")
    public String getOffType() {
        return offType;
    }

    public void setOffType(String offType) {
        this.offType = offType;
    }

    @Basic
    @Column(name = "OFF_YEAR")
    public Integer getOffYear() {
        return offYear;
    }

    public void setOffYear(Integer offYear) {
        this.offYear = offYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficerEntity that = (OfficerEntity) o;

        if (oId != that.oId) return false;
        if (boardYear != null ? !boardYear.equals(that.boardYear) : that.boardYear != null) return false;
        if (offType != null ? !offType.equals(that.offType) : that.offType != null) return false;
        if (offYear != null ? !offYear.equals(that.offYear) : that.offYear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oId;
        result = 31 * result + (boardYear != null ? boardYear.hashCode() : 0);
        result = 31 * result + (offType != null ? offType.hashCode() : 0);
        result = 31 * result + (offYear != null ? offYear.hashCode() : 0);
        return result;
    }
}
